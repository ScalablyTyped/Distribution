package typings.bristolSentry

import typings.raven.mod.Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(config: SentryConfig): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  @JSImport("bristol-sentry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatter(opts: js.Object, severity: String, date: js.Date, elems: js.Array[Any]): FormattedLog = (^.asInstanceOf[js.Dynamic].applyDynamic("formatter")(opts.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], date.asInstanceOf[js.Any], elems.asInstanceOf[js.Any])).asInstanceOf[FormattedLog]
  
  trait FormattedLog extends StObject {
    
    var error: js.UndefOr[js.Error] = js.undefined
    
    var extra: js.Array[js.Object]
    
    var message: String
  }
  object FormattedLog {
    
    inline def apply(extra: js.Array[js.Object], message: String): FormattedLog = {
      val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormattedLog]
    }
    
    extension [Self <: FormattedLog](x: Self) {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setExtra(value: js.Array[js.Object]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraVarargs(value: js.Object*): Self = StObject.set(x, "extra", js.Array(value*))
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait SentryConfig extends StObject {
    
    var client: js.UndefOr[js.Object | Client] = js.undefined
  }
  object SentryConfig {
    
    inline def apply(): SentryConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SentryConfig]
    }
    
    extension [Self <: SentryConfig](x: Self) {
      
      inline def setClient(value: js.Object | Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    }
  }
}
