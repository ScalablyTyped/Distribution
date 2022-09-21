package typings.colord

import org.scalablytyped.runtime.Shortcut
import typings.colord.extendMod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object harmoniesMod extends Shortcut {
  
  /**
    * A plugin adding functionality to generate harmony colors.
    * https://en.wikipedia.org/wiki/Harmony_(color)
    */
  @JSImport("colord/plugins/harmonies", JSImport.Default)
  @js.native
  val default: Plugin = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.colord.colordStrings.analogous
    - typings.colord.colordStrings.complementary
    - typings.colord.colordStrings.`double-split-complementary`
    - typings.colord.colordStrings.rectangle
    - typings.colord.colordStrings.`split-complementary`
    - typings.colord.colordStrings.tetradic
    - typings.colord.colordStrings.triadic
  */
  trait HarmonyType extends StObject
  object HarmonyType {
    
    inline def analogous: typings.colord.colordStrings.analogous = "analogous".asInstanceOf[typings.colord.colordStrings.analogous]
    
    inline def complementary: typings.colord.colordStrings.complementary = "complementary".asInstanceOf[typings.colord.colordStrings.complementary]
    
    inline def `double-split-complementary`: typings.colord.colordStrings.`double-split-complementary` = "double-split-complementary".asInstanceOf[typings.colord.colordStrings.`double-split-complementary`]
    
    inline def rectangle: typings.colord.colordStrings.rectangle = "rectangle".asInstanceOf[typings.colord.colordStrings.rectangle]
    
    inline def `split-complementary`: typings.colord.colordStrings.`split-complementary` = "split-complementary".asInstanceOf[typings.colord.colordStrings.`split-complementary`]
    
    inline def tetradic: typings.colord.colordStrings.tetradic = "tetradic".asInstanceOf[typings.colord.colordStrings.tetradic]
    
    inline def triadic: typings.colord.colordStrings.triadic = "triadic".asInstanceOf[typings.colord.colordStrings.triadic]
  }
  
  type _To = Plugin
  
  /* This means you don't have to write `default`, but can instead just say `harmoniesMod.foo` */
  override def _to: Plugin = default
  
  /* augmented module */
  object colordColordAugmentingMod {
    
    @js.native
    trait Colord extends StObject {
      
      /**
        * Returns an array of harmony colors as `Colord` instances.
        */
      def harmonies(): js.Array[Colord] = js.native
      def harmonies(`type`: HarmonyType): js.Array[Colord] = js.native
    }
  }
}
