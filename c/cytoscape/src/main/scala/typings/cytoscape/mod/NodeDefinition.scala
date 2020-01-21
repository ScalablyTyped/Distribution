package typings.cytoscape.mod

import typings.cytoscape.mod.Css.Edge
import typings.cytoscape.mod.Css.Node
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
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (!js.isUndefined(grabbable)) __obj.updateDynamic("grabbable")(grabbable.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (renderedPosition != null) __obj.updateDynamic("renderedPosition")(renderedPosition.asInstanceOf[js.Any])
    if (scratch != null) __obj.updateDynamic("scratch")(scratch.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeDefinition]
  }
}

