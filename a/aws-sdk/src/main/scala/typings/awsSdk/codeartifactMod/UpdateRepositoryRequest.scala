package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRepositoryRequest extends StObject {
  
  /**
    *  An updated repository description. 
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    *  The name of the domain associated with the repository to update. 
    */
  var domain: DomainName
  
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    *  The name of the repository to update. 
    */
  var repository: RepositoryName
  
  /**
    *  A list of upstream repositories to associate with the repository. The order of the upstream repositories in the list determines their priority order when AWS CodeArtifact looks for a requested package version. For more information, see Working with upstream repositories. 
    */
  var upstreams: js.UndefOr[UpstreamRepositoryList] = js.undefined
}
object UpdateRepositoryRequest {
  
  @scala.inline
  def apply(domain: DomainName, repository: RepositoryName): UpdateRepositoryRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRepositoryRequest]
  }
  
  @scala.inline
  implicit class UpdateRepositoryRequestMutableBuilder[Self <: UpdateRepositoryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainOwner(value: AccountId): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
    
    @scala.inline
    def setRepository(value: RepositoryName): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpstreams(value: UpstreamRepositoryList): Self = StObject.set(x, "upstreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpstreamsUndefined: Self = StObject.set(x, "upstreams", js.undefined)
    
    @scala.inline
    def setUpstreamsVarargs(value: UpstreamRepository*): Self = StObject.set(x, "upstreams", js.Array(value :_*))
  }
}
