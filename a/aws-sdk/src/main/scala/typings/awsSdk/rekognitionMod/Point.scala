package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Point extends StObject {
  
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
  implicit class PointMutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Float): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "X", js.undefined)
    
    @scala.inline
    def setY(value: Float): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "Y", js.undefined)
  }
}
