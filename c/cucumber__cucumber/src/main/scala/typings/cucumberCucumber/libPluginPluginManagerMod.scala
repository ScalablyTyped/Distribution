package typings.cucumberCucumber

import typings.cucumberCucumber.cucumberCucumberStrings.message
import typings.cucumberCucumber.libApiTypesMod.IRunEnvironment
import typings.cucumberCucumber.libApiTypesMod.IRunOptions
import typings.cucumberCucumber.libLoggerMod.ILogger
import typings.cucumberCucumber.libPluginTypesMod.Plugin
import typings.cucumberMessages.mod.Envelope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPluginPluginManagerMod {
  
  @JSImport("@cucumber/cucumber/lib/plugin/plugin_manager", "PluginManager")
  @js.native
  open class PluginManager protected () extends StObject {
    def this(pluginFns: js.Array[Plugin]) = this()
    
    def cleanup(): js.Promise[Unit] = js.native
    
    /* private */ var cleanupFns: Any = js.native
    
    @JSName("emit")
    def emit_message(event: message, value: Envelope): Unit = js.native
    
    /* private */ var handlers: Any = js.native
    
    def init(logger: ILogger, configuration: IRunOptions, environment: IRunEnvironment): js.Promise[Unit] = js.native
    
    /* private */ var pluginFns: Any = js.native
    
    /* private */ var register: Any = js.native
  }
}
