package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDomainContactRequest extends StObject {
  
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
  implicit class UpdateDomainContactRequestMutableBuilder[Self <: UpdateDomainContactRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminContact(value: ContactDetail): Self = StObject.set(x, "AdminContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminContactUndefined: Self = StObject.set(x, "AdminContact", js.undefined)
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrantContact(value: ContactDetail): Self = StObject.set(x, "RegistrantContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrantContactUndefined: Self = StObject.set(x, "RegistrantContact", js.undefined)
    
    @scala.inline
    def setTechContact(value: ContactDetail): Self = StObject.set(x, "TechContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTechContactUndefined: Self = StObject.set(x, "TechContact", js.undefined)
  }
}
