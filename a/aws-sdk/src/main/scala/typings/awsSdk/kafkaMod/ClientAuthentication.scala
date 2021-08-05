package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientAuthentication extends StObject {
  
  /**
    * 
    Details for ClientAuthentication using SASL.
    
    */
  var Sasl: js.UndefOr[typings.awsSdk.kafkaMod.Sasl] = js.undefined
  
  /**
    * 
    Details for ClientAuthentication using TLS.
    
    */
  var Tls: js.UndefOr[typings.awsSdk.kafkaMod.Tls] = js.undefined
}
object ClientAuthentication {
  
  inline def apply(): ClientAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientAuthentication]
  }
  
  extension [Self <: ClientAuthentication](x: Self) {
    
    inline def setSasl(value: Sasl): Self = StObject.set(x, "Sasl", value.asInstanceOf[js.Any])
    
    inline def setSaslUndefined: Self = StObject.set(x, "Sasl", js.undefined)
    
    inline def setTls(value: Tls): Self = StObject.set(x, "Tls", value.asInstanceOf[js.Any])
    
    inline def setTlsUndefined: Self = StObject.set(x, "Tls", js.undefined)
  }
}
