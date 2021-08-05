package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclineHandshakeResponse extends StObject {
  
  /**
    * A structure that contains details about the declined handshake. The state is updated to show the value DECLINED.
    */
  var Handshake: js.UndefOr[typings.awsSdk.organizationsMod.Handshake] = js.undefined
}
object DeclineHandshakeResponse {
  
  inline def apply(): DeclineHandshakeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeclineHandshakeResponse]
  }
  
  extension [Self <: DeclineHandshakeResponse](x: Self) {
    
    inline def setHandshake(value: Handshake): Self = StObject.set(x, "Handshake", value.asInstanceOf[js.Any])
    
    inline def setHandshakeUndefined: Self = StObject.set(x, "Handshake", js.undefined)
  }
}
