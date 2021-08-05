package typings.cyberblastLogger

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@cyberblast/logger", "Logger")
  @js.native
  class Logger () extends StObject {
    def this(configPath: String) = this()
    
    var category: StringDictionary[String] = js.native
    
    def close(): Unit = js.native
    
    def defineCategory(name: String): Unit = js.native
    
    def init(): js.Promise[Unit] = js.native
    
    def log(logData: LogData): Unit = js.native
    
    def logError(message: String, category: String, data: js.Any*): Unit = js.native
    def logError(message: String, category: Unit, data: js.Any*): Unit = js.native
    
    def logInfo(message: String, category: String, data: js.Any*): Unit = js.native
    def logInfo(message: String, category: Unit, data: js.Any*): Unit = js.native
    
    def logVerbose(message: String, category: String, data: js.Any*): Unit = js.native
    def logVerbose(message: String, category: Unit, data: js.Any*): Unit = js.native
    
    def logWarning(message: String, category: String, data: js.Any*): Unit = js.native
    def logWarning(message: String, category: Unit, data: js.Any*): Unit = js.native
    
    def on(ruleName: String, callback: js.Function1[/* logData */ LogData, Unit]): Unit = js.native
    
    def onError(callback: js.Function1[/* logData */ LogData, Unit]): Unit = js.native
    
    def onInfo(callback: js.Function1[/* logData */ LogData, Unit]): Unit = js.native
    
    def onLog(callback: js.Function1[/* logData */ LogData, Unit]): Unit = js.native
    
    def onVerbose(callback: js.Function1[/* logData */ LogData, Unit]): Unit = js.native
    
    def onWarning(callback: js.Function1[/* logData */ LogData, Unit]): Unit = js.native
  }
  
  @js.native
  sealed trait Severity extends StObject
  @JSImport("@cyberblast/logger", "Severity")
  @js.native
  object Severity extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Severity & String] = js.native
    
    @js.native
    sealed trait Error
      extends StObject
         with Severity
    /* "Error" */ val Error: typings.cyberblastLogger.mod.Severity.Error & String = js.native
    
    @js.native
    sealed trait Info
      extends StObject
         with Severity
    /* "Info" */ val Info: typings.cyberblastLogger.mod.Severity.Info & String = js.native
    
    @js.native
    sealed trait Verbose
      extends StObject
         with Severity
    /* "Verbose" */ val Verbose: typings.cyberblastLogger.mod.Severity.Verbose & String = js.native
    
    @js.native
    sealed trait Warning
      extends StObject
         with Severity
    /* "Warning" */ val Warning: typings.cyberblastLogger.mod.Severity.Warning & String = js.native
  }
  
  @js.native
  sealed trait SeverityLevel extends StObject
  @JSImport("@cyberblast/logger", "SeverityLevel")
  @js.native
  object SeverityLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SeverityLevel & Double] = js.native
    
    @js.native
    sealed trait Error
      extends StObject
         with SeverityLevel
    /* 4 */ val Error: typings.cyberblastLogger.mod.SeverityLevel.Error & Double = js.native
    
    @js.native
    sealed trait Info
      extends StObject
         with SeverityLevel
    /* 2 */ val Info: typings.cyberblastLogger.mod.SeverityLevel.Info & Double = js.native
    
    @js.native
    sealed trait Verbose
      extends StObject
         with SeverityLevel
    /* 1 */ val Verbose: typings.cyberblastLogger.mod.SeverityLevel.Verbose & Double = js.native
    
    @js.native
    sealed trait Warning
      extends StObject
         with SeverityLevel
    /* 3 */ val Warning: typings.cyberblastLogger.mod.SeverityLevel.Warning & Double = js.native
  }
  
  trait LogData extends StObject {
    
    var category: String
    
    var data: js.UndefOr[js.Any] = js.undefined
    
    var message: String
    
    var severity: Severity
    
    var time: js.UndefOr[Date] = js.undefined
  }
  object LogData {
    
    inline def apply(category: String, message: String, severity: Severity): LogData = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogData]
    }
    
    extension [Self <: LogData](x: Self) {
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setSeverity(value: Severity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    }
  }
}
