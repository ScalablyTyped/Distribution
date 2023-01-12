package typings.bunyanSeq

import typings.bunyan.mod.LogLevel
import typings.bunyan.mod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bunyan-seq", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createStream(): Stream = ^.asInstanceOf[js.Dynamic].applyDynamic("createStream")().asInstanceOf[Stream]
  inline def createStream(options: SeqStreamOptions): Stream = ^.asInstanceOf[js.Dynamic].applyDynamic("createStream")(options.asInstanceOf[js.Any]).asInstanceOf[Stream]
  
  trait SeqStreamOptions extends StObject {
    
    var apiKey: js.UndefOr[String] = js.undefined
    
    var batchSizeLimit: js.UndefOr[Double] = js.undefined
    
    var eventSizeLimit: js.UndefOr[Double] = js.undefined
    
    var level: js.UndefOr[LogLevel] = js.undefined
    
    var maxBatchingTime: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* e */ js.Error, Unit]] = js.undefined
    
    var reemitErrorEvents: js.UndefOr[Boolean] = js.undefined
    
    var serverUrl: js.UndefOr[String] = js.undefined
  }
  object SeqStreamOptions {
    
    inline def apply(): SeqStreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeqStreamOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeqStreamOptions] (val x: Self) extends AnyVal {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      inline def setBatchSizeLimit(value: Double): Self = StObject.set(x, "batchSizeLimit", value.asInstanceOf[js.Any])
      
      inline def setBatchSizeLimitUndefined: Self = StObject.set(x, "batchSizeLimit", js.undefined)
      
      inline def setEventSizeLimit(value: Double): Self = StObject.set(x, "eventSizeLimit", value.asInstanceOf[js.Any])
      
      inline def setEventSizeLimitUndefined: Self = StObject.set(x, "eventSizeLimit", js.undefined)
      
      inline def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMaxBatchingTime(value: Double): Self = StObject.set(x, "maxBatchingTime", value.asInstanceOf[js.Any])
      
      inline def setMaxBatchingTimeUndefined: Self = StObject.set(x, "maxBatchingTime", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnError(value: /* e */ js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setReemitErrorEvents(value: Boolean): Self = StObject.set(x, "reemitErrorEvents", value.asInstanceOf[js.Any])
      
      inline def setReemitErrorEventsUndefined: Self = StObject.set(x, "reemitErrorEvents", js.undefined)
      
      inline def setServerUrl(value: String): Self = StObject.set(x, "serverUrl", value.asInstanceOf[js.Any])
      
      inline def setServerUrlUndefined: Self = StObject.set(x, "serverUrl", js.undefined)
    }
  }
}
