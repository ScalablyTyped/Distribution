package typings.csstoolsPostcssIsPseudoClass

import org.scalablytyped.runtime.Shortcut
import typings.csstoolsPostcssIsPseudoClass.csstoolsPostcssIsPseudoClassStrings.warning
import typings.postcss.mod.PluginCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@csstools/postcss-is-pseudo-class", JSImport.Default)
  @js.native
  val default: PluginCreator[pluginOptions] = js.native
  
  type _To = PluginCreator[pluginOptions]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: PluginCreator[pluginOptions] = default
  
  trait pluginOptions extends StObject {
    
    var onComplexSelector: js.UndefOr[warning] = js.undefined
    
    var onPseudoElement: js.UndefOr[warning] = js.undefined
    
    var preserve: js.UndefOr[Boolean] = js.undefined
    
    var specificityMatchingName: js.UndefOr[String] = js.undefined
  }
  object pluginOptions {
    
    inline def apply(): pluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[pluginOptions]
    }
    
    extension [Self <: pluginOptions](x: Self) {
      
      inline def setOnComplexSelector(value: warning): Self = StObject.set(x, "onComplexSelector", value.asInstanceOf[js.Any])
      
      inline def setOnComplexSelectorUndefined: Self = StObject.set(x, "onComplexSelector", js.undefined)
      
      inline def setOnPseudoElement(value: warning): Self = StObject.set(x, "onPseudoElement", value.asInstanceOf[js.Any])
      
      inline def setOnPseudoElementUndefined: Self = StObject.set(x, "onPseudoElement", js.undefined)
      
      inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      inline def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
      
      inline def setSpecificityMatchingName(value: String): Self = StObject.set(x, "specificityMatchingName", value.asInstanceOf[js.Any])
      
      inline def setSpecificityMatchingNameUndefined: Self = StObject.set(x, "specificityMatchingName", js.undefined)
    }
  }
}
