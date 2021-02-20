package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Segments extends StObject {
  
  var diameter: js.UndefOr[Double] = js.native
  
  var segments: js.UndefOr[Double] = js.native
  
  var sideOrientation: js.UndefOr[Double] = js.native
}
object Segments {
  
  @scala.inline
  def apply(): Segments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Segments]
  }
  
  @scala.inline
  implicit class SegmentsMutableBuilder[Self <: Segments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiameter(value: Double): Self = StObject.set(x, "diameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiameterUndefined: Self = StObject.set(x, "diameter", js.undefined)
    
    @scala.inline
    def setSegments(value: Double): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    @scala.inline
    def setSideOrientation(value: Double): Self = StObject.set(x, "sideOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideOrientationUndefined: Self = StObject.set(x, "sideOrientation", js.undefined)
  }
}
