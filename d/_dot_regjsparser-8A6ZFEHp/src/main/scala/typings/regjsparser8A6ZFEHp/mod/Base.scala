package typings.regjsparser8A6ZFEHp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Base[T /* <: AstNodeType */] extends StObject {
  
  var range: js.Tuple2[Double, Double]
  
  var raw: String
  
  var `type`: T
}
object Base {
  
  inline def apply[T /* <: AstNodeType */](range: js.Tuple2[Double, Double], raw: String, `type`: T): Base[T] = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base[T]]
  }
  
  extension [Self <: Base[?], T /* <: AstNodeType */](x: Self & Base[T]) {
    
    inline def setRange(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
