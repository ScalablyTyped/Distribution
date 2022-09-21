package typings.awsSdkUtilDefaultsModeBrowser

import typings.awsSdkSmithyClient.defaultsModeMod.DefaultsMode
import typings.awsSdkTypes.utilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  @JSImport("@aws-sdk/util-defaults-mode-browser/dist-types/constants", "DEFAULTS_MODE_OPTIONS")
  @js.native
  val DEFAULTS_MODE_OPTIONS: js.Array[String] = js.native
  
  trait ResolveDefaultsModeConfigOptions extends StObject {
    
    var defaultsMode: js.UndefOr[DefaultsMode | Provider[DefaultsMode]] = js.undefined
  }
  object ResolveDefaultsModeConfigOptions {
    
    inline def apply(): ResolveDefaultsModeConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolveDefaultsModeConfigOptions]
    }
    
    extension [Self <: ResolveDefaultsModeConfigOptions](x: Self) {
      
      inline def setDefaultsMode(value: DefaultsMode | Provider[DefaultsMode]): Self = StObject.set(x, "defaultsMode", value.asInstanceOf[js.Any])
      
      inline def setDefaultsModeFunction0(value: () => js.Promise[DefaultsMode]): Self = StObject.set(x, "defaultsMode", js.Any.fromFunction0(value))
      
      inline def setDefaultsModeUndefined: Self = StObject.set(x, "defaultsMode", js.undefined)
    }
  }
}
