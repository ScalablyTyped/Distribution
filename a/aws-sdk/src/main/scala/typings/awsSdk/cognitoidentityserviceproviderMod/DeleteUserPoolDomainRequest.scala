package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteUserPoolDomainRequest extends js.Object {
  /**
    * The domain string.
    */
  var Domain: DomainType = js.native
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object DeleteUserPoolDomainRequest {
  @scala.inline
  def apply(Domain: DomainType, UserPoolId: UserPoolIdType): DeleteUserPoolDomainRequest = {
    val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserPoolDomainRequest]
  }
  @scala.inline
  implicit class DeleteUserPoolDomainRequestOps[Self <: DeleteUserPoolDomainRequest] (val x: Self) extends AnyVal {
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
    def setDomain(value: DomainType): Self = this.set("Domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
  }
  
}

