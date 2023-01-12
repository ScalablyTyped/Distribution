package typings.awsSdkUtilDefaultsModeBrowser

import typings.awsSdkSmithyClient.distTypesDefaultsModeMod.DefaultsMode
import typings.awsSdkSmithyClient.distTypesDefaultsModeMod.ResolvedDefaultsMode
import typings.awsSdkTypes.distTypesUtilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResolveDefaultsModeConfigMod {
  
  @JSImport("@aws-sdk/util-defaults-mode-browser/dist-types/resolveDefaultsModeConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveDefaultsModeConfig(): Provider[ResolvedDefaultsMode] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveDefaultsModeConfig")().asInstanceOf[Provider[ResolvedDefaultsMode]]
  inline def resolveDefaultsModeConfig(param0: ResolveDefaultsModeConfigOptions): Provider[ResolvedDefaultsMode] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveDefaultsModeConfig")(param0.asInstanceOf[js.Any]).asInstanceOf[Provider[ResolvedDefaultsMode]]
  
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
