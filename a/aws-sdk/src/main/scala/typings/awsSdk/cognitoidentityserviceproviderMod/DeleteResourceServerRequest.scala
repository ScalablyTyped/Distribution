package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteResourceServerRequest extends js.Object {
  /**
    * The identifier for the resource server.
    */
  var Identifier: ResourceServerIdentifierType = js.native
  /**
    * The user pool ID for the user pool that hosts the resource server.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object DeleteResourceServerRequest {
  @scala.inline
  def apply(Identifier: ResourceServerIdentifierType, UserPoolId: UserPoolIdType): DeleteResourceServerRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourceServerRequest]
  }
  @scala.inline
  implicit class DeleteResourceServerRequestOps[Self <: DeleteResourceServerRequest] (val x: Self) extends AnyVal {
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
    def setIdentifier(value: ResourceServerIdentifierType): Self = this.set("Identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
  }
  
}

