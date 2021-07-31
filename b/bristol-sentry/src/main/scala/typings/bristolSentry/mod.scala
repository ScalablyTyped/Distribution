package typings.bristolSentry

import typings.raven.mod.Client
import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(config: SentryConfig): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  @JSImport("bristol-sentry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def formatter(opts: js.Object, severity: String, date: Date, elems: js.Array[js.Any]): FormattedLog = (^.asInstanceOf[js.Dynamic].applyDynamic("formatter")(opts.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], date.asInstanceOf[js.Any], elems.asInstanceOf[js.Any])).asInstanceOf[FormattedLog]
  
  trait FormattedLog extends StObject {
    
    var error: js.UndefOr[Error] = js.undefined
    
    var extra: js.Array[js.Object]
    
    var message: String
  }
  object FormattedLog {
    
    @scala.inline
    def apply(extra: js.Array[js.Object], message: String): FormattedLog = {
      val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormattedLog]
    }
    
    @scala.inline
    implicit class FormattedLogMutableBuilder[Self <: FormattedLog] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setExtra(value: js.Array[js.Object]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraVarargs(value: js.Object*): Self = StObject.set(x, "extra", js.Array(value :_*))
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait SentryConfig extends StObject {
    
    var client: js.UndefOr[js.Object | Client] = js.undefined
  }
  object SentryConfig {
    
    @scala.inline
    def apply(): SentryConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SentryConfig]
    }
    
    @scala.inline
    implicit class SentryConfigMutableBuilder[Self <: SentryConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: js.Object | Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    }
  }
}
