package typings.datadogTracer

import typings.datadogTracer.datadogTracerStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("datadog-tracer", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Tracer {
    def this(tracerOptions: TracerOptions) = this()
  }
  
  @js.native
  trait Tracer
    extends typings.opentracing.mod.Tracer {
    
    @JSName("addEventListener")
    def addEventListener_error(method: error): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(method: error, cb: js.Function1[/* e */ Any, Unit]): Unit = js.native
    
    @JSName("on")
    def on_error(method: error): Unit = js.native
    @JSName("on")
    def on_error(method: error, cb: js.Function1[/* e */ Any, Unit]): Unit = js.native
  }
  
  trait TracerOptions extends StObject {
    
    var endpoint: js.UndefOr[String] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var service: String
  }
  object TracerOptions {
    
    inline def apply(service: String): TracerOptions = {
      val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[TracerOptions]
    }
    
    extension [Self <: TracerOptions](x: Self) {
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
}
