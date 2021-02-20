package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartOutboundVoiceContactResponse extends StObject {
  
  /**
    * The identifier of this contact within the Amazon Connect instance.
    */
  var ContactId: js.UndefOr[typings.awsSdk.connectMod.ContactId] = js.native
}
object StartOutboundVoiceContactResponse {
  
  @scala.inline
  def apply(): StartOutboundVoiceContactResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartOutboundVoiceContactResponse]
  }
  
  @scala.inline
  implicit class StartOutboundVoiceContactResponseMutableBuilder[Self <: StartOutboundVoiceContactResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactId(value: ContactId): Self = StObject.set(x, "ContactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactIdUndefined: Self = StObject.set(x, "ContactId", js.undefined)
  }
}
