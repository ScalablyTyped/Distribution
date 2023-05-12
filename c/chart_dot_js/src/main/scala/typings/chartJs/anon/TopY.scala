package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopY extends StObject {
  
  /** Padding on the (relative) bottom side of this axis label. */
  var bottom: Double
  
  /** Padding on the (relative) top side of this axis label. */
  var top: Double
  
  /** This is a shorthand for defining top/bottom to the same values. */
  var y: Double
}
object TopY {
  
  inline def apply(bottom: Double, top: Double, y: Double): TopY = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopY]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopY] (val x: Self) extends AnyVal {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
