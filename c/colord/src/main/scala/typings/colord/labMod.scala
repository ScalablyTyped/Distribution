package typings.colord

import org.scalablytyped.runtime.Shortcut
import typings.colord.extendMod.Plugin
import typings.colord.typesMod.AnyColor
import typings.colord.typesMod.LabaColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labMod extends Shortcut {
  
  /**
    * A plugin adding support for CIELAB color space.
    * https://en.wikipedia.org/wiki/CIELAB_color_space
    */
  @JSImport("colord/plugins/lab", JSImport.Default)
  @js.native
  val default: Plugin = js.native
  
  type _To = Plugin
  
  /* This means you don't have to write `default`, but can instead just say `labMod.foo` */
  override def _to: Plugin = default
  
  /* augmented module */
  object colordColordAugmentingMod {
    
    @js.native
    trait Colord extends StObject {
      
      /**
        * Calculates the perceived color difference for two colors according to
        * [Delta E2000](https://en.wikipedia.org/wiki/Color_difference#CIEDE2000).
        * Returns a value in [0, 1] range.
        */
      def delta(): Double = js.native
      def delta(color: Colord): Double = js.native
      def delta(color: AnyColor): Double = js.native
      
      /**
        * Converts a color to CIELAB color space and returns an object.
        * The object always includes `alpha` value [0, 1].
        */
      def toLab(): LabaColor = js.native
    }
  }
}
