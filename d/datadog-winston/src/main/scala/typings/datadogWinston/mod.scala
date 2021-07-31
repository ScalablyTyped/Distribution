package typings.datadogWinston

import typings.winstonTransport.mod.TransportStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("datadog-winston", JSImport.Namespace)
  @js.native
  class ^ protected () extends DatadogWinston {
    def this(options: DatadogTransportOptions) = this()
  }
  
  trait DatadogTransportOptions
    extends StObject
       with TransportStreamOptions {
    
    var apiKey: String
    
    var ddsource: js.UndefOr[String] = js.undefined
    
    var ddtags: js.UndefOr[String] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var service: js.UndefOr[String] = js.undefined
  }
  object DatadogTransportOptions {
    
    @scala.inline
    def apply(apiKey: String): DatadogTransportOptions = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatadogTransportOptions]
    }
    
    @scala.inline
    implicit class DatadogTransportOptionsMutableBuilder[Self <: DatadogTransportOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDdsource(value: String): Self = StObject.set(x, "ddsource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDdsourceUndefined: Self = StObject.set(x, "ddsource", js.undefined)
      
      @scala.inline
      def setDdtags(value: String): Self = StObject.set(x, "ddtags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDdtagsUndefined: Self = StObject.set(x, "ddtags", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    }
  }
  
  @js.native
  trait DatadogWinston
    extends typings.winstonTransport.mod.^ {
    
    @JSName("log")
    var log_DatadogWinston: js.UndefOr[js.Function2[/* info */ js.Any, /* next */ js.Function0[Unit], Unit]] = js.native
  }
}
