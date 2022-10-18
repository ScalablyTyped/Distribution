package typings.colord

import org.scalablytyped.runtime.Shortcut
import typings.colord.extendMod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsMinifyMod extends Shortcut {
  
  /**
    * A plugin adding a color minification utilities.
    */
  @JSImport("colord/plugins/minify", JSImport.Default)
  @js.native
  val default: Plugin = js.native
  
  trait MinificationOptions extends StObject {
    
    var alphaHex: js.UndefOr[Boolean] = js.undefined
    
    var hex: js.UndefOr[Boolean] = js.undefined
    
    var hsl: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[Boolean] = js.undefined
    
    var rgb: js.UndefOr[Boolean] = js.undefined
    
    var transparent: js.UndefOr[Boolean] = js.undefined
  }
  object MinificationOptions {
    
    inline def apply(): MinificationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MinificationOptions]
    }
    
    extension [Self <: MinificationOptions](x: Self) {
      
      inline def setAlphaHex(value: Boolean): Self = StObject.set(x, "alphaHex", value.asInstanceOf[js.Any])
      
      inline def setAlphaHexUndefined: Self = StObject.set(x, "alphaHex", js.undefined)
      
      inline def setHex(value: Boolean): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      inline def setHexUndefined: Self = StObject.set(x, "hex", js.undefined)
      
      inline def setHsl(value: Boolean): Self = StObject.set(x, "hsl", value.asInstanceOf[js.Any])
      
      inline def setHslUndefined: Self = StObject.set(x, "hsl", js.undefined)
      
      inline def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRgb(value: Boolean): Self = StObject.set(x, "rgb", value.asInstanceOf[js.Any])
      
      inline def setRgbUndefined: Self = StObject.set(x, "rgb", js.undefined)
      
      inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
      
      inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    }
  }
  
  type _To = Plugin
  
  /* This means you don't have to write `default`, but can instead just say `pluginsMinifyMod.foo` */
  override def _to: Plugin = default
  
  /* augmented module */
  object colordColordAugmentingMod {
    
    @js.native
    trait Colord extends StObject {
      
      /** Returns the shortest string representation of the color */
      def minify(): String = js.native
      def minify(options: MinificationOptions): String = js.native
    }
  }
}
