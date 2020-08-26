package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolClientDescription extends js.Object {
  /**
    * The ID of the client associated with the user pool.
    */
  var ClientId: js.UndefOr[ClientIdType] = js.native
  /**
    * The client name from the user pool client description.
    */
  var ClientName: js.UndefOr[ClientNameType] = js.native
  /**
    * The user pool ID for the user pool where you want to describe the user pool client.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.native
}

object UserPoolClientDescription {
  @scala.inline
  def apply(): UserPoolClientDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolClientDescription]
  }
  @scala.inline
  implicit class UserPoolClientDescriptionOps[Self <: UserPoolClientDescription] (val x: Self) extends AnyVal {
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
    def setClientId(value: ClientIdType): Self = this.set("ClientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("ClientId", js.undefined)
    @scala.inline
    def setClientName(value: ClientNameType): Self = this.set("ClientName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientName: Self = this.set("ClientName", js.undefined)
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserPoolId: Self = this.set("UserPoolId", js.undefined)
  }
  
}

