package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRGeometryDetectorOptions extends StObject {
  
  var detectionBoundary: js.UndefOr[XRDetectionBoundary] = js.undefined
  
  var updateInterval: js.UndefOr[Double] = js.undefined
}
object XRGeometryDetectorOptions {
  
  inline def apply(): XRGeometryDetectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XRGeometryDetectorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XRGeometryDetectorOptions] (val x: Self) extends AnyVal {
    
    inline def setDetectionBoundary(value: XRDetectionBoundary): Self = StObject.set(x, "detectionBoundary", value.asInstanceOf[js.Any])
    
    inline def setDetectionBoundaryUndefined: Self = StObject.set(x, "detectionBoundary", js.undefined)
    
    inline def setUpdateInterval(value: Double): Self = StObject.set(x, "updateInterval", value.asInstanceOf[js.Any])
    
    inline def setUpdateIntervalUndefined: Self = StObject.set(x, "updateInterval", js.undefined)
  }
}
