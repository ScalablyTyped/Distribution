package typings.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Opacity extends StObject {
  
  /** Class to apply to the region. */
  var `class`: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  /** Points should be added in counter-clockwise direction  to close the polygon. */
  var points: js.Array[X]
  
  var text: js.UndefOr[js.Function2[/* value */ Double, /* percentage */ Double, String]] = js.undefined
}
object Opacity {
  
  inline def apply(points: js.Array[X]): Opacity = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opacity]
  }
  
  extension [Self <: Opacity](x: Self) {
    
    inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPoints(value: js.Array[X]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: X*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setText(value: (/* value */ Double, /* percentage */ Double) => String): Self = StObject.set(x, "text", js.Any.fromFunction2(value))
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
