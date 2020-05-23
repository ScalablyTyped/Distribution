package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateServiceSettingRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the service setting to reset. For example, arn:aws:ssm:us-east-1:111122223333:servicesetting/ssm/parameter-store/high-throughput-enabled. The setting ID can be one of the following.    /ssm/parameter-store/default-parameter-tier     /ssm/parameter-store/high-throughput-enabled     /ssm/managed-instance/activation-tier   
    */
  var SettingId: ServiceSettingId = js.native
  /**
    * The new value to specify for the service setting. For the /ssm/parameter-store/default-parameter-tier setting ID, the setting value can be one of the following.   Standard   Advanced   Intelligent-Tiering   For the /ssm/parameter-store/high-throughput-enabled, and /ssm/managed-instance/activation-tier setting IDs, the setting value can be true or false.
    */
  var SettingValue: ServiceSettingValue = js.native
}

object UpdateServiceSettingRequest {
  @scala.inline
  def apply(SettingId: ServiceSettingId, SettingValue: ServiceSettingValue): UpdateServiceSettingRequest = {
    val __obj = js.Dynamic.literal(SettingId = SettingId.asInstanceOf[js.Any], SettingValue = SettingValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceSettingRequest]
  }
}

