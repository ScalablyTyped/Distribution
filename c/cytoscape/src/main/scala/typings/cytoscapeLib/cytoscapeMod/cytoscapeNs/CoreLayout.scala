package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#core/layout
  */
trait CoreLayout extends js.Object {
  def createLayout(options: LayoutOptions): Layouts
  /**
    * Run a layout, which algorithmically positions the nodes in the graph.
    * For layouts included with Cytoscape.js, you can find their
    * options documented in the Layouts section.
    * For external layouts, please refer to their accompanying documentation.
    *
    * An analogue to run a layout on a subset of the graph exists as eles.layout().
    * http://js.cytoscape.org/#cy.layout
    */
  def layout(layout: LayoutOptions): Layouts
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
  def makeLayout(options: LayoutOptions): Layouts
}

