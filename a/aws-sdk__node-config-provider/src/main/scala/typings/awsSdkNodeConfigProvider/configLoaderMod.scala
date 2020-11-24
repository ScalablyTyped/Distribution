package typings.awsSdkNodeConfigProvider

import typings.awsSdkNodeConfigProvider.fromEnvMod.GetterFromEnv
import typings.awsSdkNodeConfigProvider.fromSharedConfigFilesMod.GetterFromConfig
import typings.awsSdkNodeConfigProvider.fromSharedConfigFilesMod.SharedConfigInit
import typings.awsSdkNodeConfigProvider.fromStaticMod.FromStaticConfig
import typings.awsSdkSharedIniFileLoader.mod.Profile
import typings.awsSdkTypes.utilMod.Provider
import typings.node.processMod.global.NodeJS.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/node-config-provider/dist/cjs/configLoader", JSImport.Namespace)
@js.native
object configLoaderMod extends js.Object {
  
  def loadConfig[T](hasEnvironmentVariableSelectorConfigFileSelectorDefault: LoadedConfigSelectors[T]): Provider[T] = js.native
  def loadConfig[T](
    hasEnvironmentVariableSelectorConfigFileSelectorDefault: LoadedConfigSelectors[T],
    configuration: LocalConfigOptions
  ): Provider[T] = js.native
  
  @js.native
  trait LoadedConfigSelectors[T] extends js.Object {
    
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
      * Default value or getter
      */
    var default: FromStaticConfig[T] = js.native
    
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
