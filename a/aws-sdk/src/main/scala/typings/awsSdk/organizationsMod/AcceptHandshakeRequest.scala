package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceptHandshakeRequest extends StObject {
  
  /**
    * The unique identifier (ID) of the handshake that you want to accept. The regex pattern for handshake ID string requires "h-" followed by from 8 to 32 lowercase letters or digits.
    */
  var HandshakeId: typings.awsSdk.organizationsMod.HandshakeId = js.native
}
object AcceptHandshakeRequest {
  
  @scala.inline
  def apply(HandshakeId: HandshakeId): AcceptHandshakeRequest = {
    val __obj = js.Dynamic.literal(HandshakeId = HandshakeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptHandshakeRequest]
  }
  
  @scala.inline
  implicit class AcceptHandshakeRequestMutableBuilder[Self <: AcceptHandshakeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandshakeId(value: HandshakeId): Self = StObject.set(x, "HandshakeId", value.asInstanceOf[js.Any])
  }
}
