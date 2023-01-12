package typings.cypress.typesLodashMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MixinOptions extends StObject {
  
  /**
    * @see _.chain
    */
  var chain: js.UndefOr[Boolean] = js.undefined
}
object MixinOptions {
  
  inline def apply(): MixinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MixinOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MixinOptions] (val x: Self) extends AnyVal {
    
    inline def setChain(value: Boolean): Self = StObject.set(x, "chain", value.asInstanceOf[js.Any])
    
    inline def setChainUndefined: Self = StObject.set(x, "chain", js.undefined)
  }
}
