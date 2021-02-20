package typings.ccap

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ccap", JSImport.Namespace)
  @js.native
  def apply(): Captcha = js.native
  @JSImport("ccap", JSImport.Namespace)
  @js.native
  def apply(options: Options): Captcha = js.native
  @JSImport("ccap", JSImport.Namespace)
  @js.native
  def apply(width: Double, height: Double, offset: Double): Captcha = js.native
  
  @js.native
  trait Captcha extends StObject {
    
    def get(): js.Tuple2[String, Buffer] = js.native
  }
  object Captcha {
    
    @scala.inline
    def apply(get: () => js.Tuple2[String, Buffer]): Captcha = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get))
      __obj.asInstanceOf[Captcha]
    }
    
    @scala.inline
    implicit class CaptchaMutableBuilder[Self <: Captcha] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: () => js.Tuple2[String, Buffer]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    // set pic quality,default is 50
    var fontsize: js.UndefOr[Double] = js.native
    
    // set font size,default is 57
    // Custom the function to generate captcha text
    var generate: js.UndefOr[js.Function0[String]] = js.native
    
    // set width,default is 256
    var height: js.UndefOr[Double] = js.native
    
    // set height,default is 60
    var offset: js.UndefOr[Double] = js.native
    
    // set text spacing,default is 40
    var quality: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontsize(value: Double): Self = StObject.set(x, "fontsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontsizeUndefined: Self = StObject.set(x, "fontsize", js.undefined)
      
      @scala.inline
      def setGenerate(value: () => String): Self = StObject.set(x, "generate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGenerateUndefined: Self = StObject.set(x, "generate", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
