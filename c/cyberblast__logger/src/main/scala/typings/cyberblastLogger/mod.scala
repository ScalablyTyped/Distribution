package typings.cyberblastLogger

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    def logError(message: String, category: js.UndefOr[scala.Nothing], data: js.Any*): Unit = js.native
    def logError(message: String, category: String, data: js.Any*): Unit = js.native
    
    def logInfo(message: String, category: js.UndefOr[scala.Nothing], data: js.Any*): Unit = js.native
    def logInfo(message: String, category: String, data: js.Any*): Unit = js.native
    
    def logVerbose(message: String, category: js.UndefOr[scala.Nothing], data: js.Any*): Unit = js.native
    def logVerbose(message: String, category: String, data: js.Any*): Unit = js.native
    
    def logWarning(message: String, category: js.UndefOr[scala.Nothing], data: js.Any*): Unit = js.native
    def logWarning(message: String, category: String, data: js.Any*): Unit = js.native
    
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
    def apply(value: String): js.UndefOr[Severity with String] = js.native
    
    @js.native
    sealed trait Error extends Severity
    /* "Error" */ val Error: typings.cyberblastLogger.mod.Severity.Error with String = js.native
    
    @js.native
    sealed trait Info extends Severity
    /* "Info" */ val Info: typings.cyberblastLogger.mod.Severity.Info with String = js.native
    
    @js.native
    sealed trait Verbose extends Severity
    /* "Verbose" */ val Verbose: typings.cyberblastLogger.mod.Severity.Verbose with String = js.native
    
    @js.native
    sealed trait Warning extends Severity
    /* "Warning" */ val Warning: typings.cyberblastLogger.mod.Severity.Warning with String = js.native
  }
  
  @js.native
  sealed trait SeverityLevel extends StObject
  @JSImport("@cyberblast/logger", "SeverityLevel")
  @js.native
  object SeverityLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SeverityLevel with Double] = js.native
    
    @js.native
    sealed trait Error extends SeverityLevel
    /* 4 */ val Error: typings.cyberblastLogger.mod.SeverityLevel.Error with Double = js.native
    
    @js.native
    sealed trait Info extends SeverityLevel
    /* 2 */ val Info: typings.cyberblastLogger.mod.SeverityLevel.Info with Double = js.native
    
    @js.native
    sealed trait Verbose extends SeverityLevel
    /* 1 */ val Verbose: typings.cyberblastLogger.mod.SeverityLevel.Verbose with Double = js.native
    
    @js.native
    sealed trait Warning extends SeverityLevel
    /* 3 */ val Warning: typings.cyberblastLogger.mod.SeverityLevel.Warning with Double = js.native
  }
  
  @js.native
  trait LogData extends StObject {
    
    var category: String = js.native
    
    var data: js.UndefOr[js.Any] = js.native
    
    var message: String = js.native
    
    var severity: Severity = js.native
    
    var time: js.UndefOr[Date] = js.native
  }
  object LogData {
    
    @scala.inline
    def apply(category: String, message: String, severity: Severity): LogData = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogData]
    }
    
    @scala.inline
    implicit class LogDataMutableBuilder[Self <: LogData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeverity(value: Severity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    }
  }
}
