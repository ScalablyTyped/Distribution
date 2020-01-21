package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceSettingRequest extends js.Object {
  /**
    * The ID of the service setting to get.
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

