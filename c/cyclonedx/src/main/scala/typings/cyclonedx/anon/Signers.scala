package typings.cyclonedx.anon

import typings.cyclonedx.mod.Signature
import typings.cyclonedx.mod.SingleSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Signers
  extends StObject
     with Signature {
  
  var signers: js.UndefOr[js.Array[SingleSignature]] = js.undefined
}
object Signers {
  
  inline def apply(): Signers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Signers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Signers] (val x: Self) extends AnyVal {
    
    inline def setSigners(value: js.Array[SingleSignature]): Self = StObject.set(x, "signers", value.asInstanceOf[js.Any])
    
    inline def setSignersUndefined: Self = StObject.set(x, "signers", js.undefined)
    
    inline def setSignersVarargs(value: SingleSignature*): Self = StObject.set(x, "signers", js.Array(value*))
  }
}
