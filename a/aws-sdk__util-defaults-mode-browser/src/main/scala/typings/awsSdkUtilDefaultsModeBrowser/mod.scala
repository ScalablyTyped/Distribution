package typings.awsSdkUtilDefaultsModeBrowser

import typings.awsSdkSmithyClient.defaultsModeMod.ResolvedDefaultsMode
import typings.awsSdkTypes.utilMod.Provider
import typings.awsSdkUtilDefaultsModeBrowser.resolveDefaultsModeConfigMod.ResolveDefaultsModeConfigOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/util-defaults-mode-browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveDefaultsModeConfig(): Provider[ResolvedDefaultsMode] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveDefaultsModeConfig")().asInstanceOf[Provider[ResolvedDefaultsMode]]
  inline def resolveDefaultsModeConfig(hasDefaultsMode: ResolveDefaultsModeConfigOptions): Provider[ResolvedDefaultsMode] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveDefaultsModeConfig")(hasDefaultsMode.asInstanceOf[js.Any]).asInstanceOf[Provider[ResolvedDefaultsMode]]
}
