package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Variance_
  extends StObject
     with BaseNode {
  
  var kind: "minus" | "plus"
  
  @JSName("type")
  var type_Variance_ : "Variance"
}
object Variance_ {
  
  inline def apply(kind: "minus" | "plus"): Variance_ = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Variance")
    __obj.asInstanceOf[Variance_]
  }
  
  extension [Self <: Variance_](x: Self) {
    
    inline def setKind(value: "minus" | "plus"): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setType(value: "Variance"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
