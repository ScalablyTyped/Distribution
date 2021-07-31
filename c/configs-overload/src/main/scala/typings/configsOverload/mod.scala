package typings.configsOverload

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("configs-overload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): ExtendableConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[ExtendableConfig]
  @scala.inline
  def default(configsDirectory: String): ExtendableConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(configsDirectory.asInstanceOf[js.Any]).asInstanceOf[ExtendableConfig]
  @scala.inline
  def default(configsDirectory: String, options: ConfigsOverloadOptions): ExtendableConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(configsDirectory.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ExtendableConfig]
  @scala.inline
  def default(configsDirectory: Unit, options: ConfigsOverloadOptions): ExtendableConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(configsDirectory.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ExtendableConfig]
  
  trait ConfigsOverloadOptions extends StObject {
    
    var defaultEnv: js.UndefOr[String] = js.undefined
    
    var env: js.UndefOr[String] = js.undefined
  }
  object ConfigsOverloadOptions {
    
    @scala.inline
    def apply(): ConfigsOverloadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigsOverloadOptions]
    }
    
    @scala.inline
    implicit class ConfigsOverloadOptionsMutableBuilder[Self <: ConfigsOverloadOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultEnv(value: String): Self = StObject.set(x, "defaultEnv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultEnvUndefined: Self = StObject.set(x, "defaultEnv", js.undefined)
      
      @scala.inline
      def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    }
  }
  
  type ExtendableConfig = StringDictionary[js.Any]
}
