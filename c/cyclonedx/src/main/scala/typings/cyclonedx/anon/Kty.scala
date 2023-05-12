package typings.cyclonedx.anon

import typings.cyclonedx.cyclonedxStrings.Ed25519
import typings.cyclonedx.cyclonedxStrings.Ed448
import typings.cyclonedx.cyclonedxStrings.OKP
import typings.cyclonedx.mod.PublicKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Kty
  extends StObject
     with PublicKey {
  
  var crv: Ed25519 | Ed448
  
  var kty: OKP
  
  var x: String
}
object Kty {
  
  inline def apply(crv: Ed25519 | Ed448, x: String): Kty = {
    val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], kty = "OKP", x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[Kty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Kty] (val x: Self) extends AnyVal {
    
    inline def setCrv(value: Ed25519 | Ed448): Self = StObject.set(x, "crv", value.asInstanceOf[js.Any])
    
    inline def setKty(value: OKP): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
    
    inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
  }
}
