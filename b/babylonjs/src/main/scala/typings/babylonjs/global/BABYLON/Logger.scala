package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Logger")
@js.native
open class Logger ()
  extends StObject
     with typings.babylonjs.BABYLON.Logger
/* static members */
object Logger {
  
  @JSGlobal("BABYLON.Logger")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * All logs
    */
  @JSGlobal("BABYLON.Logger.AllLogLevel")
  @js.native
  val AllLogLevel: /* 7 */ Double = js.native
  
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
  @JSGlobal("BABYLON.Logger.ErrorLogLevel")
  @js.native
  val ErrorLogLevel: /* 4 */ Double = js.native
  
  /**
    * Log a message to the console
    */
  inline def Log(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Log")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def Log(message: String, limit: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Log")(message.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Message to display when a message has been logged too many times
    */
  @JSGlobal("BABYLON.Logger.MessageLimitReached")
  @js.native
  def MessageLimitReached: String = js.native
  inline def MessageLimitReached_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MessageLimitReached")(x.asInstanceOf[js.Any])
  
  /**
    * Only message logs
    */
  @JSGlobal("BABYLON.Logger.MessageLogLevel")
  @js.native
  val MessageLogLevel: /* 1 */ Double = js.native
  
  /**
    * No log
    */
  @JSGlobal("BABYLON.Logger.NoneLogLevel")
  @js.native
  val NoneLogLevel: /* 0 */ Double = js.native
  
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
  @JSGlobal("BABYLON.Logger.WarningLogLevel")
  @js.native
  val WarningLogLevel: /* 2 */ Double = js.native
  
  @JSGlobal("BABYLON.Logger._AddLogEntry")
  @js.native
  def _AddLogEntry: Any = js.native
  inline def _AddLogEntry_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_AddLogEntry")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Logger._CheckLimit")
  @js.native
  def _CheckLimit: Any = js.native
  inline def _CheckLimit_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CheckLimit")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Logger._FormatMessage")
  @js.native
  def _FormatMessage: Any = js.native
  inline def _FormatMessage_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_FormatMessage")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Logger._GenerateLimitMessage")
  @js.native
  def _GenerateLimitMessage: Any = js.native
  inline def _GenerateLimitMessage_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GenerateLimitMessage")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Logger._Levels")
  @js.native
  def _Levels: Any = js.native
  inline def _Levels_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Levels")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Logger._LogCache")
  @js.native
  def _LogCache: Any = js.native
  inline def _LogCache_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LogCache")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Logger._LogDisabled")
  @js.native
  def _LogDisabled: Any = js.native
  inline def _LogDisabled_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LogDisabled")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Logger._LogEnabled")
  @js.native
  def _LogEnabled: Any = js.native
  inline def _LogEnabled_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LogEnabled")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Logger._LogLimitOutputs")
  @js.native
  def _LogLimitOutputs: Any = js.native
  inline def _LogLimitOutputs_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LogLimitOutputs")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a value indicating the number of loading errors
    * @ignorenaming
    */
  @JSGlobal("BABYLON.Logger.errorsCount")
  @js.native
  def errorsCount: Double = js.native
  inline def errorsCount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("errorsCount")(x.asInstanceOf[js.Any])
}
