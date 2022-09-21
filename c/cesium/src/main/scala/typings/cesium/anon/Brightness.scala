package typings.cesium.anon

import typings.cesium.mod.SplitDirection
import typings.cesium.mod.TextureMagnificationFilter
import typings.cesium.mod.TextureMinificationFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Brightness extends StObject {
  
  var alpha: js.UndefOr[Double | (js.Function1[/* repeated */ Any, Any])] = js.undefined
  
  var brightness: js.UndefOr[Double | (js.Function1[/* repeated */ Any, Any])] = js.undefined
  
  var colorToAlpha: js.UndefOr[typings.cesium.mod.Color] = js.undefined
  
  var colorToAlphaThreshold: js.UndefOr[Double] = js.undefined
  
  var contrast: js.UndefOr[Double | (js.Function1[/* repeated */ Any, Any])] = js.undefined
  
  var cutoutRectangle: js.UndefOr[typings.cesium.mod.Rectangle] = js.undefined
  
  var dayAlpha: js.UndefOr[Double | (js.Function1[/* repeated */ Any, Any])] = js.undefined
  
  var gamma: js.UndefOr[Double | (js.Function1[/* repeated */ Any, Any])] = js.undefined
  
  var hue: js.UndefOr[Double | (js.Function1[/* repeated */ Any, Any])] = js.undefined
  
  var magnificationFilter: js.UndefOr[TextureMagnificationFilter] = js.undefined
  
  var maximumAnisotropy: js.UndefOr[Double] = js.undefined
  
  var maximumTerrainLevel: js.UndefOr[Double] = js.undefined
  
  var minificationFilter: js.UndefOr[TextureMinificationFilter] = js.undefined
  
  var minimumTerrainLevel: js.UndefOr[Double] = js.undefined
  
  var nightAlpha: js.UndefOr[Double | (js.Function1[/* repeated */ Any, Any])] = js.undefined
  
  var rectangle: js.UndefOr[typings.cesium.mod.Rectangle] = js.undefined
  
  var saturation: js.UndefOr[Double | (js.Function1[/* repeated */ Any, Any])] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
  
  var splitDirection: js.UndefOr[SplitDirection | (js.Function1[/* repeated */ Any, Any])] = js.undefined
}
object Brightness {
  
  inline def apply(): Brightness = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Brightness]
  }
  
  extension [Self <: Brightness](x: Self) {
    
    inline def setAlpha(value: Double | (js.Function1[/* repeated */ Any, Any])): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaFunction1(value: /* repeated */ Any => Any): Self = StObject.set(x, "alpha", js.Any.fromFunction1(value))
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setBrightness(value: Double | (js.Function1[/* repeated */ Any, Any])): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
    
    inline def setBrightnessFunction1(value: /* repeated */ Any => Any): Self = StObject.set(x, "brightness", js.Any.fromFunction1(value))
    
    inline def setBrightnessUndefined: Self = StObject.set(x, "brightness", js.undefined)
    
    inline def setColorToAlpha(value: typings.cesium.mod.Color): Self = StObject.set(x, "colorToAlpha", value.asInstanceOf[js.Any])
    
    inline def setColorToAlphaThreshold(value: Double): Self = StObject.set(x, "colorToAlphaThreshold", value.asInstanceOf[js.Any])
    
    inline def setColorToAlphaThresholdUndefined: Self = StObject.set(x, "colorToAlphaThreshold", js.undefined)
    
    inline def setColorToAlphaUndefined: Self = StObject.set(x, "colorToAlpha", js.undefined)
    
    inline def setContrast(value: Double | (js.Function1[/* repeated */ Any, Any])): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
    
    inline def setContrastFunction1(value: /* repeated */ Any => Any): Self = StObject.set(x, "contrast", js.Any.fromFunction1(value))
    
    inline def setContrastUndefined: Self = StObject.set(x, "contrast", js.undefined)
    
    inline def setCutoutRectangle(value: typings.cesium.mod.Rectangle): Self = StObject.set(x, "cutoutRectangle", value.asInstanceOf[js.Any])
    
    inline def setCutoutRectangleUndefined: Self = StObject.set(x, "cutoutRectangle", js.undefined)
    
    inline def setDayAlpha(value: Double | (js.Function1[/* repeated */ Any, Any])): Self = StObject.set(x, "dayAlpha", value.asInstanceOf[js.Any])
    
    inline def setDayAlphaFunction1(value: /* repeated */ Any => Any): Self = StObject.set(x, "dayAlpha", js.Any.fromFunction1(value))
    
    inline def setDayAlphaUndefined: Self = StObject.set(x, "dayAlpha", js.undefined)
    
    inline def setGamma(value: Double | (js.Function1[/* repeated */ Any, Any])): Self = StObject.set(x, "gamma", value.asInstanceOf[js.Any])
    
    inline def setGammaFunction1(value: /* repeated */ Any => Any): Self = StObject.set(x, "gamma", js.Any.fromFunction1(value))
    
    inline def setGammaUndefined: Self = StObject.set(x, "gamma", js.undefined)
    
    inline def setHue(value: Double | (js.Function1[/* repeated */ Any, Any])): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
    
    inline def setHueFunction1(value: /* repeated */ Any => Any): Self = StObject.set(x, "hue", js.Any.fromFunction1(value))
    
    inline def setHueUndefined: Self = StObject.set(x, "hue", js.undefined)
    
    inline def setMagnificationFilter(value: TextureMagnificationFilter): Self = StObject.set(x, "magnificationFilter", value.asInstanceOf[js.Any])
    
    inline def setMagnificationFilterUndefined: Self = StObject.set(x, "magnificationFilter", js.undefined)
    
    inline def setMaximumAnisotropy(value: Double): Self = StObject.set(x, "maximumAnisotropy", value.asInstanceOf[js.Any])
    
    inline def setMaximumAnisotropyUndefined: Self = StObject.set(x, "maximumAnisotropy", js.undefined)
    
    inline def setMaximumTerrainLevel(value: Double): Self = StObject.set(x, "maximumTerrainLevel", value.asInstanceOf[js.Any])
    
    inline def setMaximumTerrainLevelUndefined: Self = StObject.set(x, "maximumTerrainLevel", js.undefined)
    
    inline def setMinificationFilter(value: TextureMinificationFilter): Self = StObject.set(x, "minificationFilter", value.asInstanceOf[js.Any])
    
    inline def setMinificationFilterUndefined: Self = StObject.set(x, "minificationFilter", js.undefined)
    
    inline def setMinimumTerrainLevel(value: Double): Self = StObject.set(x, "minimumTerrainLevel", value.asInstanceOf[js.Any])
    
    inline def setMinimumTerrainLevelUndefined: Self = StObject.set(x, "minimumTerrainLevel", js.undefined)
    
    inline def setNightAlpha(value: Double | (js.Function1[/* repeated */ Any, Any])): Self = StObject.set(x, "nightAlpha", value.asInstanceOf[js.Any])
    
    inline def setNightAlphaFunction1(value: /* repeated */ Any => Any): Self = StObject.set(x, "nightAlpha", js.Any.fromFunction1(value))
    
    inline def setNightAlphaUndefined: Self = StObject.set(x, "nightAlpha", js.undefined)
    
    inline def setRectangle(value: typings.cesium.mod.Rectangle): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
    
    inline def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
    
    inline def setSaturation(value: Double | (js.Function1[/* repeated */ Any, Any])): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
    
    inline def setSaturationFunction1(value: /* repeated */ Any => Any): Self = StObject.set(x, "saturation", js.Any.fromFunction1(value))
    
    inline def setSaturationUndefined: Self = StObject.set(x, "saturation", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setSplitDirection(value: SplitDirection | (js.Function1[/* repeated */ Any, Any])): Self = StObject.set(x, "splitDirection", value.asInstanceOf[js.Any])
    
    inline def setSplitDirectionFunction1(value: /* repeated */ Any => Any): Self = StObject.set(x, "splitDirection", js.Any.fromFunction1(value))
    
    inline def setSplitDirectionUndefined: Self = StObject.set(x, "splitDirection", js.undefined)
  }
}
