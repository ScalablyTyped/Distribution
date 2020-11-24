package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDomainContactRequest extends js.Object {
  
  /**
    * Provides detailed contact information.
    */
  var AdminContact: js.UndefOr[ContactDetail] = js.native
  
  /**
    * The name of the domain that you want to update contact information for.
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName = js.native
  
  /**
    * Provides detailed contact information.
    */
  var RegistrantContact: js.UndefOr[ContactDetail] = js.native
  
  /**
    * Provides detailed contact information.
    */
  var TechContact: js.UndefOr[ContactDetail] = js.native
}
object UpdateDomainContactRequest {
  
  @scala.inline
  def apply(DomainName: DomainName): UpdateDomainContactRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainContactRequest]
  }
  
  @scala.inline
  implicit class UpdateDomainContactRequestOps[Self <: UpdateDomainContactRequest] (val x: Self) extends AnyVal {
    
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
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminContact(value: ContactDetail): Self = this.set("AdminContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdminContact: Self = this.set("AdminContact", js.undefined)
    
    @scala.inline
    def setRegistrantContact(value: ContactDetail): Self = this.set("RegistrantContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistrantContact: Self = this.set("RegistrantContact", js.undefined)
    
    @scala.inline
    def setTechContact(value: ContactDetail): Self = this.set("TechContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTechContact: Self = this.set("TechContact", js.undefined)
  }
}
