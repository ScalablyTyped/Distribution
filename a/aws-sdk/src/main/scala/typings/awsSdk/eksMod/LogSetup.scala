package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogSetup extends js.Object {
  /**
    * If a log type is enabled, that log type exports its control plane logs to CloudWatch Logs. If a log type isn't enabled, that log type doesn't export its control plane logs. Each individual log type can be enabled or disabled independently.
    */
  var enabled: js.UndefOr[BoxedBoolean] = js.native
  /**
    * The available cluster control plane log types.
    */
  var types: js.UndefOr[LogTypes] = js.native
}

object LogSetup {
  @scala.inline
  def apply(enabled: js.UndefOr[BoxedBoolean] = js.undefined, types: LogTypes = null): LogSetup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogSetup]
  }
}

