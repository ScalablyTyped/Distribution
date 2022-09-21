package typings.azureLogger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@azure/logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait AzureLogger extends StObject {
    
    /**
      * Logs the given arguments to the `log` method.
      */
    /**
      * Used for failures the program is unlikely to recover from,
      * such as Out of Memory.
      */
    def error(args: Any*): Unit
    /**
      * Used for failures the program is unlikely to recover from,
      * such as Out of Memory.
      */
    @JSName("error")
    var error_Original: Debugger
    
    /**
      * Logs the given arguments to the `log` method.
      */
    /**
      * Used when a function operates normally.
      */
    def info(args: Any*): Unit
    /**
      * Used when a function operates normally.
      */
    @JSName("info")
    var info_Original: Debugger
    
    /**
      * Logs the given arguments to the `log` method.
      */
    /**
      * Used for detailed trbouleshooting scenarios. This is
      * intended for use by developers / system administrators
      * for diagnosing specific failures.
      */
    def verbose(args: Any*): Unit
    /**
      * Used for detailed trbouleshooting scenarios. This is
      * intended for use by developers / system administrators
      * for diagnosing specific failures.
      */
    @JSName("verbose")
    var verbose_Original: Debugger
    
    /**
      * Logs the given arguments to the `log` method.
      */
    /**
      * Used when a function fails to perform its intended task.
      * Usually this means the function will throw an exception.
      * Not used for self-healing events (e.g. automatic retry)
      */
    def warning(args: Any*): Unit
    /**
      * Used when a function fails to perform its intended task.
      * Usually this means the function will throw an exception.
      * Not used for self-healing events (e.g. automatic retry)
      */
    @JSName("warning")
    var warning_Original: Debugger
  }
  object AzureLogger {
    
    @JSImport("@azure/logger", "AzureLogger")
    @js.native
    val ^ : AzureClientLogger = js.native
    
    extension [Self <: AzureLogger](x: Self) {
      
      inline def setError(value: Debugger): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: Debugger): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: Debugger): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setWarning(value: Debugger): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    }
  }
  
  inline def createClientLogger(namespace: String): AzureLogger = ^.asInstanceOf[js.Dynamic].applyDynamic("createClientLogger")(namespace.asInstanceOf[js.Any]).asInstanceOf[AzureLogger]
  
  inline def getLogLevel(): js.UndefOr[AzureLogLevel] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLogLevel")().asInstanceOf[js.UndefOr[AzureLogLevel]]
  
  inline def setLogLevel(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")().asInstanceOf[Unit]
  inline def setLogLevel(level: AzureLogLevel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type AzureClientLogger = Debugger
  
  /* Rewritten from type alias, can be one of: 
    - typings.azureLogger.azureLoggerStrings.verbose
    - typings.azureLogger.azureLoggerStrings.info
    - typings.azureLogger.azureLoggerStrings.warning
    - typings.azureLogger.azureLoggerStrings.error
  */
  trait AzureLogLevel extends StObject
  object AzureLogLevel {
    
    inline def error: typings.azureLogger.azureLoggerStrings.error = "error".asInstanceOf[typings.azureLogger.azureLoggerStrings.error]
    
    inline def info: typings.azureLogger.azureLoggerStrings.info = "info".asInstanceOf[typings.azureLogger.azureLoggerStrings.info]
    
    inline def verbose: typings.azureLogger.azureLoggerStrings.verbose = "verbose".asInstanceOf[typings.azureLogger.azureLoggerStrings.verbose]
    
    inline def warning: typings.azureLogger.azureLoggerStrings.warning = "warning".asInstanceOf[typings.azureLogger.azureLoggerStrings.warning]
  }
  
  @js.native
  trait Debugger extends StObject {
    
    /**
      * Logs the given arguments to the `log` method.
      */
    def apply(args: Any*): Unit = js.native
    
    /**
      * Used to cleanup/remove this logger.
      */
    def destroy(): Boolean = js.native
    
    /**
      * True if this logger is active and logging.
      */
    var enabled: Boolean = js.native
    
    /**
      * Extends this logger with a child namespace.
      * Namespaces are separated with a ':' character.
      */
    def extend(namespace: String): Debugger = js.native
    
    /**
      * The current log method. Can be overridden to redirect output.
      */
    def log(args: Any*): Unit = js.native
    
    /**
      * The namespace of this logger.
      */
    var namespace: String = js.native
  }
}
