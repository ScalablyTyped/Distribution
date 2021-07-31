package typings.cssnano

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.Plugin_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cssnano", JSImport.Namespace)
  @js.native
  val ^ : CssNano = js.native
  
  type CssNano = Plugin_[CssNanoOptions]
  
  trait CssNanoOptions extends StObject {
    
    var configFile: js.UndefOr[String] = js.undefined
    
    var preset: js.UndefOr[(js.Tuple2[String, js.Object]) | String] = js.undefined
  }
  object CssNanoOptions {
    
    @scala.inline
    def apply(): CssNanoOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CssNanoOptions]
    }
    
    @scala.inline
    implicit class CssNanoOptionsMutableBuilder[Self <: CssNanoOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigFileUndefined: Self = StObject.set(x, "configFile", js.undefined)
      
      @scala.inline
      def setPreset(value: (js.Tuple2[String, js.Object]) | String): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
    }
  }
  
  type _To = CssNano
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: CssNano = ^
}
