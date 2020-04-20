package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApplicationSettingsRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  var WriteApplicationSettingsRequest: typings.awsSdk.pinpointMod.WriteApplicationSettingsRequest = js.native
}

object UpdateApplicationSettingsRequest {
  @scala.inline
  def apply(ApplicationId: string, WriteApplicationSettingsRequest: WriteApplicationSettingsRequest): UpdateApplicationSettingsRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], WriteApplicationSettingsRequest = WriteApplicationSettingsRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationSettingsRequest]
  }
}

