package typings.cucumberCucumber

import typings.cucumberCucumber.cucumberCucumberStrings.message
import typings.cucumberCucumber.libApiTypesMod.IRunEnvironment
import typings.cucumberCucumber.libApiTypesMod.IRunOptions
import typings.cucumberCucumber.libLoggerMod.ILogger
import typings.cucumberMessages.mod.Envelope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPluginTypesMod {
  
  type Plugin = js.Function1[/* context */ PluginContext, js.Promise[PluginCleanup | Unit]]
  
  type PluginCleanup = js.Function0[Any | Unit | (js.Promise[Any | Unit])]
  
  trait PluginContext extends StObject {
    
    var configuration: IRunOptions
    
    var environment: IRunEnvironment
    
    var logger: ILogger
    
    @JSName("on")
    def on_message(event: message, handler: js.Function1[/* value */ Envelope, Unit]): Unit
  }
  object PluginContext {
    
    inline def apply(
      configuration: IRunOptions,
      environment: IRunEnvironment,
      logger: ILogger,
      on: (message, js.Function1[/* value */ Envelope, Unit]) => Unit
    ): PluginContext = {
      val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], on = js.Any.fromFunction2(on))
      __obj.asInstanceOf[PluginContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PluginContext] (val x: Self) extends AnyVal {
      
      inline def setConfiguration(value: IRunOptions): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setEnvironment(value: IRunEnvironment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setLogger(value: ILogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setOn(value: (message, js.Function1[/* value */ Envelope, Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    }
  }
  
  trait PluginEvents extends StObject {
    
    var message: Envelope
  }
  object PluginEvents {
    
    inline def apply(message: Envelope): PluginEvents = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginEvents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PluginEvents] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: Envelope): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
