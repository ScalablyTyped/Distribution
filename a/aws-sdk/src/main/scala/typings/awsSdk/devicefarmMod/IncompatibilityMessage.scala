package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncompatibilityMessage extends js.Object {
  /**
    * A message about the incompatibility.
    */
  var message: js.UndefOr[Message] = js.native
  /**
    * The type of incompatibility. Allowed values include:   ARN   FORM_FACTOR (for example, phone or tablet)   MANUFACTURER   PLATFORM (for example, Android or iOS)   REMOTE_ACCESS_ENABLED   APPIUM_VERSION  
    */
  var `type`: js.UndefOr[DeviceAttribute] = js.native
}

object IncompatibilityMessage {
  @scala.inline
  def apply(message: Message = null, `type`: DeviceAttribute = null): IncompatibilityMessage = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncompatibilityMessage]
  }
}

