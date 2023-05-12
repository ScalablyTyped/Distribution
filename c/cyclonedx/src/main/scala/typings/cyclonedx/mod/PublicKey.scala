package typings.cyclonedx.mod

import typings.cyclonedx.cyclonedxStrings.Ed25519
import typings.cyclonedx.cyclonedxStrings.Ed448
import typings.cyclonedx.cyclonedxStrings.`P-256`
import typings.cyclonedx.cyclonedxStrings.`P-384`
import typings.cyclonedx.cyclonedxStrings.`P-521`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.cyclonedx.anon.Crv
  - typings.cyclonedx.anon.Kty
  - typings.cyclonedx.anon.E
*/
trait PublicKey extends StObject
object PublicKey {
  
  inline def Crv(crv: `P-256` | `P-384` | `P-521`, x: String, y: String): typings.cyclonedx.anon.Crv = {
    val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], kty = "EC", x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cyclonedx.anon.Crv]
  }
  
  inline def E(e: String, n: String): typings.cyclonedx.anon.E = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], kty = "RSA", n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cyclonedx.anon.E]
  }
  
  inline def Kty(crv: Ed25519 | Ed448, x: String): typings.cyclonedx.anon.Kty = {
    val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], kty = "OKP", x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cyclonedx.anon.Kty]
  }
}
