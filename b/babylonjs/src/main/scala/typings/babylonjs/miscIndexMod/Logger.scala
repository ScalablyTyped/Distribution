package typings.babylonjs.miscIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "Logger")
@js.native
open class Logger ()
  extends typings.babylonjs.miscLoggerMod.Logger
/* static members */
object Logger {
  
  @JSImport("babylonjs/Misc/index", "Logger")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * All logs
    */
  @JSImport("babylonjs/Misc/index", "Logger.AllLogLevel")
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
  inline def Error(message: String, limit: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Error")(message.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Only error logs
    */
  @JSImport("babylonjs/Misc/index", "Logger.ErrorLogLevel")
  @js.native
  val ErrorLogLevel: Double = js.native
  
  /**
    * Log a message to the console
    */
  inline def Log(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Log")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def Log(message: String, limit: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Log")(message.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Message to display when a message has been logged too many times
    */
  @JSImport("babylonjs/Misc/index", "Logger.MessageLimitReached")
  @js.native
  def MessageLimitReached: String = js.native
  inline def MessageLimitReached_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MessageLimitReached")(x.asInstanceOf[js.Any])
  
  /**
    * Only message logs
    */
  @JSImport("babylonjs/Misc/index", "Logger.MessageLogLevel")
  @js.native
  val MessageLogLevel: Double = js.native
  
  /**
    * No log
    */
  @JSImport("babylonjs/Misc/index", "Logger.NoneLogLevel")
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
  inline def Warn(message: String, limit: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Warn")(message.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Only warning logs
    */
  @JSImport("babylonjs/Misc/index", "Logger.WarningLogLevel")
  @js.native
  val WarningLogLevel: Double = js.native
  
  @JSImport("babylonjs/Misc/index", "Logger._AddLogEntry")
  @js.native
  def _AddLogEntry: Any = js.native
  inline def _AddLogEntry_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_AddLogEntry")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "Logger._CheckLimit")
  @js.native
  def _CheckLimit: Any = js.native
  inline def _CheckLimit_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CheckLimit")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "Logger._FormatMessage")
  @js.native
  def _FormatMessage: Any = js.native
  inline def _FormatMessage_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_FormatMessage")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "Logger._GenerateLimitMessage")
  @js.native
  def _GenerateLimitMessage: Any = js.native
  inline def _GenerateLimitMessage_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GenerateLimitMessage")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "Logger._Levels")
  @js.native
  def _Levels: Any = js.native
  inline def _Levels_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Levels")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "Logger._LogCache")
  @js.native
  def _LogCache: Any = js.native
  inline def _LogCache_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LogCache")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "Logger._LogDisabled")
  @js.native
  def _LogDisabled: Any = js.native
  inline def _LogDisabled_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LogDisabled")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "Logger._LogEnabled")
  @js.native
  def _LogEnabled: Any = js.native
  inline def _LogEnabled_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LogEnabled")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "Logger._LogLimitOutputs")
  @js.native
  def _LogLimitOutputs: Any = js.native
  inline def _LogLimitOutputs_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LogLimitOutputs")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a value indicating the number of loading errors
    * @ignorenaming
    */
  @JSImport("babylonjs/Misc/index", "Logger.errorsCount")
  @js.native
  def errorsCount: Double = js.native
  inline def errorsCount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("errorsCount")(x.asInstanceOf[js.Any])
}
