package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointModeEnumValues extends EmbindEnum {
  
  var Lines: PointMode = js.native
  
  var Points: PointMode = js.native
  
  var Polygon: PointMode = js.native
}
object PointModeEnumValues {
  
  @scala.inline
  def apply(Lines: PointMode, Points: PointMode, Polygon: PointMode, values: js.Array[Double]): PointModeEnumValues = {
    val __obj = js.Dynamic.literal(Lines = Lines.asInstanceOf[js.Any], Points = Points.asInstanceOf[js.Any], Polygon = Polygon.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointModeEnumValues]
  }
  
  @scala.inline
  implicit class PointModeEnumValuesOps[Self <: PointModeEnumValues] (val x: Self) extends AnyVal {
    
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
    def setLines(value: PointMode): Self = this.set("Lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoints(value: PointMode): Self = this.set("Points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygon(value: PointMode): Self = this.set("Polygon", value.asInstanceOf[js.Any])
  }
}
