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
    
    /**
      * Warn on complex selectors in `:is` pseudo class functions.
      * default: _not set_
      */
    var onComplexSelector: js.UndefOr[warning] = js.undefined
    
    /**
      * Warn when pseudo elements are used in `:is` pseudo class functions.
      * default: _not set_
      */
    var onPseudoElement: js.UndefOr[warning] = js.undefined
    
    /** Preserve the original notation. default: false */
    var preserve: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Change the selector used to adjust specificity.
      * default: `does-not-exist`.
      */
    var specificityMatchingName: js.UndefOr[String] = js.undefined
  }
  object pluginOptions {
    
    inline def apply(): pluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[pluginOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: pluginOptions] (val x: Self) extends AnyVal {
      
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
