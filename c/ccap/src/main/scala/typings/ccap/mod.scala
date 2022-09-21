package typings.ccap

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Captcha = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Captcha]
  inline def apply(options: Options): Captcha = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Captcha]
  inline def apply(width: Double, height: Double, offset: Double): Captcha = (^.asInstanceOf[js.Dynamic].apply(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Captcha]
  
  @JSImport("ccap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Captcha extends StObject {
    
    def get(): js.Tuple2[String, Buffer]
  }
  object Captcha {
    
    inline def apply(get: () => js.Tuple2[String, Buffer]): Captcha = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get))
      __obj.asInstanceOf[Captcha]
    }
    
    extension [Self <: Captcha](x: Self) {
      
      inline def setGet(value: () => js.Tuple2[String, Buffer]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    }
  }
  
  trait Options extends StObject {
    
    // set pic quality,default is 50
    var fontsize: js.UndefOr[Double] = js.undefined
    
    // set font size,default is 57
    // Custom the function to generate captcha text
    var generate: js.UndefOr[js.Function0[String]] = js.undefined
    
    // set width,default is 256
    var height: js.UndefOr[Double] = js.undefined
    
    // set height,default is 60
    var offset: js.UndefOr[Double] = js.undefined
    
    // set text spacing,default is 40
    var quality: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFontsize(value: Double): Self = StObject.set(x, "fontsize", value.asInstanceOf[js.Any])
      
      inline def setFontsizeUndefined: Self = StObject.set(x, "fontsize", js.undefined)
      
      inline def setGenerate(value: () => String): Self = StObject.set(x, "generate", js.Any.fromFunction0(value))
      
      inline def setGenerateUndefined: Self = StObject.set(x, "generate", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
