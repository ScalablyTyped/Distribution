package typings.bezierJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inflection extends StObject {
  
  var values: js.Array[Double]
  
  var x: js.Array[Double]
  
  var y: js.Array[Double]
  
  var z: js.UndefOr[js.Array[Double]] = js.undefined
}
object Inflection {
  
  inline def apply(values: js.Array[Double], x: js.Array[Double], y: js.Array[Double]): Inflection = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inflection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Inflection] (val x: Self) extends AnyVal {
    
    inline def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value*))
    
    inline def setX(value: js.Array[Double]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXVarargs(value: Double*): Self = StObject.set(x, "x", js.Array(value*))
    
    inline def setY(value: js.Array[Double]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYVarargs(value: Double*): Self = StObject.set(x, "y", js.Array(value*))
    
    inline def setZ(value: js.Array[Double]): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    
    inline def setZVarargs(value: Double*): Self = StObject.set(x, "z", js.Array(value*))
  }
}
