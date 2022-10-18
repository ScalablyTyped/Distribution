package typings.colord

import org.scalablytyped.runtime.Shortcut
import typings.colord.extendMod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsNamesMod extends Shortcut {
  
  /**
    * Plugin to work with named colors.
    * Adds a parser to read CSS color names and `toName` method.
    * See https://www.w3.org/TR/css-color-4/#named-colors
    * Supports 'transparent' string as defined in
    * https://drafts.csswg.org/css-color/#transparent-color
    */
  @JSImport("colord/plugins/names", JSImport.Default)
  @js.native
  val default: Plugin = js.native
  
  trait ConvertOptions extends StObject {
    
    var closest: js.UndefOr[Boolean] = js.undefined
  }
  object ConvertOptions {
    
    inline def apply(): ConvertOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConvertOptions]
    }
    
    extension [Self <: ConvertOptions](x: Self) {
      
      inline def setClosest(value: Boolean): Self = StObject.set(x, "closest", value.asInstanceOf[js.Any])
      
      inline def setClosestUndefined: Self = StObject.set(x, "closest", js.undefined)
    }
  }
  
  type _To = Plugin
  
  /* This means you don't have to write `default`, but can instead just say `pluginsNamesMod.foo` */
  override def _to: Plugin = default
  
  /* augmented module */
  object colordColordAugmentingMod {
    
    @js.native
    trait Colord extends StObject {
      
      /** Finds CSS color keyword that matches with the color value */
      def toName(): js.UndefOr[String] = js.native
      def toName(options: ConvertOptions): js.UndefOr[String] = js.native
    }
  }
}
