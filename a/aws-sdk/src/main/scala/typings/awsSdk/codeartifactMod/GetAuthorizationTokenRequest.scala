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
  def apply(
    domain: DomainName,
    domainOwner: AccountId = null,
    durationSeconds: js.UndefOr[AuthorizationTokenDurationSeconds] = js.undefined
  ): GetAuthorizationTokenRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    if (domainOwner != null) __obj.updateDynamic("domainOwner")(domainOwner.asInstanceOf[js.Any])
    if (!js.isUndefined(durationSeconds)) __obj.updateDynamic("durationSeconds")(durationSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAuthorizationTokenRequest]
  }
}

