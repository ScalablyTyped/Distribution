package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathOpEnumValues extends EmbindEnum {
  
  var Difference: PathOp = js.native
  
  var Intersect: PathOp = js.native
  
  var ReverseDifference: PathOp = js.native
  
  var Union: PathOp = js.native
  
  var XOR: PathOp = js.native
}
object PathOpEnumValues {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class PathOpEnumValuesMutableBuilder[Self <: PathOpEnumValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDifference(value: PathOp): Self = StObject.set(x, "Difference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersect(value: PathOp): Self = StObject.set(x, "Intersect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseDifference(value: PathOp): Self = StObject.set(x, "ReverseDifference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnion(value: PathOp): Self = StObject.set(x, "Union", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXOR(value: PathOp): Self = StObject.set(x, "XOR", value.asInstanceOf[js.Any])
  }
}
