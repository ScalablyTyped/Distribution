package typings.azureMsalCommon

import typings.azureMsalCommon.distConfigClientConfigurationMod.LoggerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLoggerLoggerMod {
  
  @js.native
  sealed trait LogLevel extends StObject
  @JSImport("@azure/msal-common/dist/logger/Logger", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LogLevel & Double] = js.native
    
    @js.native
    sealed trait Error
      extends StObject
         with LogLevel
    /* 0 */ val Error: typings.azureMsalCommon.distLoggerLoggerMod.LogLevel.Error & Double = js.native
    
    @js.native
    sealed trait Info
      extends StObject
         with LogLevel
    /* 2 */ val Info: typings.azureMsalCommon.distLoggerLoggerMod.LogLevel.Info & Double = js.native
    
    @js.native
    sealed trait Trace
      extends StObject
         with LogLevel
    /* 4 */ val Trace: typings.azureMsalCommon.distLoggerLoggerMod.LogLevel.Trace & Double = js.native
    
    @js.native
    sealed trait Verbose
      extends StObject
         with LogLevel
    /* 3 */ val Verbose: typings.azureMsalCommon.distLoggerLoggerMod.LogLevel.Verbose & Double = js.native
    
    @js.native
    sealed trait Warning
      extends StObject
         with LogLevel
    /* 1 */ val Warning: typings.azureMsalCommon.distLoggerLoggerMod.LogLevel.Warning & Double = js.native
  }
  
  @JSImport("@azure/msal-common/dist/logger/Logger", "Logger")
  @js.native
  open class Logger protected () extends StObject {
    def this(loggerOptions: LoggerOptions) = this()
    def this(loggerOptions: LoggerOptions, packageName: String) = this()
    def this(loggerOptions: LoggerOptions, packageName: String, packageVersion: String) = this()
    def this(loggerOptions: LoggerOptions, packageName: Unit, packageVersion: String) = this()
    
    /**
      * Create new Logger with existing configurations.
      */
    def clone(packageName: String, packageVersion: String): Logger = js.native
    def clone(packageName: String, packageVersion: String, correlationId: String): Logger = js.native
    
    /* private */ var correlationId: Any = js.native
    
    /**
      * Logs error messages.
      */
    def error(message: String): Unit = js.native
    def error(message: String, correlationId: String): Unit = js.native
    
    /**
      * Logs error messages with PII.
      */
    def errorPii(message: String): Unit = js.native
    def errorPii(message: String, correlationId: String): Unit = js.native
    
    /**
      * Execute callback with message.
      */
    def executeCallback(level: LogLevel, message: String, containsPii: Boolean): Unit = js.native
    
    /**
      * Logs info messages.
      */
    def info(message: String): Unit = js.native
    def info(message: String, correlationId: String): Unit = js.native
    
    /**
      * Logs info messages with PII.
      */
    def infoPii(message: String): Unit = js.native
    def infoPii(message: String, correlationId: String): Unit = js.native
    
    /**
      * Returns whether PII Logging is enabled or not.
      */
    def isPiiLoggingEnabled(): Boolean = js.native
    
    /* private */ var level: Any = js.native
    
    /* private */ var localCallback: Any = js.native
    
    /**
      * Log message with required options.
      */
    /* private */ var logMessage: Any = js.native
    
    /* private */ var packageName: Any = js.native
    
    /* private */ var packageVersion: Any = js.native
    
    /* private */ var piiLoggingEnabled: Any = js.native
    
    /**
      * Logs trace messages.
      */
    def trace(message: String): Unit = js.native
    def trace(message: String, correlationId: String): Unit = js.native
    
    /**
      * Logs trace messages with PII.
      */
    def tracePii(message: String): Unit = js.native
    def tracePii(message: String, correlationId: String): Unit = js.native
    
    /**
      * Logs verbose messages.
      */
    def verbose(message: String): Unit = js.native
    def verbose(message: String, correlationId: String): Unit = js.native
    
    /**
      * Logs verbose messages with PII.
      */
    def verbosePii(message: String): Unit = js.native
    def verbosePii(message: String, correlationId: String): Unit = js.native
    
    /**
      * Logs warning messages.
      */
    def warning(message: String): Unit = js.native
    def warning(message: String, correlationId: String): Unit = js.native
    
    /**
      * Logs warning messages with PII.
      */
    def warningPii(message: String): Unit = js.native
    def warningPii(message: String, correlationId: String): Unit = js.native
  }
  
  type ILoggerCallback = js.Function3[/* level */ LogLevel, /* message */ String, /* containsPii */ Boolean, Unit]
  
  trait LoggerMessageOptions extends StObject {
    
    var containsPii: js.UndefOr[Boolean] = js.undefined
    
    var context: js.UndefOr[String] = js.undefined
    
    var correlationId: js.UndefOr[String] = js.undefined
    
    var logLevel: LogLevel
  }
  object LoggerMessageOptions {
    
    inline def apply(logLevel: LogLevel): LoggerMessageOptions = {
      val __obj = js.Dynamic.literal(logLevel = logLevel.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoggerMessageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoggerMessageOptions] (val x: Self) extends AnyVal {
      
      inline def setContainsPii(value: Boolean): Self = StObject.set(x, "containsPii", value.asInstanceOf[js.Any])
      
      inline def setContainsPiiUndefined: Self = StObject.set(x, "containsPii", js.undefined)
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
      
      inline def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
      
      inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    }
  }
}
