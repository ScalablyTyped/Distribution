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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configLoaderMod {
  
  @JSImport("@aws-sdk/node-config-provider/dist/cjs/configLoader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def loadConfig[T](hasEnvironmentVariableSelectorConfigFileSelectorDefaultValue: LoadedConfigSelectors[T]): Provider[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConfig")(hasEnvironmentVariableSelectorConfigFileSelectorDefaultValue.asInstanceOf[js.Any]).asInstanceOf[Provider[T]]
  @scala.inline
  def loadConfig[T](
    hasEnvironmentVariableSelectorConfigFileSelectorDefaultValue: LoadedConfigSelectors[T],
    configuration: LocalConfigOptions
  ): Provider[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadConfig")(hasEnvironmentVariableSelectorConfigFileSelectorDefaultValue.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[Provider[T]]
  
  trait LoadedConfigSelectors[T] extends StObject {
    
    /**
      * Default value or getter
      */
    var default: FromStaticConfig[T]
    
    /**
      * A getter function getting config values associated with the inferred
      * profile from shared INI files
      */
    def configFileSelector(profile: Profile): js.UndefOr[T]
    /**
      * A getter function getting config values associated with the inferred
      * profile from shared INI files
      */
    @JSName("configFileSelector")
    var configFileSelector_Original: GetterFromConfig[T]
    
    /**
      * A getter function getting the config values from all the environment
      * variables.
      */
    def environmentVariableSelector(env: ProcessEnv): js.UndefOr[T]
    /**
      * A getter function getting the config values from all the environment
      * variables.
      */
    @JSName("environmentVariableSelector")
    var environmentVariableSelector_Original: GetterFromEnv[T]
  }
  object LoadedConfigSelectors {
    
    @scala.inline
    def apply[T](
      configFileSelector: /* profile */ Profile => js.UndefOr[T],
      default: FromStaticConfig[T],
      environmentVariableSelector: /* env */ ProcessEnv => js.UndefOr[T]
    ): LoadedConfigSelectors[T] = {
      val __obj = js.Dynamic.literal(configFileSelector = js.Any.fromFunction1(configFileSelector), default = default.asInstanceOf[js.Any], environmentVariableSelector = js.Any.fromFunction1(environmentVariableSelector))
      __obj.asInstanceOf[LoadedConfigSelectors[T]]
    }
    
    @scala.inline
    implicit class LoadedConfigSelectorsMutableBuilder[Self <: LoadedConfigSelectors[?], T] (val x: Self & LoadedConfigSelectors[T]) extends AnyVal {
      
      @scala.inline
      def setConfigFileSelector(value: /* profile */ Profile => js.UndefOr[T]): Self = StObject.set(x, "configFileSelector", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDefault(value: FromStaticConfig[T]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFunction0(value: () => T): Self = StObject.set(x, "default", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnvironmentVariableSelector(value: /* env */ ProcessEnv => js.UndefOr[T]): Self = StObject.set(x, "environmentVariableSelector", js.Any.fromFunction1(value))
    }
  }
  
  type LocalConfigOptions = SharedConfigInit
}
