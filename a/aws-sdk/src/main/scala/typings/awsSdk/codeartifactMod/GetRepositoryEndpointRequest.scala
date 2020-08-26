package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRepositoryEndpointRequest extends js.Object {
  /**
    *  The name of the domain that contains the repository. 
    */
  var domain: DomainName = js.native
  /**
    *  The 12-digit account number of the AWS account that owns the domain that contains the repository. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.native
  /**
    *  Returns which endpoint of a repository to return. A repository has one endpoint for each package format:     npm     pypi     maven   
    */
  var format: PackageFormat = js.native
  /**
    *  The name of the repository. 
    */
  var repository: RepositoryName = js.native
}

object GetRepositoryEndpointRequest {
  @scala.inline
  def apply(domain: DomainName, format: PackageFormat, repository: RepositoryName): GetRepositoryEndpointRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRepositoryEndpointRequest]
  }
  @scala.inline
  implicit class GetRepositoryEndpointRequestOps[Self <: GetRepositoryEndpointRequest] (val x: Self) extends AnyVal {
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
    def setFormat(value: PackageFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepository(value: RepositoryName): Self = this.set("repository", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainOwner(value: AccountId): Self = this.set("domainOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainOwner: Self = this.set("domainOwner", js.undefined)
  }
  
}

