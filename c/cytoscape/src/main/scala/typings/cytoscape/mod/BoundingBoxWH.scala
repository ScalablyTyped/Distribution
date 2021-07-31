package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoundingBoxWH extends StObject {
  
  var h: Double
  
  var w: Double
  
  var x1: Double
  
  var y1: Double
}
object BoundingBoxWH {
  
  @scala.inline
  def apply(h: Double, w: Double, x1: Double, y1: Double): BoundingBoxWH = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundingBoxWH]
  }
  
  @scala.inline
  implicit class BoundingBoxWHMutableBuilder[Self <: BoundingBoxWH] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
  }
}
