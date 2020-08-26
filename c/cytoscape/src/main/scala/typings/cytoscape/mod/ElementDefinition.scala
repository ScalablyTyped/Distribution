package typings.cytoscape.mod

import typings.cytoscape.mod.Css.Edge
import typings.cytoscape.mod.Css.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementDefinition extends js.Object {
  /**
    * a space separated list of class names that the element has
    */
  var classes: js.UndefOr[String] = js.native
  /**
    * you should only use `style`/`css` for very special cases; use classes instead
    */
  var css: js.UndefOr[Node | Edge] = js.native
  var data: NodeDataDefinition | EdgeDataDefinition = js.native
  /**
    * Wether the node can be grabbed and moved by the user
    */
  var grabbable: js.UndefOr[Boolean] = js.native
  var group: js.UndefOr[ElementGroup] = js.native
  /**
    * When locked a node's position is immutable (default false)
    */
  var locked: js.UndefOr[Boolean] = js.native
  /**
    * The model position of the node (optional on init, mandatory after)
    */
  var position: js.UndefOr[Position] = js.native
  /**
    * can alternatively specify position in rendered on-screen pixels
    */
  var renderedPosition: js.UndefOr[Position] = js.native
  /**
    * Scratchpad data (usually temp or nonserialisable data)
    */
  var scratch: js.UndefOr[Scratchpad] = js.native
  /**
    * Whether the selection state is mutable (default true)
    */
  var selectable: js.UndefOr[Boolean] = js.native
  /**
    * Whether the element is selected (default false)
    */
  var selected: js.UndefOr[Boolean] = js.native
  /**
    *  CssStyleDeclaration;
    */
  var style: js.UndefOr[CssStyleDeclaration] = js.native
}

object ElementDefinition {
  @scala.inline
  def apply(data: NodeDataDefinition | EdgeDataDefinition): ElementDefinition = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinition]
  }
  @scala.inline
  implicit class ElementDefinitionOps[Self <: ElementDefinition] (val x: Self) extends AnyVal {
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
    def setData(value: NodeDataDefinition | EdgeDataDefinition): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setClasses(value: String): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setCss(value: Node | Edge): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    @scala.inline
    def setGrabbable(value: Boolean): Self = this.set("grabbable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrabbable: Self = this.set("grabbable", js.undefined)
    @scala.inline
    def setGroup(value: ElementGroup): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("locked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocked: Self = this.set("locked", js.undefined)
    @scala.inline
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRenderedPosition(value: Position): Self = this.set("renderedPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderedPosition: Self = this.set("renderedPosition", js.undefined)
    @scala.inline
    def setScratch(value: Scratchpad): Self = this.set("scratch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScratch: Self = this.set("scratch", js.undefined)
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setStyle(value: CssStyleDeclaration): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

