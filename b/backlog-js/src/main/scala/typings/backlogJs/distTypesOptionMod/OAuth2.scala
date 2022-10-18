package typings.backlogJs.distTypesOptionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OAuth2 {
  
  trait Credentials extends StObject {
    
    var clientId: String
    
    var clientSecret: String
  }
  object Credentials {
    
    inline def apply(clientId: String, clientSecret: String): Credentials = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials]
    }
    
    extension [Self <: Credentials](x: Self) {
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    }
  }
}
