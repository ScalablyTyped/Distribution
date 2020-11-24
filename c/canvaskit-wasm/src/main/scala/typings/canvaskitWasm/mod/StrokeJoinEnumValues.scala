package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrokeJoinEnumValues extends EmbindEnum {
  
  var Bevel: StrokeJoin = js.native
  
  var Miter: StrokeJoin = js.native
  
  var Round: StrokeJoin = js.native
}
object StrokeJoinEnumValues {
  
  @scala.inline
  def apply(Bevel: StrokeJoin, Miter: StrokeJoin, Round: StrokeJoin, values: js.Array[Double]): StrokeJoinEnumValues = {
    val __obj = js.Dynamic.literal(Bevel = Bevel.asInstanceOf[js.Any], Miter = Miter.asInstanceOf[js.Any], Round = Round.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrokeJoinEnumValues]
  }
  
  @scala.inline
  implicit class StrokeJoinEnumValuesOps[Self <: StrokeJoinEnumValues] (val x: Self) extends AnyVal {
    
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
    def setBevel(value: StrokeJoin): Self = this.set("Bevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiter(value: StrokeJoin): Self = this.set("Miter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRound(value: StrokeJoin): Self = this.set("Round", value.asInstanceOf[js.Any])
  }
}
