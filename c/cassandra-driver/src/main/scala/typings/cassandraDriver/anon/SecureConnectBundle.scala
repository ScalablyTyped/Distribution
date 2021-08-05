package typings.cassandraDriver.anon

import typings.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecureConnectBundle extends StObject {
  
  var secureConnectBundle: String | URL_
}
object SecureConnectBundle {
  
  inline def apply(secureConnectBundle: String | URL_): SecureConnectBundle = {
    val __obj = js.Dynamic.literal(secureConnectBundle = secureConnectBundle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecureConnectBundle]
  }
  
  extension [Self <: SecureConnectBundle](x: Self) {
    
    inline def setSecureConnectBundle(value: String | URL_): Self = StObject.set(x, "secureConnectBundle", value.asInstanceOf[js.Any])
  }
}
