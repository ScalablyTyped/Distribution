package typings.cyclonedx.anon

import typings.cyclonedx.mod.Signature
import typings.cyclonedx.mod.SingleSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chain
  extends StObject
     with Signature {
  
  var chain: js.UndefOr[js.Array[SingleSignature]] = js.undefined
}
object Chain {
  
  inline def apply(): Chain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Chain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Chain] (val x: Self) extends AnyVal {
    
    inline def setChain(value: js.Array[SingleSignature]): Self = StObject.set(x, "chain", value.asInstanceOf[js.Any])
    
    inline def setChainUndefined: Self = StObject.set(x, "chain", js.undefined)
    
    inline def setChainVarargs(value: SingleSignature*): Self = StObject.set(x, "chain", js.Array(value*))
  }
}
