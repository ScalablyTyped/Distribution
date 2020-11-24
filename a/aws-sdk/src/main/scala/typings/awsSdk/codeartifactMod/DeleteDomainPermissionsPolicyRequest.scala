package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDomainPermissionsPolicyRequest extends js.Object {
  
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
  implicit class DeleteDomainPermissionsPolicyRequestOps[Self <: DeleteDomainPermissionsPolicyRequest] (val x: Self) extends AnyVal {
    
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
    def setDomainOwner(value: AccountId): Self = this.set("domainOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainOwner: Self = this.set("domainOwner", js.undefined)
    
    @scala.inline
    def setPolicyRevision(value: PolicyRevision): Self = this.set("policyRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyRevision: Self = this.set("policyRevision", js.undefined)
  }
}
