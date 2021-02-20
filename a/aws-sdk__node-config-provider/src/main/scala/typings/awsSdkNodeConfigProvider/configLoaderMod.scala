package typings.awsSdkNodeConfigProvider

import typings.awsSdkNodeConfigProvider.fromEnvMod.GetterFromEnv
import typings.awsSdkNodeConfigProvider.fromSharedConfigFilesMod.GetterFromConfig
import typings.awsSdkNodeConfigProvider.fromSharedConfigFilesMod.SharedConfigInit
import typings.awsSdkNodeConfigProvider.fromStaticMod.FromStaticConfig
import typings.awsSdkSharedIniFileLoader.mod.Profile
import typings.awsSdkTypes.utilMod.Provider
import typings.node.processMod.global.NodeJS.ProcessEnv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configLoaderMod {
  
  @JSImport("@aws-sdk/node-config-provider/dist/cjs/configLoader", "loadConfig")
  @js.native
  def loadConfig[T](hasEnvironmentVariableSelectorConfigFileSelectorDefault: LoadedConfigSelectors[T]): Provider[T] = js.native
  @JSImport("@aws-sdk/node-config-provider/dist/cjs/configLoader", "loadConfig")
  @js.native
  def loadConfig[T](
    hasEnvironmentVariableSelectorConfigFileSelectorDefault: LoadedConfigSelectors[T],
    configuration: LocalConfigOptions
  ): Provider[T] = js.native
  
  @js.native
  trait LoadedConfigSelectors[T] extends StObject {
    
    /**
      * Default value or getter
      */
    var default: FromStaticConfig[T] = js.native
    
    /**
      * A getter function getting config values associated with the inferred
      * profile from shared INI files
      */
    def configFileSelector(profile: Profile): js.UndefOr[T] = js.native
    /**
      * A getter function getting config values associated with the inferred
      * profile from shared INI files
      */
    @JSName("configFileSelector")
    var configFileSelector_Original: GetterFromConfig[T] = js.native
    
    /**
      * A getter function getting the config values from all the environment
      * variables.
      */
    def environmentVariableSelector(env: ProcessEnv): js.UndefOr[T] = js.native
    /**
      * A getter function getting the config values from all the environment
      * variables.
      */
    @JSName("environmentVariableSelector")
    var environmentVariableSelector_Original: GetterFromEnv[T] = js.native
  }
  
  type LocalConfigOptions = SharedConfigInit
}
