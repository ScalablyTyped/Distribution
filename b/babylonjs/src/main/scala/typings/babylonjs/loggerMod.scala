package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @JSImport("babylonjs/Misc/logger", "Logger")
  @js.native
  class Logger () extends StObject
  /* static members */
  object Logger {
    
    @JSImport("babylonjs/Misc/logger", "Logger")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * All logs
      */
    @JSImport("babylonjs/Misc/logger", "Logger.AllLogLevel")
    @js.native
    val AllLogLevel: Double = js.native
    
    /**
      * Clears the log cache
      */
    inline def ClearLogCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ClearLogCache")().asInstanceOf[Unit]
    
    /**
      * Write an error message to the console
      */
    inline def Error(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Error")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Only error logs
      */
    @JSImport("babylonjs/Misc/logger", "Logger.ErrorLogLevel")
    @js.native
    val ErrorLogLevel: Double = js.native
    
    /**
      * Log a message to the console
      */
    inline def Log(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Log")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Only message logs
      */
    @JSImport("babylonjs/Misc/logger", "Logger.MessageLogLevel")
    @js.native
    val MessageLogLevel: Double = js.native
    
    /**
      * No log
      */
    @JSImport("babylonjs/Misc/logger", "Logger.NoneLogLevel")
    @js.native
    val NoneLogLevel: Double = js.native
    
    /**
      * Callback called when a new log is added
      */
    inline def OnNewCacheEntry(entry: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("OnNewCacheEntry")(entry.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Write a warning message to the console
      */
    inline def Warn(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Warn")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Only warning logs
      */
    @JSImport("babylonjs/Misc/logger", "Logger.WarningLogLevel")
    @js.native
    val WarningLogLevel: Double = js.native
    
    @JSImport("babylonjs/Misc/logger", "Logger._AddLogEntry")
    @js.native
    def _AddLogEntry: js.Any = js.native
    inline def _AddLogEntry_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_AddLogEntry")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/logger", "Logger._ErrorDisabled")
    @js.native
    def _ErrorDisabled: js.Any = js.native
    inline def _ErrorDisabled_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ErrorDisabled")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/logger", "Logger._ErrorEnabled")
    @js.native
    def _ErrorEnabled: js.Any = js.native
    inline def _ErrorEnabled_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ErrorEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/logger", "Logger._FormatMessage")
    @js.native
    def _FormatMessage: js.Any = js.native
    inline def _FormatMessage_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_FormatMessage")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/logger", "Logger._LogCache")
    @js.native
    def _LogCache: js.Any = js.native
    inline def _LogCache_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LogCache")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/logger", "Logger._LogDisabled")
    @js.native
    def _LogDisabled: js.Any = js.native
    inline def _LogDisabled_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LogDisabled")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/logger", "Logger._LogEnabled")
    @js.native
    def _LogEnabled: js.Any = js.native
    inline def _LogEnabled_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LogEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/logger", "Logger._WarnDisabled")
    @js.native
    def _WarnDisabled: js.Any = js.native
    inline def _WarnDisabled_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_WarnDisabled")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/logger", "Logger._WarnEnabled")
    @js.native
    def _WarnEnabled: js.Any = js.native
    inline def _WarnEnabled_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_WarnEnabled")(x.asInstanceOf[js.Any])
    
    /**
      * Gets a value indicating the number of loading errors
      * @ignorenaming
      */
    @JSImport("babylonjs/Misc/logger", "Logger.errorsCount")
    @js.native
    def errorsCount: Double = js.native
    inline def errorsCount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("errorsCount")(x.asInstanceOf[js.Any])
  }
}
