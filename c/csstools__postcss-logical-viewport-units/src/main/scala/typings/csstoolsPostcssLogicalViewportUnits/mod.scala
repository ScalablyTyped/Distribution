package typings.csstoolsPostcssLogicalViewportUnits

import org.scalablytyped.runtime.Shortcut
import typings.csstoolsPostcssLogicalViewportUnits.distLibTypesMod.DirectionFlow
import typings.postcss.mod.PluginCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@csstools/postcss-logical-viewport-units", JSImport.Default)
  @js.native
  val default: PluginCreator[pluginOptions] = js.native
  
  type _To = PluginCreator[pluginOptions]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: PluginCreator[pluginOptions] = default
  
  trait pluginOptions extends StObject {
    
    /** Sets the direction for inline. default: left-to-right */
    var inlineDirection: js.UndefOr[DirectionFlow] = js.undefined
    
    /** Preserve the original notation. default: false */
    var preserve: js.UndefOr[Boolean] = js.undefined
  }
  object pluginOptions {
    
    inline def apply(): pluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[pluginOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: pluginOptions] (val x: Self) extends AnyVal {
      
      inline def setInlineDirection(value: DirectionFlow): Self = StObject.set(x, "inlineDirection", value.asInstanceOf[js.Any])
      
      inline def setInlineDirectionUndefined: Self = StObject.set(x, "inlineDirection", js.undefined)
      
      inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      inline def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
    }
  }
}
