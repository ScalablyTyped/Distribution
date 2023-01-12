package typings.datadogWinston

import typings.winstonTransport.mod.TransportStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("datadog-winston", JSImport.Namespace)
  @js.native
  open class ^ protected () extends DatadogWinston {
    def this(options: DatadogTransportOptions) = this()
  }
  
  trait DatadogTransportOptions
    extends StObject
       with TransportStreamOptions {
    
    var apiKey: String
    
    var ddsource: js.UndefOr[String] = js.undefined
    
    var ddtags: js.UndefOr[String] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var intakeRegion: js.UndefOr[String] = js.undefined
    
    var service: js.UndefOr[String] = js.undefined
  }
  object DatadogTransportOptions {
    
    inline def apply(apiKey: String): DatadogTransportOptions = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatadogTransportOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatadogTransportOptions] (val x: Self) extends AnyVal {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setDdsource(value: String): Self = StObject.set(x, "ddsource", value.asInstanceOf[js.Any])
      
      inline def setDdsourceUndefined: Self = StObject.set(x, "ddsource", js.undefined)
      
      inline def setDdtags(value: String): Self = StObject.set(x, "ddtags", value.asInstanceOf[js.Any])
      
      inline def setDdtagsUndefined: Self = StObject.set(x, "ddtags", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setIntakeRegion(value: String): Self = StObject.set(x, "intakeRegion", value.asInstanceOf[js.Any])
      
      inline def setIntakeRegionUndefined: Self = StObject.set(x, "intakeRegion", js.undefined)
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    }
  }
  
  @js.native
  trait DatadogWinston
    extends typings.winstonTransport.mod.^ {
    
    @JSName("log")
    var log_DatadogWinston: js.UndefOr[js.Function2[/* info */ Any, /* next */ js.Function0[Unit], Unit]] = js.native
  }
}
