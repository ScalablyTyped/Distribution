package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetApplicationSettingsResponse extends js.Object {
  var ApplicationSettingsResource: typings.awsSdk.pinpointMod.ApplicationSettingsResource = js.native
}

object GetApplicationSettingsResponse {
  @scala.inline
  def apply(ApplicationSettingsResource: ApplicationSettingsResource): GetApplicationSettingsResponse = {
    val __obj = js.Dynamic.literal(ApplicationSettingsResource = ApplicationSettingsResource.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetApplicationSettingsResponse]
  }
}

