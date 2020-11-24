package typings.canvaskitWasm.mod

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
  implicit class PathOpEnumValuesOps[Self <: PathOpEnumValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDifference(value: PathOp): Self = this.set("Difference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersect(value: PathOp): Self = this.set("Intersect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseDifference(value: PathOp): Self = this.set("ReverseDifference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnion(value: PathOp): Self = this.set("Union", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXOR(value: PathOp): Self = this.set("XOR", value.asInstanceOf[js.Any])
  }
}
