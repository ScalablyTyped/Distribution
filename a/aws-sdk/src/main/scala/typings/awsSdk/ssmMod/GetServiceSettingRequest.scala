package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceSettingRequest extends js.Object {
  /**
    * The ID of the service setting to get. The setting ID can be /ssm/parameter-store/default-parameter-tier, /ssm/parameter-store/high-throughput-enabled, or /ssm/managed-instance/activation-tier.
    */
  var SettingId: ServiceSettingId = js.native
}

object GetServiceSettingRequest {
  @scala.inline
  def apply(SettingId: ServiceSettingId): GetServiceSettingRequest = {
    val __obj = js.Dynamic.literal(SettingId = SettingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceSettingRequest]
  }
}

