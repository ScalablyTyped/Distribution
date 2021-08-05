package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOpEnumValues
  extends StObject
     with EmbindEnum {
  
  var Difference: PathOp
  
  var Intersect: PathOp
  
  var ReverseDifference: PathOp
  
  var Union: PathOp
  
  var XOR: PathOp
}
object PathOpEnumValues {
  
  inline def apply(
    Difference: PathOp,
    Intersect: PathOp,
    ReverseDifference: PathOp,
    Union: PathOp,
    XOR: PathOp,
    values: js.Array[Double]
  ): PathOpEnumValues = {
    val __obj = js.Dynamic.literal(Difference = Difference.asInstanceOf[js.Any], Intersect = Intersect.asInstanceOf[js.Any], ReverseDifference = ReverseDifference.asInstanceOf[js.Any], Union = Union.asInstanceOf[js.Any], XOR = XOR.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOpEnumValues]
  }
  
  extension [Self <: PathOpEnumValues](x: Self) {
    
    inline def setDifference(value: PathOp): Self = StObject.set(x, "Difference", value.asInstanceOf[js.Any])
    
    inline def setIntersect(value: PathOp): Self = StObject.set(x, "Intersect", value.asInstanceOf[js.Any])
    
    inline def setReverseDifference(value: PathOp): Self = StObject.set(x, "ReverseDifference", value.asInstanceOf[js.Any])
    
    inline def setUnion(value: PathOp): Self = StObject.set(x, "Union", value.asInstanceOf[js.Any])
    
    inline def setXOR(value: PathOp): Self = StObject.set(x, "XOR", value.asInstanceOf[js.Any])
  }
}
