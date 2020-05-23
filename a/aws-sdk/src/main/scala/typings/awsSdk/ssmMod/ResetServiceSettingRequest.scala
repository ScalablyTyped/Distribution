package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetServiceSettingRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the service setting to reset. The setting ID can be /ssm/parameter-store/default-parameter-tier, /ssm/parameter-store/high-throughput-enabled, or /ssm/managed-instance/activation-tier. For example, arn:aws:ssm:us-east-1:111122223333:servicesetting/ssm/parameter-store/high-throughput-enabled.
    */
  var SettingId: ServiceSettingId = js.native
}

object ResetServiceSettingRequest {
  @scala.inline
  def apply(SettingId: ServiceSettingId): ResetServiceSettingRequest = {
    val __obj = js.Dynamic.literal(SettingId = SettingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetServiceSettingRequest]
  }
}

