package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRepositoryEndpointRequest extends StObject {
  
  /**
    *  The name of the domain that contains the repository. 
    */
  var domain: DomainName
  
  /**
    *  The 12-digit account number of the AWS account that owns the domain that contains the repository. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    *  Returns which endpoint of a repository to return. A repository has one endpoint for each package format:     npm     pypi     maven   
    */
  var format: PackageFormat
  
  /**
    *  The name of the repository. 
    */
  var repository: RepositoryName
}
object GetRepositoryEndpointRequest {
  
  @scala.inline
  def apply(domain: DomainName, format: PackageFormat, repository: RepositoryName): GetRepositoryEndpointRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRepositoryEndpointRequest]
  }
  
  @scala.inline
  implicit class GetRepositoryEndpointRequestMutableBuilder[Self <: GetRepositoryEndpointRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainOwner(value: AccountId): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
    
    @scala.inline
    def setFormat(value: PackageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository(value: RepositoryName): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
  }
}
