package typings.colord

import org.scalablytyped.runtime.Shortcut
import typings.colord.extendMod.Plugin
import typings.colord.typesMod.HwbaColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hwbMod extends Shortcut {
  
  /**
    * A plugin adding support for HWB (Hue-Whiteness-Blackness) color model.
    * https://en.wikipedia.org/wiki/HWB_color_model
    * https://www.w3.org/TR/css-color-4/#the-hwb-notation
    */
  @JSImport("colord/plugins/hwb", JSImport.Default)
  @js.native
  val default: Plugin = js.native
  
  type _To = Plugin
  
  /* This means you don't have to write `default`, but can instead just say `hwbMod.foo` */
  override def _to: Plugin = default
  
  /* augmented module */
  object colordColordAugmentingMod {
    
    trait Colord extends StObject {
      
      /**
        * Converts a color to HWB (Hue-Whiteness-Blackness) color space and returns an object.
        * https://en.wikipedia.org/wiki/HWB_color_model
        */
      def toHwb(): HwbaColor
      
      /**
        * Converts a color to HWB (Hue-Whiteness-Blackness) color space and returns a string.
        * https://www.w3.org/TR/css-color-4/#the-hwb-notation
        */
      def toHwbString(): String
    }
    object Colord {
      
      inline def apply(toHwb: () => HwbaColor, toHwbString: () => String): Colord = {
        val __obj = js.Dynamic.literal(toHwb = js.Any.fromFunction0(toHwb), toHwbString = js.Any.fromFunction0(toHwbString))
        __obj.asInstanceOf[Colord]
      }
      
      extension [Self <: Colord](x: Self) {
        
        inline def setToHwb(value: () => HwbaColor): Self = StObject.set(x, "toHwb", js.Any.fromFunction0(value))
        
        inline def setToHwbString(value: () => String): Self = StObject.set(x, "toHwbString", js.Any.fromFunction0(value))
      }
    }
  }
}
