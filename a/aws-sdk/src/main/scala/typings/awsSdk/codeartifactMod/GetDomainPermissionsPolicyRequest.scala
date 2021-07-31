package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDomainPermissionsPolicyRequest extends StObject {
  
  /**
    *  The name of the domain to which the resource policy is attached. 
    */
  var domain: DomainName
  
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.undefined
}
object GetDomainPermissionsPolicyRequest {
  
  @scala.inline
  def apply(domain: DomainName): GetDomainPermissionsPolicyRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainPermissionsPolicyRequest]
  }
  
  @scala.inline
  implicit class GetDomainPermissionsPolicyRequestMutableBuilder[Self <: GetDomainPermissionsPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainOwner(value: AccountId): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
  }
}
