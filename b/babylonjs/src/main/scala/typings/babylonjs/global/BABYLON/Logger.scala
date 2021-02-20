package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Logger")
@js.native
class Logger ()
  extends typings.babylonjs.BABYLON.Logger
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
  val AllLogLevel: Double = js.native
  
  /**
    * Clears the log cache
    */
  @JSGlobal("BABYLON.Logger.ClearLogCache")
  @js.native
  def ClearLogCache(): Unit = js.native
  
  /**
    * Write an error message to the console
    */
  @JSGlobal("BABYLON.Logger.Error")
  @js.native
  def Error(message: String): Unit = js.native
  
  /**
    * Only error logs
    */
  @JSGlobal("BABYLON.Logger.ErrorLogLevel")
  @js.native
  val ErrorLogLevel: Double = js.native
  
  /**
    * Log a message to the console
    */
  @JSGlobal("BABYLON.Logger.Log")
  @js.native
  def Log(message: String): Unit = js.native
  
  /**
    * Only message logs
    */
  @JSGlobal("BABYLON.Logger.MessageLogLevel")
  @js.native
  val MessageLogLevel: Double = js.native
  
  /**
    * No log
    */
  @JSGlobal("BABYLON.Logger.NoneLogLevel")
  @js.native
  val NoneLogLevel: Double = js.native
  
  /**
    * Callback called when a new log is added
    */
  @JSGlobal("BABYLON.Logger.OnNewCacheEntry")
  @js.native
  def OnNewCacheEntry(entry: String): Unit = js.native
  
  /**
    * Write a warning message to the console
    */
  @JSGlobal("BABYLON.Logger.Warn")
  @js.native
  def Warn(message: String): Unit = js.native
  
  /**
    * Only warning logs
    */
  @JSGlobal("BABYLON.Logger.WarningLogLevel")
  @js.native
  val WarningLogLevel: Double = js.native
  
  @JSGlobal("BABYLON.Logger._AddLogEntry")
  @js.native
  def _AddLogEntry: js.Any = js.native
  @scala.inline
  def _AddLogEntry_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_AddLogEntry")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Logger._ErrorDisabled")
  @js.native
  def _ErrorDisabled: js.Any = js.native
  @scala.inline
  def _ErrorDisabled_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ErrorDisabled")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Logger._ErrorEnabled")
  @js.native
  def _ErrorEnabled: js.Any = js.native
  @scala.inline
  def _ErrorEnabled_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ErrorEnabled")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Logger._FormatMessage")
  @js.native
  def _FormatMessage: js.Any = js.native
  @scala.inline
  def _FormatMessage_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_FormatMessage")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Logger._LogCache")
  @js.native
  def _LogCache: js.Any = js.native
  @scala.inline
  def _LogCache_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LogCache")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Logger._LogDisabled")
  @js.native
  def _LogDisabled: js.Any = js.native
  @scala.inline
  def _LogDisabled_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LogDisabled")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Logger._LogEnabled")
  @js.native
  def _LogEnabled: js.Any = js.native
  @scala.inline
  def _LogEnabled_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LogEnabled")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Logger._WarnDisabled")
  @js.native
  def _WarnDisabled: js.Any = js.native
  @scala.inline
  def _WarnDisabled_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_WarnDisabled")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Logger._WarnEnabled")
  @js.native
  def _WarnEnabled: js.Any = js.native
  @scala.inline
  def _WarnEnabled_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_WarnEnabled")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a value indicating the number of loading errors
    * @ignorenaming
    */
  @JSGlobal("BABYLON.Logger.errorsCount")
  @js.native
  def errorsCount: Double = js.native
  @scala.inline
  def errorsCount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("errorsCount")(x.asInstanceOf[js.Any])
}
