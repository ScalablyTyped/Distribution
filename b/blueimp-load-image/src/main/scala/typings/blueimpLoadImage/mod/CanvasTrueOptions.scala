package typings.blueimpLoadImage.mod

import typings.blueimpLoadImage.blueimpLoadImageBooleans.`true`
import typings.blueimpLoadImage.blueimpLoadImageStrings.high
import typings.blueimpLoadImage.blueimpLoadImageStrings.low
import typings.blueimpLoadImage.blueimpLoadImageStrings.medium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Some options are only valid if 'canvas' is true.
// In addition, if 'crop' is true or 'orientation' is set,
// it automatically enables 'canvas' so in those cases,
// 'canvas' cannot be false
trait CanvasTrueOptions
  extends StObject
     with CanvasOptions {
  
  var bottom: js.UndefOr[Double] = js.undefined
  
  var canvas: `true`
  
  var crop: js.UndefOr[Boolean] = js.undefined
  
  var downsamplingRatio: js.UndefOr[Double] = js.undefined
  
  var imageSmoothingEnabled: js.UndefOr[Boolean] = js.undefined
  
  var imageSmoothingQuality: js.UndefOr[low | medium | high] = js.undefined
  
  var left: js.UndefOr[Double] = js.undefined
  
  var orientation: js.UndefOr[Orientation] = js.undefined
  
  var pixelRatio: js.UndefOr[Double] = js.undefined
  
  var right: js.UndefOr[Double] = js.undefined
  
  var sourceHeight: js.UndefOr[Double] = js.undefined
  
  var sourceWidth: js.UndefOr[Double] = js.undefined
  
  var top: js.UndefOr[Double] = js.undefined
}
object CanvasTrueOptions {
  
  inline def apply(): CanvasTrueOptions = {
    val __obj = js.Dynamic.literal(canvas = true)
    __obj.asInstanceOf[CanvasTrueOptions]
  }
  
  extension [Self <: CanvasTrueOptions](x: Self) {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setCanvas(value: `true`): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setCrop(value: Boolean): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
    
    inline def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
    
    inline def setDownsamplingRatio(value: Double): Self = StObject.set(x, "downsamplingRatio", value.asInstanceOf[js.Any])
    
    inline def setDownsamplingRatioUndefined: Self = StObject.set(x, "downsamplingRatio", js.undefined)
    
    inline def setImageSmoothingEnabled(value: Boolean): Self = StObject.set(x, "imageSmoothingEnabled", value.asInstanceOf[js.Any])
    
    inline def setImageSmoothingEnabledUndefined: Self = StObject.set(x, "imageSmoothingEnabled", js.undefined)
    
    inline def setImageSmoothingQuality(value: low | medium | high): Self = StObject.set(x, "imageSmoothingQuality", value.asInstanceOf[js.Any])
    
    inline def setImageSmoothingQualityUndefined: Self = StObject.set(x, "imageSmoothingQuality", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
    
    inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setSourceHeight(value: Double): Self = StObject.set(x, "sourceHeight", value.asInstanceOf[js.Any])
    
    inline def setSourceHeightUndefined: Self = StObject.set(x, "sourceHeight", js.undefined)
    
    inline def setSourceWidth(value: Double): Self = StObject.set(x, "sourceWidth", value.asInstanceOf[js.Any])
    
    inline def setSourceWidthUndefined: Self = StObject.set(x, "sourceWidth", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
