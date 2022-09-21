package typings.colord

import org.scalablytyped.runtime.Shortcut
import typings.colord.extendMod.Plugin
import typings.colord.typesMod.LchaColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lchMod extends Shortcut {
  
  /**
    * A plugin adding support for CIELCH color space.
    * https://lea.verou.me/2020/04/lch-colors-in-css-what-why-and-how/
    * https://en.wikipedia.org/wiki/CIELAB_color_space#Cylindrical_model
    */
  @JSImport("colord/plugins/lch", JSImport.Default)
  @js.native
  val default: Plugin = js.native
  
  type _To = Plugin
  
  /* This means you don't have to write `default`, but can instead just say `lchMod.foo` */
  override def _to: Plugin = default
  
  /* augmented module */
  object colordColordAugmentingMod {
    
    trait Colord extends StObject {
      
      /**
        * Converts a color to CIELCH (Lightness-Chroma-Hue) color space and returns an object.
        * https://lea.verou.me/2020/04/lch-colors-in-css-what-why-and-how/
        * https://en.wikipedia.org/wiki/CIELAB_color_space#Cylindrical_model
        */
      def toLch(): LchaColor
      
      /**
        * Converts a color to CIELCH (Lightness-Chroma-Hue) color space and returns a string.
        * https://developer.mozilla.org/en-US/docs/Web/CSS/color_value/lch()
        */
      def toLchString(): String
    }
    object Colord {
      
      inline def apply(toLch: () => LchaColor, toLchString: () => String): Colord = {
        val __obj = js.Dynamic.literal(toLch = js.Any.fromFunction0(toLch), toLchString = js.Any.fromFunction0(toLchString))
        __obj.asInstanceOf[Colord]
      }
      
      extension [Self <: Colord](x: Self) {
        
        inline def setToLch(value: () => LchaColor): Self = StObject.set(x, "toLch", js.Any.fromFunction0(value))
        
        inline def setToLchString(value: () => String): Self = StObject.set(x, "toLchString", js.Any.fromFunction0(value))
      }
    }
  }
}
