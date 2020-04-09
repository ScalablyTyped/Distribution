package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogConfigurations extends js.Object {
  /**
    * Parameters for publishing logs to Amazon CloudWatch Logs.
    */
  var Cloudwatch: js.UndefOr[LogConfiguration] = js.native
}

object LogConfigurations {
  @scala.inline
  def apply(Cloudwatch: LogConfiguration = null): LogConfigurations = {
    val __obj = js.Dynamic.literal()
    if (Cloudwatch != null) __obj.updateDynamic("Cloudwatch")(Cloudwatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogConfigurations]
  }
}

