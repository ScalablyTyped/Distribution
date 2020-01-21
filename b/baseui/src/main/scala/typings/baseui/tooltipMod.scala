package typings.baseui

import typings.baseui.popoverMod.PopoverProps
import typings.baseui.popoverMod.StatefulPopoverContainerProps
import typings.baseui.popoverMod.StatefulPopoverProps
import typings.react.mod.Component
import typings.react.mod.FC
import typings.styletronReact.mod.StyletronComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/tooltip", JSImport.Namespace)
@js.native
object tooltipMod extends js.Object {
  @js.native
  class StatefulContainer ()
    extends Component[StatefulTooltipContainerProps, js.Object, js.Any]
  
  @js.native
  class Tooltip ()
    extends Component[TooltipProps, js.Object, js.Any]
  
  val ACCESSIBILITY_TYPE: typings.baseui.popoverMod.ACCESSIBILITY_TYPE = js.native
  val PLACEMENT: typings.baseui.popoverMod.PLACEMENT = js.native
  val StatefulTooltip: FC[StatefulTooltipProps] = js.native
  val StyledArrow: StyletronComponent[js.Any] = js.native
  val StyledBody: StyletronComponent[js.Any] = js.native
  val StyledInner: StyletronComponent[js.Any] = js.native
  val TRIGGER_TYPE: typings.baseui.popoverMod.TRIGGER_TYPE = js.native
  type StatefulTooltipContainerProps = StatefulPopoverContainerProps
  type StatefulTooltipProps = StatefulPopoverProps
  type TooltipProps = PopoverProps
}

