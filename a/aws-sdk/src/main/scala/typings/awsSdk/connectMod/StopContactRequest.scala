package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopContactRequest extends StObject {
  
  /**
    * The ID of the contact.
    */
  var ContactId: typings.awsSdk.connectMod.ContactId = js.native
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId = js.native
}
object StopContactRequest {
  
  @scala.inline
  def apply(ContactId: ContactId, InstanceId: InstanceId): StopContactRequest = {
    val __obj = js.Dynamic.literal(ContactId = ContactId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopContactRequest]
  }
  
  @scala.inline
  implicit class StopContactRequestMutableBuilder[Self <: StopContactRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactId(value: ContactId): Self = StObject.set(x, "ContactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
