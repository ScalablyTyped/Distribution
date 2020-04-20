package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUserRequest extends js.Object {
  /**
    * The display name for the new user.
    */
  var DisplayName: String = js.native
  /**
    * The name for the new user. Simple AD or AD Connector user names have a maximum length of 20. All others have a maximum length of 64.
    */
  var Name: UserName = js.native
  /**
    * The identifier of the organization for which the user is created.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
  /**
    * The password for the new user.
    */
  var Password: typings.awsSdk.workmailMod.Password = js.native
}

object CreateUserRequest {
  @scala.inline
  def apply(DisplayName: String, Name: UserName, OrganizationId: OrganizationId, Password: Password): CreateUserRequest = {
    val __obj = js.Dynamic.literal(DisplayName = DisplayName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserRequest]
  }
}

