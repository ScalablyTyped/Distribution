package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for texture filtering
  */
trait IHDRFilteringOptions extends StObject {
  
  /**
    * Scales pixel intensity for the input HDR map.
    */
  var hdrScale: js.UndefOr[Double] = js.undefined
  
  /**
    * Quality of the filter. Should be `Constants.TEXTURE_FILTERING_QUALITY_OFFLINE` for prefiltering
    */
  var quality: js.UndefOr[Double] = js.undefined
}
object IHDRFilteringOptions {
  
  inline def apply(): IHDRFilteringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHDRFilteringOptions]
  }
  
  extension [Self <: IHDRFilteringOptions](x: Self) {
    
    inline def setHdrScale(value: Double): Self = StObject.set(x, "hdrScale", value.asInstanceOf[js.Any])
    
    inline def setHdrScaleUndefined: Self = StObject.set(x, "hdrScale", js.undefined)
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
  }
}
