package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrokeCapEnumValues extends EmbindEnum {
  
  var Butt: StrokeCap = js.native
  
  var Round: StrokeCap = js.native
  
  var Square: StrokeCap = js.native
}
object StrokeCapEnumValues {
  
  @scala.inline
  def apply(Butt: StrokeCap, Round: StrokeCap, Square: StrokeCap, values: js.Array[Double]): StrokeCapEnumValues = {
    val __obj = js.Dynamic.literal(Butt = Butt.asInstanceOf[js.Any], Round = Round.asInstanceOf[js.Any], Square = Square.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrokeCapEnumValues]
  }
  
  @scala.inline
  implicit class StrokeCapEnumValuesOps[Self <: StrokeCapEnumValues] (val x: Self) extends AnyVal {
    
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
    def setButt(value: StrokeCap): Self = this.set("Butt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRound(value: StrokeCap): Self = this.set("Round", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSquare(value: StrokeCap): Self = this.set("Square", value.asInstanceOf[js.Any])
  }
}
