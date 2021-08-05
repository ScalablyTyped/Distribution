package typings.cesium.anon

import typings.cesium.mod.ImageryLayer
import typings.cesium.mod.ImageryLayer.ValueFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Brightness extends StObject {
  
  var alpha: js.UndefOr[Double | ValueFunc] = js.undefined
  
  var brightness: js.UndefOr[Double | ValueFunc] = js.undefined
  
  var contrast: js.UndefOr[Double | ValueFunc] = js.undefined
  
  var gamma: js.UndefOr[Double | ValueFunc] = js.undefined
  
  var hue: js.UndefOr[Double | ValueFunc] = js.undefined
  
  var maximumAnisotropy: js.UndefOr[Double] = js.undefined
  
  var maximumTerrainLevel: js.UndefOr[Double] = js.undefined
  
  var minimumTerrainLevel: js.UndefOr[Double] = js.undefined
  
  var rectangle: js.UndefOr[typings.cesium.mod.Rectangle] = js.undefined
  
  var saturation: js.UndefOr[Double | ValueFunc] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
}
object Brightness {
  
  inline def apply(): Brightness = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Brightness]
  }
  
  extension [Self <: Brightness](x: Self) {
    
    inline def setAlpha(value: Double | ValueFunc): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaFunction5(
      value: (/* frameState */ js.Any, /* layer */ ImageryLayer, /* x */ Double, /* y */ Double, /* level */ Double) => Double
    ): Self = StObject.set(x, "alpha", js.Any.fromFunction5(value))
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setBrightness(value: Double | ValueFunc): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
    
    inline def setBrightnessFunction5(
      value: (/* frameState */ js.Any, /* layer */ ImageryLayer, /* x */ Double, /* y */ Double, /* level */ Double) => Double
    ): Self = StObject.set(x, "brightness", js.Any.fromFunction5(value))
    
    inline def setBrightnessUndefined: Self = StObject.set(x, "brightness", js.undefined)
    
    inline def setContrast(value: Double | ValueFunc): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
    
    inline def setContrastFunction5(
      value: (/* frameState */ js.Any, /* layer */ ImageryLayer, /* x */ Double, /* y */ Double, /* level */ Double) => Double
    ): Self = StObject.set(x, "contrast", js.Any.fromFunction5(value))
    
    inline def setContrastUndefined: Self = StObject.set(x, "contrast", js.undefined)
    
    inline def setGamma(value: Double | ValueFunc): Self = StObject.set(x, "gamma", value.asInstanceOf[js.Any])
    
    inline def setGammaFunction5(
      value: (/* frameState */ js.Any, /* layer */ ImageryLayer, /* x */ Double, /* y */ Double, /* level */ Double) => Double
    ): Self = StObject.set(x, "gamma", js.Any.fromFunction5(value))
    
    inline def setGammaUndefined: Self = StObject.set(x, "gamma", js.undefined)
    
    inline def setHue(value: Double | ValueFunc): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
    
    inline def setHueFunction5(
      value: (/* frameState */ js.Any, /* layer */ ImageryLayer, /* x */ Double, /* y */ Double, /* level */ Double) => Double
    ): Self = StObject.set(x, "hue", js.Any.fromFunction5(value))
    
    inline def setHueUndefined: Self = StObject.set(x, "hue", js.undefined)
    
    inline def setMaximumAnisotropy(value: Double): Self = StObject.set(x, "maximumAnisotropy", value.asInstanceOf[js.Any])
    
    inline def setMaximumAnisotropyUndefined: Self = StObject.set(x, "maximumAnisotropy", js.undefined)
    
    inline def setMaximumTerrainLevel(value: Double): Self = StObject.set(x, "maximumTerrainLevel", value.asInstanceOf[js.Any])
    
    inline def setMaximumTerrainLevelUndefined: Self = StObject.set(x, "maximumTerrainLevel", js.undefined)
    
    inline def setMinimumTerrainLevel(value: Double): Self = StObject.set(x, "minimumTerrainLevel", value.asInstanceOf[js.Any])
    
    inline def setMinimumTerrainLevelUndefined: Self = StObject.set(x, "minimumTerrainLevel", js.undefined)
    
    inline def setRectangle(value: typings.cesium.mod.Rectangle): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
    
    inline def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
    
    inline def setSaturation(value: Double | ValueFunc): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
    
    inline def setSaturationFunction5(
      value: (/* frameState */ js.Any, /* layer */ ImageryLayer, /* x */ Double, /* y */ Double, /* level */ Double) => Double
    ): Self = StObject.set(x, "saturation", js.Any.fromFunction5(value))
    
    inline def setSaturationUndefined: Self = StObject.set(x, "saturation", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
