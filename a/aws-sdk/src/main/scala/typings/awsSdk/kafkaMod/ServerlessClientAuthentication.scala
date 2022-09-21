package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerlessClientAuthentication extends StObject {
  
  /**
    * 
    Details for ClientAuthentication using SASL.
    
    */
  var Sasl: js.UndefOr[ServerlessSasl] = js.undefined
}
object ServerlessClientAuthentication {
  
  inline def apply(): ServerlessClientAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerlessClientAuthentication]
  }
  
  extension [Self <: ServerlessClientAuthentication](x: Self) {
    
    inline def setSasl(value: ServerlessSasl): Self = StObject.set(x, "Sasl", value.asInstanceOf[js.Any])
    
    inline def setSaslUndefined: Self = StObject.set(x, "Sasl", js.undefined)
  }
}
