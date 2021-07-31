package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Destination extends StObject {
  
  /**
    * An array that contains the email addresses of the "BCC" (blind carbon copy) recipients for the email.
    */
  var BccAddresses: js.UndefOr[EmailAddressList] = js.undefined
  
  /**
    * An array that contains the email addresses of the "CC" (carbon copy) recipients for the email.
    */
  var CcAddresses: js.UndefOr[EmailAddressList] = js.undefined
  
  /**
    * An array that contains the email addresses of the "To" recipients for the email.
    */
  var ToAddresses: js.UndefOr[EmailAddressList] = js.undefined
}
object Destination {
  
  @scala.inline
  def apply(): Destination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Destination]
  }
  
  @scala.inline
  implicit class DestinationMutableBuilder[Self <: Destination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBccAddresses(value: EmailAddressList): Self = StObject.set(x, "BccAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBccAddressesUndefined: Self = StObject.set(x, "BccAddresses", js.undefined)
    
    @scala.inline
    def setBccAddressesVarargs(value: EmailAddress*): Self = StObject.set(x, "BccAddresses", js.Array(value :_*))
    
    @scala.inline
    def setCcAddresses(value: EmailAddressList): Self = StObject.set(x, "CcAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCcAddressesUndefined: Self = StObject.set(x, "CcAddresses", js.undefined)
    
    @scala.inline
    def setCcAddressesVarargs(value: EmailAddress*): Self = StObject.set(x, "CcAddresses", js.Array(value :_*))
    
    @scala.inline
    def setToAddresses(value: EmailAddressList): Self = StObject.set(x, "ToAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToAddressesUndefined: Self = StObject.set(x, "ToAddresses", js.undefined)
    
    @scala.inline
    def setToAddressesVarargs(value: EmailAddress*): Self = StObject.set(x, "ToAddresses", js.Array(value :_*))
  }
}
