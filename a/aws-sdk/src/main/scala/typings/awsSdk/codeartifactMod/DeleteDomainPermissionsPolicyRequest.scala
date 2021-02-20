package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDomainPermissionsPolicyRequest extends StObject {
  
  /**
    *  The name of the domain associated with the resource policy to be deleted. 
    */
  var domain: DomainName = js.native
  
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.native
  
  /**
    *  The current revision of the resource policy to be deleted. This revision is used for optimistic locking, which prevents others from overwriting your changes to the domain's resource policy. 
    */
  var policyRevision: js.UndefOr[PolicyRevision] = js.native
}
object DeleteDomainPermissionsPolicyRequest {
  
  @scala.inline
  def apply(domain: DomainName): DeleteDomainPermissionsPolicyRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDomainPermissionsPolicyRequest]
  }
  
  @scala.inline
  implicit class DeleteDomainPermissionsPolicyRequestMutableBuilder[Self <: DeleteDomainPermissionsPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainOwner(value: AccountId): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
    
    @scala.inline
    def setPolicyRevision(value: PolicyRevision): Self = StObject.set(x, "policyRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyRevisionUndefined: Self = StObject.set(x, "policyRevision", js.undefined)
  }
}
