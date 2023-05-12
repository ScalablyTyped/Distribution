package typings.cyclonedx.anon

import typings.cyclonedx.cyclonedxStrings.RSA
import typings.cyclonedx.mod.PublicKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait E
  extends StObject
     with PublicKey {
  
  var e: String
  
  var kty: RSA
  
  var n: String
}
object E {
  
  inline def apply(e: String, n: String): E = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], kty = "RSA", n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[E]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: E] (val x: Self) extends AnyVal {
    
    inline def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    inline def setKty(value: RSA): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
    
    inline def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
  }
}
