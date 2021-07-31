package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendContactMethodVerificationRequest extends StObject {
  
  /**
    * The protocol to verify, such as Email or SMS (text messaging).
    */
  var protocol: ContactMethodVerificationProtocol
}
object SendContactMethodVerificationRequest {
  
  @scala.inline
  def apply(protocol: ContactMethodVerificationProtocol): SendContactMethodVerificationRequest = {
    val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendContactMethodVerificationRequest]
  }
  
  @scala.inline
  implicit class SendContactMethodVerificationRequestMutableBuilder[Self <: SendContactMethodVerificationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProtocol(value: ContactMethodVerificationProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}
