package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetServiceSettingRequest extends js.Object {
  /**
    * The ID of the service setting to reset.
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

