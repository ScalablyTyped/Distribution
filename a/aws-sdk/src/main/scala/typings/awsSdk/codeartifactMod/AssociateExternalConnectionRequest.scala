package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateExternalConnectionRequest extends js.Object {
  /**
    * The name of the domain that contains the repository.
    */
  var domain: DomainName = js.native
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.native
  /**
    *  The name of the external connection to add to the repository. The following values are supported:     public:npmjs - for the npm public repository.     public:pypi - for the Python Package Index.     public:maven-central - for Maven Central.     public:maven-googleandroid - for the Google Android repository.     public:maven-gradleplugins - for the Gradle plugins repository.     public:maven-commonsware - for the CommonsWare Android repository.   
    */
  var externalConnection: ExternalConnectionName = js.native
  /**
    *  The name of the repository to which the external connection is added. 
    */
  var repository: RepositoryName = js.native
}

object AssociateExternalConnectionRequest {
  @scala.inline
  def apply(
    domain: DomainName,
    externalConnection: ExternalConnectionName,
    repository: RepositoryName,
    domainOwner: AccountId = null
  ): AssociateExternalConnectionRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], externalConnection = externalConnection.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    if (domainOwner != null) __obj.updateDynamic("domainOwner")(domainOwner.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateExternalConnectionRequest]
  }
}

