package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointUser extends js.Object {
  /**
    * One or more custom attributes that describe the user by associating a name with an array of values. For example, the value of an attribute named Interests might be: ["science", "music", "travel"]. You can use these attributes as filter criteria when you create segments. When you define the name of a custom attribute, avoid using the following characters: number sign (#), colon (:), question mark (?), backslash (\), and slash (/). The Amazon Pinpoint console can't display attribute names that contain these characters. This limitation doesn't apply to attribute values.
    */
  var UserAttributes: js.UndefOr[MapOfListOfString] = js.native
  /**
    * The unique identifier for the user.
    */
  var UserId: js.UndefOr[string] = js.native
}

object EndpointUser {
  @scala.inline
  def apply(UserAttributes: MapOfListOfString = null, UserId: string = null): EndpointUser = {
    val __obj = js.Dynamic.literal()
    if (UserAttributes != null) __obj.updateDynamic("UserAttributes")(UserAttributes.asInstanceOf[js.Any])
    if (UserId != null) __obj.updateDynamic("UserId")(UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointUser]
  }
}

