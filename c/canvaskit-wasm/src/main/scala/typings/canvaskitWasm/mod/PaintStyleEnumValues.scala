package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaintStyleEnumValues extends EmbindEnum {
  
  var Fill: PaintStyle = js.native
  
  var Stroke: PaintStyle = js.native
}
object PaintStyleEnumValues {
  
  @scala.inline
  def apply(Fill: PaintStyle, Stroke: PaintStyle, values: js.Array[Double]): PaintStyleEnumValues = {
    val __obj = js.Dynamic.literal(Fill = Fill.asInstanceOf[js.Any], Stroke = Stroke.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaintStyleEnumValues]
  }
  
  @scala.inline
  implicit class PaintStyleEnumValuesOps[Self <: PaintStyleEnumValues] (val x: Self) extends AnyVal {
    
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
    def setFill(value: PaintStyle): Self = this.set("Fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStroke(value: PaintStyle): Self = this.set("Stroke", value.asInstanceOf[js.Any])
  }
}
