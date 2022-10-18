package typings.colord

import org.scalablytyped.runtime.Shortcut
import typings.colord.extendMod.Plugin
import typings.colord.typesMod.AnyColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsMixMod extends Shortcut {
  
  /**
    * A plugin adding a color mixing utilities.
    */
  @JSImport("colord/plugins/mix", JSImport.Default)
  @js.native
  val default: Plugin = js.native
  
  type _To = Plugin
  
  /* This means you don't have to write `default`, but can instead just say `pluginsMixMod.foo` */
  override def _to: Plugin = default
  
  /* augmented module */
  object colordColordAugmentingMod {
    
    @js.native
    trait Colord extends StObject {
      
      def mix(color2: Colord): Colord = js.native
      def mix(color2: Colord, ratio: Double): Colord = js.native
      /**
        * Produces a mixture of two colors through CIE LAB color space and returns a new Colord instance.
        */
      def mix(color2: AnyColor): Colord = js.native
      def mix(color2: AnyColor, ratio: Double): Colord = js.native
      
      /**
        * Generates a shades palette based on original color.
        */
      def shades(): js.Array[Colord] = js.native
      def shades(count: Double): js.Array[Colord] = js.native
      
      /**
        * Generates a tints palette based on original color.
        */
      def tints(): js.Array[Colord] = js.native
      def tints(count: Double): js.Array[Colord] = js.native
      
      /**
        * Generates a tones palette based on original color.
        */
      def tones(): js.Array[Colord] = js.native
      def tones(count: Double): js.Array[Colord] = js.native
    }
  }
}
