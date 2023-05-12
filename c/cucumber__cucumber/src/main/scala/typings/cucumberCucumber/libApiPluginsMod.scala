package typings.cucumberCucumber

import typings.cucumberCucumber.libApiTypesMod.IRunEnvironment
import typings.cucumberCucumber.libApiTypesMod.IRunOptions
import typings.cucumberCucumber.libLoggerMod.ILogger
import typings.cucumberCucumber.libPluginMod.PluginManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiPluginsMod {
  
  @JSImport("@cucumber/cucumber/lib/api/plugins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initializePlugins(logger: ILogger, configuration: IRunOptions, environment: IRunEnvironment): js.Promise[PluginManager] = (^.asInstanceOf[js.Dynamic].applyDynamic("initializePlugins")(logger.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PluginManager]]
}
