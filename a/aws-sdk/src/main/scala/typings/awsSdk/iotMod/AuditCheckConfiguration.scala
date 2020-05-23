package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuditCheckConfiguration extends js.Object {
  /**
    * True if this audit check is enabled for this account.
    */
  var enabled: js.UndefOr[Enabled] = js.native
}

object AuditCheckConfiguration {
  @scala.inline
  def apply(enabled: js.UndefOr[Enabled] = js.undefined): AuditCheckConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditCheckConfiguration]
  }
}

