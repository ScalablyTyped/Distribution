package typings.colord

import org.scalablytyped.runtime.Shortcut
import typings.colord.extendMod.Plugin
import typings.colord.typesMod.XyzaColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsXyzMod extends Shortcut {
  
  /**
    * A plugin adding support for CIE XYZ colorspace.
    * Wikipedia: https://en.wikipedia.org/wiki/CIE_1931_color_space
    * Helpful article: https://www.sttmedia.com/colormodel-xyz
    */
  @JSImport("colord/plugins/xyz", JSImport.Default)
  @js.native
  val default: Plugin = js.native
  
  type _To = Plugin
  
  /* This means you don't have to write `default`, but can instead just say `pluginsXyzMod.foo` */
  override def _to: Plugin = default
  
  /* augmented module */
  object colordColordAugmentingMod {
    
    trait Colord extends StObject {
      
      def toXyz(): XyzaColor
    }
    object Colord {
      
      inline def apply(toXyz: () => XyzaColor): Colord = {
        val __obj = js.Dynamic.literal(toXyz = js.Any.fromFunction0(toXyz))
        __obj.asInstanceOf[Colord]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Colord] (val x: Self) extends AnyVal {
        
        inline def setToXyz(value: () => XyzaColor): Self = StObject.set(x, "toXyz", js.Any.fromFunction0(value))
      }
    }
  }
}
