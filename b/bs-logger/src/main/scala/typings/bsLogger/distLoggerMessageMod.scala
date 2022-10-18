package typings.bsLogger

import org.scalablytyped.runtime.StringDictionary
import typings.bsLogger.distLoggerContextMod.LogContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLoggerMessageMod {
  
  @JSImport("bs-logger/dist/logger/message", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bs-logger/dist/logger/message", "LogFormatters")
  @js.native
  def LogFormatters: LogFormattersMap = js.native
  inline def LogFormatters_=(x: LogFormattersMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LogFormatters")(x.asInstanceOf[js.Any])
  
  inline def registerLogFormatter(name: String, format: LogMessageFormatter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLogFormatter")(name.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resetLogFormatters(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetLogFormatters")().asInstanceOf[Unit]
  
  trait LogFormattersMap
    extends StObject
       with /* key */ StringDictionary[LogMessageFormatter] {
    
    def json(msg: LogMessage): String
    @JSName("json")
    var json_Original: LogMessageFormatter
    
    def simple(msg: LogMessage): String
    @JSName("simple")
    var simple_Original: LogMessageFormatter
  }
  object LogFormattersMap {
    
    inline def apply(json: /* msg */ LogMessage => String, simple: /* msg */ LogMessage => String): LogFormattersMap = {
      val __obj = js.Dynamic.literal(json = js.Any.fromFunction1(json), simple = js.Any.fromFunction1(simple))
      __obj.asInstanceOf[LogFormattersMap]
    }
    
    extension [Self <: LogFormattersMap](x: Self) {
      
      inline def setJson(value: /* msg */ LogMessage => String): Self = StObject.set(x, "json", js.Any.fromFunction1(value))
      
      inline def setSimple(value: /* msg */ LogMessage => String): Self = StObject.set(x, "simple", js.Any.fromFunction1(value))
    }
  }
  
  trait LogMessage extends StObject {
    
    var context: LogContext
    
    var message: String
    
    var sequence: Double
    
    var time: Double
  }
  object LogMessage {
    
    inline def apply(context: LogContext, message: String, sequence: Double, time: Double): LogMessage = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogMessage]
    }
    
    extension [Self <: LogMessage](x: Self) {
      
      inline def setContext(value: LogContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  type LogMessageFormatter = js.Function1[/* msg */ LogMessage, String]
  
  type LogMessageTranslator = js.Function1[/* msg */ LogMessage, LogMessage]
}
