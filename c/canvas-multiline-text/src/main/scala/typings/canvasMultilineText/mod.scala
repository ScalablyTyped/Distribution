package typings.canvasMultilineText

import typings.canvasMultilineText.anon.Height
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(ctx: CanvasRenderingContext2D, text: String): Double = (^.asInstanceOf[js.Dynamic].apply(ctx.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(ctx: CanvasRenderingContext2D, text: String, opts: Options): Double = (^.asInstanceOf[js.Dynamic].apply(ctx.asInstanceOf[js.Any], text.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("canvas-multiline-text", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var font: js.UndefOr[String] = js.undefined
    
    var lineHeight: js.UndefOr[Double] = js.undefined
    
    var maxFontSize: js.UndefOr[Double] = js.undefined
    
    var minFontSize: js.UndefOr[Double] = js.undefined
    
    var rect: js.UndefOr[Height] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setMaxFontSize(value: Double): Self = StObject.set(x, "maxFontSize", value.asInstanceOf[js.Any])
      
      inline def setMaxFontSizeUndefined: Self = StObject.set(x, "maxFontSize", js.undefined)
      
      inline def setMinFontSize(value: Double): Self = StObject.set(x, "minFontSize", value.asInstanceOf[js.Any])
      
      inline def setMinFontSizeUndefined: Self = StObject.set(x, "minFontSize", js.undefined)
      
      inline def setRect(value: Height): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
      
      inline def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
