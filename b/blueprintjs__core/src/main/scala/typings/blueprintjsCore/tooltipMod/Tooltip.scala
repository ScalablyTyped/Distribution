package typings.blueprintjsCore.tooltipMod

import typings.blueprintjsCore.PartialITooltipProps
import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/tooltip/tooltip", "Tooltip")
@js.native
class Tooltip ()
  extends AbstractPureComponent2[ITooltipProps, js.Object, js.Object] {
  var popover: js.Any = js.native
  def reposition(): Unit = js.native
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/tooltip/tooltip", "Tooltip")
@js.native
object Tooltip extends js.Object {
  var defaultProps: PartialITooltipProps = js.native
  var displayName: String = js.native
}

