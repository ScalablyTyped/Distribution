package typings.awsSdkNodeConfigProvider

import typings.awsSdkNodeConfigProvider.configLoaderMod.LoadedConfigSelectors
import typings.awsSdkNodeConfigProvider.configLoaderMod.LocalConfigOptions
import typings.awsSdkTypes.utilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/node-config-provider", "loadConfig")
  @js.native
  def loadConfig[T](hasEnvironmentVariableSelectorConfigFileSelectorDefault: LoadedConfigSelectors[T]): Provider[T] = js.native
  @JSImport("@aws-sdk/node-config-provider", "loadConfig")
  @js.native
  def loadConfig[T](
    hasEnvironmentVariableSelectorConfigFileSelectorDefault: LoadedConfigSelectors[T],
    configuration: LocalConfigOptions
  ): Provider[T] = js.native
}
