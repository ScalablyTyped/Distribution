package typings.awsSdkUtilDefaultsModeBrowser

import typings.awsSdkSmithyClient.distTypesDefaultsModeMod.DefaultsMode
import typings.awsSdkTypes.distTypesUtilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesConstantsMod {
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolveDefaultsModeConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setDefaultsMode(value: DefaultsMode | Provider[DefaultsMode]): Self = StObject.set(x, "defaultsMode", value.asInstanceOf[js.Any])
      
      inline def setDefaultsModeFunction0(value: () => js.Promise[DefaultsMode]): Self = StObject.set(x, "defaultsMode", js.Any.fromFunction0(value))
      
      inline def setDefaultsModeUndefined: Self = StObject.set(x, "defaultsMode", js.undefined)
    }
  }
}
