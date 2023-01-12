package typings.awsSdkMiddlewareEndpoint

import typings.awsSdkMiddlewareEndpoint.distTypesResolveEndpointConfigMod.EndpointResolvedConfig
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import typings.awsSdkTypes.distTypesEndpointMod.EndpointParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Config[T /* <: EndpointParameters */] extends StObject {
    
    var config: EndpointResolvedConfig[T]
    
    var instructions: EndpointParameterInstructions
  }
  object Config {
    
    inline def apply[T /* <: EndpointParameters */](config: EndpointResolvedConfig[T], instructions: EndpointParameterInstructions): Config[T] = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], instructions = instructions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config[?], T /* <: EndpointParameters */] (val x: Self & Config[T]) extends AnyVal {
      
      inline def setConfig(value: EndpointResolvedConfig[T]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setInstructions(value: EndpointParameterInstructions): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
    }
  }
  
  trait Logger extends StObject {
    
    var logger: js.UndefOr[typings.awsSdkTypes.distTypesLoggerMod.Logger] = js.undefined
  }
  object Logger {
    
    inline def apply(): Logger = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Logger]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
      
      inline def setLogger(value: typings.awsSdkTypes.distTypesLoggerMod.Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    }
  }
}
