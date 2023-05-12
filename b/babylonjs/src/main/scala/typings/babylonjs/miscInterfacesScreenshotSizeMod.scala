package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscInterfacesScreenshotSizeMod {
  
  trait IScreenshotSize extends StObject {
    
    /**
      * Height of the final screenshot image.
      * If only one of the two values is provided, the other will be calculated based on the camera's aspect ratio.
      * If both finalWidth and finalHeight are not provided, width and height will be used instead
      * finalWidth and finalHeight are used only by CreateScreenshotUsingRenderTarget, not by CreateScreenshot!
      */
    var finalHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Width of the final screenshot image.
      * If only one of the two values is provided, the other will be calculated based on the camera's aspect ratio.
      * If both finalWidth and finalHeight are not provided, width and height will be used instead.
      * finalWidth and finalHeight are used only by CreateScreenshotUsingRenderTarget, not by CreateScreenshot!
      */
    var finalWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * number in pixels for canvas height. It is the height of the texture used to render the scene
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * multiplier allowing render at a higher or lower resolution
      * If value is defined then width and height will be multiplied by this value
      */
    var precision: js.UndefOr[Double] = js.undefined
    
    /**
      * number in pixels for canvas width. It is the width of the texture used to render the scene
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object IScreenshotSize {
    
    inline def apply(): IScreenshotSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IScreenshotSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IScreenshotSize] (val x: Self) extends AnyVal {
      
      inline def setFinalHeight(value: Double): Self = StObject.set(x, "finalHeight", value.asInstanceOf[js.Any])
      
      inline def setFinalHeightUndefined: Self = StObject.set(x, "finalHeight", js.undefined)
      
      inline def setFinalWidth(value: Double): Self = StObject.set(x, "finalWidth", value.asInstanceOf[js.Any])
      
      inline def setFinalWidthUndefined: Self = StObject.set(x, "finalWidth", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
