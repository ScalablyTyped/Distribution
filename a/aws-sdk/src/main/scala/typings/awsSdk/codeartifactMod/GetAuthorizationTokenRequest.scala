package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAuthorizationTokenRequest extends js.Object {
  /**
    *  The name of the domain that is in scope for the generated authorization token. 
    */
  var domain: DomainName = js.native
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.native
  /**
    * The time, in seconds, that the generated authorization token is valid.
    */
  var durationSeconds: js.UndefOr[AuthorizationTokenDurationSeconds] = js.native
}

object GetAuthorizationTokenRequest {
  @scala.inline
  def apply(domain: DomainName): GetAuthorizationTokenRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAuthorizationTokenRequest]
  }
  @scala.inline
  implicit class GetAuthorizationTokenRequestOps[Self <: GetAuthorizationTokenRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDomain(value: DomainName): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainOwner(value: AccountId): Self = this.set("domainOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainOwner: Self = this.set("domainOwner", js.undefined)
    @scala.inline
    def setDurationSeconds(value: AuthorizationTokenDurationSeconds): Self = this.set("durationSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationSeconds: Self = this.set("durationSeconds", js.undefined)
  }
  
}

