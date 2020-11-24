package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FillTypeEnumValues extends EmbindEnum {
  
  var EvenOdd: FillType = js.native
  
  var Winding: FillType = js.native
}
object FillTypeEnumValues {
  
  @scala.inline
  def apply(EvenOdd: FillType, Winding: FillType, values: js.Array[Double]): FillTypeEnumValues = {
    val __obj = js.Dynamic.literal(EvenOdd = EvenOdd.asInstanceOf[js.Any], Winding = Winding.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillTypeEnumValues]
  }
  
  @scala.inline
  implicit class FillTypeEnumValuesOps[Self <: FillTypeEnumValues] (val x: Self) extends AnyVal {
    
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
    def setEvenOdd(value: FillType): Self = this.set("EvenOdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWinding(value: FillType): Self = this.set("Winding", value.asInstanceOf[js.Any])
  }
}
