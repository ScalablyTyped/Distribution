package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDomainPermissionsPolicyRequest extends StObject {
  
  /**
    *  The name of the domain associated with the resource policy to be deleted. 
    */
  var domain: DomainName
  
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    *  The current revision of the resource policy to be deleted. This revision is used for optimistic locking, which prevents others from overwriting your changes to the domain's resource policy. 
    */
  var policyRevision: js.UndefOr[PolicyRevision] = js.undefined
}
object DeleteDomainPermissionsPolicyRequest {
  
  inline def apply(domain: DomainName): DeleteDomainPermissionsPolicyRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDomainPermissionsPolicyRequest]
  }
  
  extension [Self <: DeleteDomainPermissionsPolicyRequest](x: Self) {
    
    inline def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainOwner(value: AccountId): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
    
    inline def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
    
    inline def setPolicyRevision(value: PolicyRevision): Self = StObject.set(x, "policyRevision", value.asInstanceOf[js.Any])
    
    inline def setPolicyRevisionUndefined: Self = StObject.set(x, "policyRevision", js.undefined)
  }
}
