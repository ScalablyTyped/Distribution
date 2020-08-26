package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#core/layout
  */
@js.native
trait CoreLayout extends js.Object {
  def createLayout(options: LayoutOptions): Layouts = js.native
  /**
    * Run a layout, which algorithmically positions the nodes in the graph.
    * For layouts included with Cytoscape.js, you can find their
    * options documented in the Layouts section.
    * For external layouts, please refer to their accompanying documentation.
    *
    * An analogue to run a layout on a subset of the graph exists as eles.layout().
    * http://js.cytoscape.org/#cy.layout
    */
  def layout(layout: LayoutOptions): Layouts = js.native
  /**
    * Get a new layout, which can be used to algorithmically
    * position the nodes in the graph.
    *
    * You must specify options.name with the name of the layout you wish to use.
    *
    * This function creates and returns a layout object.
    * You may want to keep a reference to the layout for more advanced usecases,
    * such as running multiple layouts simultaneously.
    * Note that you must call layout.run() in order for it to affect the graph.
    * An analogue to make a layout on a subset of the graph exists as eles.makeLayout().
    */
  def makeLayout(options: LayoutOptions): Layouts = js.native
}

object CoreLayout {
  @scala.inline
  def apply(
    createLayout: LayoutOptions => Layouts,
    layout: LayoutOptions => Layouts,
    makeLayout: LayoutOptions => Layouts
  ): CoreLayout = {
    val __obj = js.Dynamic.literal(createLayout = js.Any.fromFunction1(createLayout), layout = js.Any.fromFunction1(layout), makeLayout = js.Any.fromFunction1(makeLayout))
    __obj.asInstanceOf[CoreLayout]
  }
  @scala.inline
  implicit class CoreLayoutOps[Self <: CoreLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateLayout(value: LayoutOptions => Layouts): Self = this.set("createLayout", js.Any.fromFunction1(value))
    @scala.inline
    def setLayout(value: LayoutOptions => Layouts): Self = this.set("layout", js.Any.fromFunction1(value))
    @scala.inline
    def setMakeLayout(value: LayoutOptions => Layouts): Self = this.set("makeLayout", js.Any.fromFunction1(value))
  }
  
}

