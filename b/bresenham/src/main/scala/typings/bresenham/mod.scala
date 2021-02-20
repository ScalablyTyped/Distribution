package typings.bresenham

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bresenham", JSImport.Namespace)
  @js.native
  def apply(x0: Double, y0: Double, x1: Double, y1: Double): js.Array[Point] = js.native
  @JSImport("bresenham", JSImport.Namespace)
  @js.native
  def apply(
    x0: Double,
    y0: Double,
    x1: Double,
    y1: Double,
    fn: js.Function2[/* x */ Double, /* y */ Double, Unit]
  ): Unit = js.native
  
  @js.native
  trait Point extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Point {
    
    @scala.inline
    def apply(x: Double, y: Double): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    @scala.inline
    implicit class PointMutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
