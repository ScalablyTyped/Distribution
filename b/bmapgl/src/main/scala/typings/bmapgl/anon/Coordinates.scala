package typings.bmapgl.anon

import typings.bmapgl.bmapglStrings.LineString
import typings.bmapgl.bmapglStrings.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Coordinates extends js.Object {
  
  var coordinates: js.Array[_] = js.native
  
  var `type`: typings.bmapgl.bmapglStrings.Point | LineString | Polygon = js.native
}
object Coordinates {
  
  @scala.inline
  def apply(coordinates: js.Array[_], `type`: typings.bmapgl.bmapglStrings.Point | LineString | Polygon): Coordinates = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coordinates]
  }
  
  @scala.inline
  implicit class CoordinatesOps[Self <: Coordinates] (val x: Self) extends AnyVal {
    
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
    def setCoordinatesVarargs(value: js.Any*): Self = this.set("coordinates", js.Array(value :_*))
    
    @scala.inline
    def setCoordinates(value: js.Array[_]): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.bmapgl.bmapglStrings.Point | LineString | Polygon): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
