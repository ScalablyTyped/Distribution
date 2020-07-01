package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateExternalConnectionRequest extends js.Object {
  /**
    * The name of the domain that contains the repository from which to remove the external repository. 
    */
  var domain: DomainName = js.native
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.native
  /**
    * The name of the external connection to be removed from the repository. 
    */
  var externalConnection: ExternalConnectionName = js.native
  /**
    * The name of the repository from which the external connection will be removed. 
    */
  var repository: RepositoryName = js.native
}

object DisassociateExternalConnectionRequest {
  @scala.inline
  def apply(
    domain: DomainName,
    externalConnection: ExternalConnectionName,
    repository: RepositoryName,
    domainOwner: AccountId = null
  ): DisassociateExternalConnectionRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], externalConnection = externalConnection.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    if (domainOwner != null) __obj.updateDynamic("domainOwner")(domainOwner.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateExternalConnectionRequest]
  }
}

