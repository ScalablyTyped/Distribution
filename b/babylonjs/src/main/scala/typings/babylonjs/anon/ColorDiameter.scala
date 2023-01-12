package typings.babylonjs.anon

import typings.babylonjs.mathsMathDotcolorMod.Color3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorDiameter extends StObject {
  
  var color: Color3
  
  var diameter: Double
  
  var segments: Double
}
object ColorDiameter {
  
  inline def apply(color: Color3, diameter: Double, segments: Double): ColorDiameter = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], diameter = diameter.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorDiameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorDiameter] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color3): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDiameter(value: Double): Self = StObject.set(x, "diameter", value.asInstanceOf[js.Any])
    
    inline def setSegments(value: Double): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
  }
}
