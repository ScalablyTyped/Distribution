package typings.csstoolsPostcssUnsetValue

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.PluginCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@csstools/postcss-unset-value", JSImport.Default)
  @js.native
  val default: PluginCreator[pluginOptions] = js.native
  
  type _To = PluginCreator[pluginOptions]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: PluginCreator[pluginOptions] = default
  
  trait pluginOptions extends StObject {
    
    var preserve: Boolean
  }
  object pluginOptions {
    
    inline def apply(preserve: Boolean): pluginOptions = {
      val __obj = js.Dynamic.literal(preserve = preserve.asInstanceOf[js.Any])
      __obj.asInstanceOf[pluginOptions]
    }
    
    extension [Self <: pluginOptions](x: Self) {
      
      inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
    }
  }
}
