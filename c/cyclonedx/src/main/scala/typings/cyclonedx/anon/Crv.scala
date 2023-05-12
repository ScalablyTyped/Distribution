package typings.cyclonedx.anon

import typings.cyclonedx.cyclonedxStrings.EC
import typings.cyclonedx.cyclonedxStrings.`P-256`
import typings.cyclonedx.cyclonedxStrings.`P-384`
import typings.cyclonedx.cyclonedxStrings.`P-521`
import typings.cyclonedx.mod.PublicKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Crv
  extends StObject
     with PublicKey {
  
  var crv: `P-256` | `P-384` | `P-521`
  
  var kty: EC
  
  var x: String
  
  var y: String
}
object Crv {
  
  inline def apply(crv: `P-256` | `P-384` | `P-521`, x: String, y: String): Crv = {
    val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], kty = "EC", x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Crv]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Crv] (val x: Self) extends AnyVal {
    
    inline def setCrv(value: `P-256` | `P-384` | `P-521`): Self = StObject.set(x, "crv", value.asInstanceOf[js.Any])
    
    inline def setKty(value: EC): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
    
    inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
