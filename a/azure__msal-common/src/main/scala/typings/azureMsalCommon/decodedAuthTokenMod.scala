package typings.azureMsalCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decodedAuthTokenMod {
  
  trait DecodedAuthToken extends StObject {
    
    var JWSPayload: String
    
    var JWSSig: String
    
    var header: String
  }
  object DecodedAuthToken {
    
    inline def apply(JWSPayload: String, JWSSig: String, header: String): DecodedAuthToken = {
      val __obj = js.Dynamic.literal(JWSPayload = JWSPayload.asInstanceOf[js.Any], JWSSig = JWSSig.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecodedAuthToken]
    }
    
    extension [Self <: DecodedAuthToken](x: Self) {
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setJWSPayload(value: String): Self = StObject.set(x, "JWSPayload", value.asInstanceOf[js.Any])
      
      inline def setJWSSig(value: String): Self = StObject.set(x, "JWSSig", value.asInstanceOf[js.Any])
    }
  }
}
