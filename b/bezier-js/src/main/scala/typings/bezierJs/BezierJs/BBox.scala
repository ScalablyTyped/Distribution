package typings.bezierJs.BezierJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BBox extends StObject {
  
  var x: MinMax = js.native
  
  var y: MinMax = js.native
  
  var z: js.UndefOr[MinMax] = js.native
}
object BBox {
  
  @scala.inline
  def apply(x: MinMax, y: MinMax): BBox = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BBox]
  }
  
  @scala.inline
  implicit class BBoxMutableBuilder[Self <: BBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: MinMax): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: MinMax): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: MinMax): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
