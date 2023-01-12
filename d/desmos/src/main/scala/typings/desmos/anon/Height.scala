package typings.desmos.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Height extends StObject {
  
  /**
    * Height of the screenshot in pixels. Defaults to current height of graphpaper in pixels.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Determines whether to override the default behavior of stripping out the axis numbers from small images. Only relevant if opts.width or opts.height is less than 256px.
    * @default false
    */
  var preserveAxisNumbers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Oversampling factor. Larger values are useful for producing images that will look good on high pixel density ("retina") screens.
    * @default 1
    */
  var targetPixelRatio: js.UndefOr[Double] = js.undefined
  
  /**
    * Width of the screenshot in pixels. Defaults to current width of graphaper.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object Height {
  
  inline def apply(): Height = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Height]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setPreserveAxisNumbers(value: Boolean): Self = StObject.set(x, "preserveAxisNumbers", value.asInstanceOf[js.Any])
    
    inline def setPreserveAxisNumbersUndefined: Self = StObject.set(x, "preserveAxisNumbers", js.undefined)
    
    inline def setTargetPixelRatio(value: Double): Self = StObject.set(x, "targetPixelRatio", value.asInstanceOf[js.Any])
    
    inline def setTargetPixelRatioUndefined: Self = StObject.set(x, "targetPixelRatio", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
