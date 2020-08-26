package typings.awsSdkClientPinpointBrowser.typesEndpointUserMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledEndpointUser extends EndpointUser {
  /**
    * Custom attributes that describe the user by associating a name with an array of values. For example, an attribute named "interests" might have the following values: ["science", "politics", "travel"]. You can use these attributes as selection criteria when you create segments.
    *
    * The Amazon Pinpoint console can't display attribute names that include the following characters: hash/pound sign (#), colon (:), question mark (?), backslash (\), and forward slash (/). For this reason, you should avoid using these characters in the names of custom attributes.
    */
  @JSName("UserAttributes")
  var UserAttributes_UnmarshalledEndpointUser: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
}

object UnmarshalledEndpointUser {
  @scala.inline
  def apply(): UnmarshalledEndpointUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledEndpointUser]
  }
  @scala.inline
  implicit class UnmarshalledEndpointUserOps[Self <: UnmarshalledEndpointUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUserAttributes(value: StringDictionary[js.Array[String]]): Self = this.set("UserAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserAttributes: Self = this.set("UserAttributes", js.undefined)
  }
  
}

