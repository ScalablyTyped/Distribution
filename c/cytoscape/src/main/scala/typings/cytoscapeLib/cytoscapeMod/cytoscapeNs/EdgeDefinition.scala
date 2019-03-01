package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EdgeDefinition extends ElementDefinition {
  @JSName("data")
  var data_EdgeDefinition: EdgeDataDefinition
}

object EdgeDefinition {
  @scala.inline
  def apply(
    data: EdgeDataDefinition,
    classes: java.lang.String = null,
    css: cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs.Node | cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs.Edge = null,
    grabbable: js.UndefOr[scala.Boolean] = js.undefined,
    group: ElementGroup = null,
    locked: js.UndefOr[scala.Boolean] = js.undefined,
    position: Position = null,
    renderedPosition: Position = null,
    scatch: Scratchpad = null,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    style: CssStyleDeclaration = null
  ): EdgeDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (!js.isUndefined(grabbable)) __obj.updateDynamic("grabbable")(grabbable)
    if (group != null) __obj.updateDynamic("group")(group)
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked)
    if (position != null) __obj.updateDynamic("position")(position)
    if (renderedPosition != null) __obj.updateDynamic("renderedPosition")(renderedPosition)
    if (scatch != null) __obj.updateDynamic("scatch")(scatch)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[EdgeDefinition]
  }
}

