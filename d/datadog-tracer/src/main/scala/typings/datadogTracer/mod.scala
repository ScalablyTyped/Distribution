package typings.datadogTracer

import typings.datadogTracer.datadogTracerStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("datadog-tracer", JSImport.Namespace)
  @js.native
  class ^ protected () extends Tracer {
    def this(tracerOptions: TracerOptions) = this()
  }
  
  @js.native
  trait Tracer
    extends typings.opentracing.mod.Tracer {
    
    @JSName("addEventListener")
    def addEventListener_error(method: error): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(method: error, cb: js.Function1[/* e */ js.Any, Unit]): Unit = js.native
    
    @JSName("on")
    def on_error(method: error): Unit = js.native
    @JSName("on")
    def on_error(method: error, cb: js.Function1[/* e */ js.Any, Unit]): Unit = js.native
  }
  
  trait TracerOptions extends StObject {
    
    var endpoint: js.UndefOr[String] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var service: String
  }
  object TracerOptions {
    
    @scala.inline
    def apply(service: String): TracerOptions = {
      val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[TracerOptions]
    }
    
    @scala.inline
    implicit class TracerOptionsMutableBuilder[Self <: TracerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
}
