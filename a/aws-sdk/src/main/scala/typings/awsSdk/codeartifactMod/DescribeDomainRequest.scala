package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDomainRequest extends js.Object {
  /**
    *  A string that specifies the name of the requested domain. 
    */
  var domain: DomainName = js.native
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.native
}

object DescribeDomainRequest {
  @scala.inline
  def apply(domain: DomainName, domainOwner: AccountId = null): DescribeDomainRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    if (domainOwner != null) __obj.updateDynamic("domainOwner")(domainOwner.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainRequest]
  }
}

