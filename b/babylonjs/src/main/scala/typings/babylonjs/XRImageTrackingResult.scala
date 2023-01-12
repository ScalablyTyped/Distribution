package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRImageTrackingResult extends StObject {
  
  val imageSpace: XRSpace
  
  val index: Double
  
  val measuredWidthInMeters: Double
  
  val trackingState: XRImageTrackingState
}
object XRImageTrackingResult {
  
  inline def apply(
    imageSpace: XRSpace,
    index: Double,
    measuredWidthInMeters: Double,
    trackingState: XRImageTrackingState
  ): XRImageTrackingResult = {
    val __obj = js.Dynamic.literal(imageSpace = imageSpace.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], measuredWidthInMeters = measuredWidthInMeters.asInstanceOf[js.Any], trackingState = trackingState.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRImageTrackingResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XRImageTrackingResult] (val x: Self) extends AnyVal {
    
    inline def setImageSpace(value: XRSpace): Self = StObject.set(x, "imageSpace", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setMeasuredWidthInMeters(value: Double): Self = StObject.set(x, "measuredWidthInMeters", value.asInstanceOf[js.Any])
    
    inline def setTrackingState(value: XRImageTrackingState): Self = StObject.set(x, "trackingState", value.asInstanceOf[js.Any])
  }
}
