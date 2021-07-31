package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRepositoryPermissionsPolicyRequest extends StObject {
  
  /**
    *  The name of the domain containing the repository to set the resource policy on. 
    */
  var domain: DomainName
  
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    *  A valid displayable JSON Aspen policy string to be set as the access control resource policy on the provided repository. 
    */
  var policyDocument: PolicyDocument
  
  /**
    *  Sets the revision of the resource policy that specifies permissions to access the repository. This revision is used for optimistic locking, which prevents others from overwriting your changes to the repository's resource policy. 
    */
  var policyRevision: js.UndefOr[PolicyRevision] = js.undefined
  
  /**
    *  The name of the repository to set the resource policy on. 
    */
  var repository: RepositoryName
}
object PutRepositoryPermissionsPolicyRequest {
  
  @scala.inline
  def apply(domain: DomainName, policyDocument: PolicyDocument, repository: RepositoryName): PutRepositoryPermissionsPolicyRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], policyDocument = policyDocument.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRepositoryPermissionsPolicyRequest]
  }
  
  @scala.inline
  implicit class PutRepositoryPermissionsPolicyRequestMutableBuilder[Self <: PutRepositoryPermissionsPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainOwner(value: AccountId): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
    
    @scala.inline
    def setPolicyDocument(value: PolicyDocument): Self = StObject.set(x, "policyDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyRevision(value: PolicyRevision): Self = StObject.set(x, "policyRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyRevisionUndefined: Self = StObject.set(x, "policyRevision", js.undefined)
    
    @scala.inline
    def setRepository(value: RepositoryName): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
  }
}
