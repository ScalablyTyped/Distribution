package typings.colord

import org.scalablytyped.runtime.Shortcut
import typings.colord.colordStrings.AA
import typings.colord.colordStrings.AAA
import typings.colord.colordStrings.large
import typings.colord.colordStrings.normal
import typings.colord.extendMod.Plugin
import typings.colord.typesMod.AnyColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object a11yMod extends Shortcut {
  
  /**
    * A plugin adding accessibility and color contrast utilities.
    * Follows Web Content Accessibility Guidelines 2.0.
    * https://www.w3.org/TR/WCAG20/
    */
  @JSImport("colord/plugins/a11y", JSImport.Default)
  @js.native
  val default: Plugin = js.native
  
  trait ReadabilityOptions extends StObject {
    
    var level: js.UndefOr[AA | AAA] = js.undefined
    
    var size: js.UndefOr[normal | large] = js.undefined
  }
  object ReadabilityOptions {
    
    inline def apply(): ReadabilityOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadabilityOptions]
    }
    
    extension [Self <: ReadabilityOptions](x: Self) {
      
      inline def setLevel(value: AA | AAA): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setSize(value: normal | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = Plugin
  
  /* This means you don't have to write `default`, but can instead just say `a11yMod.foo` */
  override def _to: Plugin = default
  
  /* augmented module */
  object colordColordAugmentingMod {
    
    @js.native
    trait Colord extends StObject {
      
      /**
        * Calculates a contrast ratio for a color pair.
        * This luminance difference is expressed as a ratio ranging
        * from 1 (e.g. white on white) to 21 (e.g., black on a white).
        * WCAG requires a ratio of at least 4.5 for normal text and 3 for large text.
        * https://www.w3.org/TR/UNDERSTANDING-WCAG20/visual-audio-contrast-contrast.html
        * https://webaim.org/articles/contrast/
        */
      def contrast(): Double = js.native
      def contrast(color2: Colord): Double = js.native
      def contrast(color2: AnyColor): Double = js.native
      
      /**
        * Checks that a background and text color pair conforms to WCAG 2.0 requirements.
        * https://www.w3.org/TR/UNDERSTANDING-WCAG20/visual-audio-contrast-contrast.html
        */
      def isReadable(): Boolean = js.native
      def isReadable(color2: Unit, options: ReadabilityOptions): Boolean = js.native
      def isReadable(color2: Colord): Boolean = js.native
      def isReadable(color2: Colord, options: ReadabilityOptions): Boolean = js.native
      def isReadable(color2: AnyColor): Boolean = js.native
      def isReadable(color2: AnyColor, options: ReadabilityOptions): Boolean = js.native
      
      /**
        * Returns the relative luminance of a color,
        * normalized to 0 for darkest black and 1 for lightest white.
        * https://www.w3.org/TR/WCAG20/#relativeluminancedef
        * https://developer.mozilla.org/en-US/docs/Web/Accessibility/Understanding_Colors_and_Luminance
        */
      def luminance(): Double = js.native
    }
  }
}
