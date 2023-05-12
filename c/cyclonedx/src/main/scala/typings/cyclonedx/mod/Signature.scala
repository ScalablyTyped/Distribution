package typings.cyclonedx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.cyclonedx.anon.Signers
  - typings.cyclonedx.anon.Chain
  - typings.cyclonedx.mod.SingleSignature
*/
trait Signature extends StObject
object Signature {
  
  inline def Chain(): typings.cyclonedx.anon.Chain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.cyclonedx.anon.Chain]
  }
  
  inline def Signers(): typings.cyclonedx.anon.Signers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.cyclonedx.anon.Signers]
  }
  
  inline def SingleSignature(algorithm: SigAlgorithm, value: String): typings.cyclonedx.mod.SingleSignature = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cyclonedx.mod.SingleSignature]
  }
}
