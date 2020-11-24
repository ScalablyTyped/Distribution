package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Point extends js.Object {
  
  /**
    * The value of the X coordinate for a point on a Polygon.
    */
  var X: js.UndefOr[Float] = js.native
  
  /**
    * The value of the Y coordinate for a point on a Polygon.
    */
  var Y: js.UndefOr[Float] = js.native
}
object Point {
  
  @scala.inline
  def apply(): Point = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Point]
  }
  
  @scala.inline
  implicit class PointOps[Self <: Point] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setX(value: Float): Self = this.set("X", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("X", js.undefined)
    
    @scala.inline
    def setY(value: Float): Self = this.set("Y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("Y", js.undefined)
  }
}
