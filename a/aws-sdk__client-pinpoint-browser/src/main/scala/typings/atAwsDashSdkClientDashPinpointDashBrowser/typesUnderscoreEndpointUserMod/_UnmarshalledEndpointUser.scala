package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointUserMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledEndpointUser extends _EndpointUser {
  /**
    * Custom attributes that describe the user by associating a name with an array of values. For example, an attribute named "interests" might have the following values: ["science", "politics", "travel"]. You can use these attributes as selection criteria when you create segments.
    *
    * The Amazon Pinpoint console can't display attribute names that include the following characters: hash/pound sign (#), colon (:), question mark (?), backslash (\), and forward slash (/). For this reason, you should avoid using these characters in the names of custom attributes.
    */
  @JSName("UserAttributes")
  var UserAttributes__UnmarshalledEndpointUser: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
}

object _UnmarshalledEndpointUser {
  @scala.inline
  def apply(UserAttributes: StringDictionary[js.Array[String]] = null, UserId: String = null): _UnmarshalledEndpointUser = {
    val __obj = js.Dynamic.literal()
    if (UserAttributes != null) __obj.updateDynamic("UserAttributes")(UserAttributes.asInstanceOf[js.Any])
    if (UserId != null) __obj.updateDynamic("UserId")(UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledEndpointUser]
  }
}

