package typings.awsSdkMiddlewareEndpoint

import typings.awsSdkMiddlewareEndpoint.endpointMiddlewareMod.PreviouslyResolvedServiceId
import typings.awsSdkMiddlewareEndpoint.resolveEndpointConfigMod.EndpointResolvedConfig
import typings.awsSdkMiddlewareEndpoint.typesMod.EndpointParameterInstructions
import typings.awsSdkTypes.endpointMod.EndpointParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Config[T /* <: EndpointParameters */] extends StObject {
    
    var config: EndpointResolvedConfig[T] & PreviouslyResolvedServiceId
    
    var instructions: EndpointParameterInstructions
  }
  object Config {
    
    inline def apply[T /* <: EndpointParameters */](
      config: EndpointResolvedConfig[T] & PreviouslyResolvedServiceId,
      instructions: EndpointParameterInstructions
    ): Config[T] = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], instructions = instructions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config[T]]
    }
    
    extension [Self <: Config[?], T /* <: EndpointParameters */](x: Self & Config[T]) {
      
      inline def setConfig(value: EndpointResolvedConfig[T] & PreviouslyResolvedServiceId): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setInstructions(value: EndpointParameterInstructions): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
    }
  }
  
  trait Logger extends StObject {
    
    var logger: js.UndefOr[typings.awsSdkTypes.loggerMod.Logger] = js.undefined
  }
  object Logger {
    
    inline def apply(): Logger = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Logger]
    }
    
    extension [Self <: Logger](x: Self) {
      
      inline def setLogger(value: typings.awsSdkTypes.loggerMod.Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    }
  }
}
