package typings.babelTypes.anon

import typings.babelTypes.libMod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChainOf extends StObject {
  
  var chainOf: js.Array[Validator]
}
object ChainOf {
  
  inline def apply(chainOf: js.Array[Validator]): ChainOf = {
    val __obj = js.Dynamic.literal(chainOf = chainOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChainOf]
  }
  
  extension [Self <: ChainOf](x: Self) {
    
    inline def setChainOf(value: js.Array[Validator]): Self = StObject.set(x, "chainOf", value.asInstanceOf[js.Any])
    
    inline def setChainOfVarargs(value: Validator*): Self = StObject.set(x, "chainOf", js.Array(value*))
  }
}
