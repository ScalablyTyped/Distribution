package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Color3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorDiameterSegments extends StObject {
  
  var color: Color3 = js.native
  
  var diameter: Double = js.native
  
  var segments: Double = js.native
}
object ColorDiameterSegments {
  
  @scala.inline
  def apply(color: Color3, diameter: Double, segments: Double): ColorDiameterSegments = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], diameter = diameter.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorDiameterSegments]
  }
  
  @scala.inline
  implicit class ColorDiameterSegmentsMutableBuilder[Self <: ColorDiameterSegments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color3): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiameter(value: Double): Self = StObject.set(x, "diameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegments(value: Double): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
  }
}
