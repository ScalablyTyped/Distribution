package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelHandshakeResponse extends StObject {
  
  /**
    * A structure that contains details about the handshake that you canceled.
    */
  var Handshake: js.UndefOr[typings.awsSdk.organizationsMod.Handshake] = js.undefined
}
object CancelHandshakeResponse {
  
  inline def apply(): CancelHandshakeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelHandshakeResponse]
  }
  
  extension [Self <: CancelHandshakeResponse](x: Self) {
    
    inline def setHandshake(value: Handshake): Self = StObject.set(x, "Handshake", value.asInstanceOf[js.Any])
    
    inline def setHandshakeUndefined: Self = StObject.set(x, "Handshake", js.undefined)
  }
}
