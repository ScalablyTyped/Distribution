package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePlatformApplicationInput extends js.Object {
  /**
    * For a list of attributes, see SetPlatformApplicationAttributes 
    */
  var Attributes: MapStringToString = js.native
  /**
    * Application names must be made up of only uppercase and lowercase ASCII letters, numbers, underscores, hyphens, and periods, and must be between 1 and 256 characters long.
    */
  var Name: String = js.native
  /**
    * The following platforms are supported: ADM (Amazon Device Messaging), APNS (Apple Push Notification Service), APNS_SANDBOX, and FCM (Firebase Cloud Messaging).
    */
  var Platform: String = js.native
}

object CreatePlatformApplicationInput {
  @scala.inline
  def apply(Attributes: MapStringToString, Name: String, Platform: String): CreatePlatformApplicationInput = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Platform = Platform.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreatePlatformApplicationInput]
  }
}

