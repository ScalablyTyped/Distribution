package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiameterSegments extends StObject {
  
  var diameter: Double = js.native
  
  var segments: Double = js.native
}
object DiameterSegments {
  
  @scala.inline
  def apply(diameter: Double, segments: Double): DiameterSegments = {
    val __obj = js.Dynamic.literal(diameter = diameter.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiameterSegments]
  }
  
  @scala.inline
  implicit class DiameterSegmentsMutableBuilder[Self <: DiameterSegments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiameter(value: Double): Self = StObject.set(x, "diameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegments(value: Double): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
  }
}
