package typings.cytoscape.cytoscapeMod

import typings.cytoscape.cytoscapeMod.Css.Edge
import typings.cytoscape.cytoscapeMod.Css.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeDefinition extends ElementDefinition {
  @JSName("data")
  var data_NodeDefinition: NodeDataDefinition
}

object NodeDefinition {
  @scala.inline
  def apply(
    data: NodeDataDefinition,
    classes: String = null,
    css: Node | Edge = null,
    grabbable: js.UndefOr[Boolean] = js.undefined,
    group: ElementGroup = null,
    locked: js.UndefOr[Boolean] = js.undefined,
    position: Position = null,
    renderedPosition: Position = null,
    scratch: Scratchpad = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    style: CssStyleDeclaration = null
  ): NodeDefinition = {
    val __obj = js.Dynamic.literal(data = data)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (!js.isUndefined(grabbable)) __obj.updateDynamic("grabbable")(grabbable)
    if (group != null) __obj.updateDynamic("group")(group)
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked)
    if (position != null) __obj.updateDynamic("position")(position)
    if (renderedPosition != null) __obj.updateDynamic("renderedPosition")(renderedPosition)
    if (scratch != null) __obj.updateDynamic("scratch")(scratch)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[NodeDefinition]
  }
}

