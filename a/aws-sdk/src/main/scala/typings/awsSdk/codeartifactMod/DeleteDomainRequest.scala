package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDomainRequest extends js.Object {
  /**
    *  The name of the domain to delete. 
    */
  var domain: DomainName = js.native
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.native
}

object DeleteDomainRequest {
  @scala.inline
  def apply(domain: DomainName, domainOwner: AccountId = null): DeleteDomainRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    if (domainOwner != null) __obj.updateDynamic("domainOwner")(domainOwner.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDomainRequest]
  }
}

