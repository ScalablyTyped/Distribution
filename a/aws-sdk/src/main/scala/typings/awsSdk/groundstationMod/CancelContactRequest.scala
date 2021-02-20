package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelContactRequest extends StObject {
  
  /**
    * UUID of a contact.
    */
  var contactId: String = js.native
}
object CancelContactRequest {
  
  @scala.inline
  def apply(contactId: String): CancelContactRequest = {
    val __obj = js.Dynamic.literal(contactId = contactId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelContactRequest]
  }
  
  @scala.inline
  implicit class CancelContactRequestMutableBuilder[Self <: CancelContactRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactId(value: String): Self = StObject.set(x, "contactId", value.asInstanceOf[js.Any])
  }
}
