package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRSessionInit extends StObject {
  
  /**
    * When 'dom-overly' is (optionally) requested the application MUST provide configuration for the DOM overlay
    */
  var domOverlay: js.UndefOr[XRDOMOverlayInit] = js.undefined
  
  var optionalFeatures: js.UndefOr[js.Array[String]] = js.undefined
  
  var requiredFeatures: js.UndefOr[js.Array[String]] = js.undefined
  
  var trackedImages: js.UndefOr[js.Array[XRTrackedImageInit]] = js.undefined
}
object XRSessionInit {
  
  inline def apply(): XRSessionInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XRSessionInit]
  }
  
  extension [Self <: XRSessionInit](x: Self) {
    
    inline def setDomOverlay(value: XRDOMOverlayInit): Self = StObject.set(x, "domOverlay", value.asInstanceOf[js.Any])
    
    inline def setDomOverlayUndefined: Self = StObject.set(x, "domOverlay", js.undefined)
    
    inline def setOptionalFeatures(value: js.Array[String]): Self = StObject.set(x, "optionalFeatures", value.asInstanceOf[js.Any])
    
    inline def setOptionalFeaturesUndefined: Self = StObject.set(x, "optionalFeatures", js.undefined)
    
    inline def setOptionalFeaturesVarargs(value: String*): Self = StObject.set(x, "optionalFeatures", js.Array(value*))
    
    inline def setRequiredFeatures(value: js.Array[String]): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
    
    inline def setRequiredFeaturesUndefined: Self = StObject.set(x, "requiredFeatures", js.undefined)
    
    inline def setRequiredFeaturesVarargs(value: String*): Self = StObject.set(x, "requiredFeatures", js.Array(value*))
    
    inline def setTrackedImages(value: js.Array[XRTrackedImageInit]): Self = StObject.set(x, "trackedImages", value.asInstanceOf[js.Any])
    
    inline def setTrackedImagesUndefined: Self = StObject.set(x, "trackedImages", js.undefined)
    
    inline def setTrackedImagesVarargs(value: XRTrackedImageInit*): Self = StObject.set(x, "trackedImages", js.Array(value*))
  }
}
