package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptHandshakeResponse extends StObject {
  
  /**
    * A structure that contains details about the accepted handshake.
    */
  var Handshake: js.UndefOr[typings.awsSdk.organizationsMod.Handshake] = js.undefined
}
object AcceptHandshakeResponse {
  
  @scala.inline
  def apply(): AcceptHandshakeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptHandshakeResponse]
  }
  
  @scala.inline
  implicit class AcceptHandshakeResponseMutableBuilder[Self <: AcceptHandshakeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandshake(value: Handshake): Self = StObject.set(x, "Handshake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandshakeUndefined: Self = StObject.set(x, "Handshake", js.undefined)
  }
}
