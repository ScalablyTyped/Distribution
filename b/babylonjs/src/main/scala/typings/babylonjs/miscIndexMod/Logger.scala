package typings.babylonjs.miscIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "Logger")
@js.native
class Logger ()
  extends typings.babylonjs.loggerMod.Logger
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
  @JSImport("babylonjs/Misc/index", "Logger.ClearLogCache")
  @js.native
  def ClearLogCache(): Unit = js.native
  
  /**
    * Write an error message to the console
    */
  @JSImport("babylonjs/Misc/index", "Logger.Error")
  @js.native
  def Error(message: String): Unit = js.native
  
  /**
    * Only error logs
    */
  @JSImport("babylonjs/Misc/index", "Logger.ErrorLogLevel")
  @js.native
  val ErrorLogLevel: Double = js.native
  
  /**
    * Log a message to the console
    */
  @JSImport("babylonjs/Misc/index", "Logger.Log")
  @js.native
  def Log(message: String): Unit = js.native
  
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
  @JSImport("babylonjs/Misc/index", "Logger.OnNewCacheEntry")
  @js.native
  def OnNewCacheEntry(entry: String): Unit = js.native
  
  /**
    * Write a warning message to the console
    */
  @JSImport("babylonjs/Misc/index", "Logger.Warn")
  @js.native
  def Warn(message: String): Unit = js.native
  
  /**
    * Only warning logs
    */
  @JSImport("babylonjs/Misc/index", "Logger.WarningLogLevel")
  @js.native
  val WarningLogLevel: Double = js.native
  
  @JSImport("babylonjs/Misc/index", "Logger._AddLogEntry")
  @js.native
  def _AddLogEntry: js.Any = js.native
  @scala.inline
  def _AddLogEntry_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_AddLogEntry")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "Logger._ErrorDisabled")
  @js.native
  def _ErrorDisabled: js.Any = js.native
  @scala.inline
  def _ErrorDisabled_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ErrorDisabled")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "Logger._ErrorEnabled")
  @js.native
  def _ErrorEnabled: js.Any = js.native
  @scala.inline
  def _ErrorEnabled_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ErrorEnabled")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "Logger._FormatMessage")
  @js.native
  def _FormatMessage: js.Any = js.native
  @scala.inline
  def _FormatMessage_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_FormatMessage")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "Logger._LogCache")
  @js.native
  def _LogCache: js.Any = js.native
  @scala.inline
  def _LogCache_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LogCache")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "Logger._LogDisabled")
  @js.native
  def _LogDisabled: js.Any = js.native
  @scala.inline
  def _LogDisabled_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LogDisabled")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "Logger._LogEnabled")
  @js.native
  def _LogEnabled: js.Any = js.native
  @scala.inline
  def _LogEnabled_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LogEnabled")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "Logger._WarnDisabled")
  @js.native
  def _WarnDisabled: js.Any = js.native
  @scala.inline
  def _WarnDisabled_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_WarnDisabled")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "Logger._WarnEnabled")
  @js.native
  def _WarnEnabled: js.Any = js.native
  @scala.inline
  def _WarnEnabled_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_WarnEnabled")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a value indicating the number of loading errors
    * @ignorenaming
    */
  @JSImport("babylonjs/Misc/index", "Logger.errorsCount")
  @js.native
  def errorsCount: Double = js.native
  @scala.inline
  def errorsCount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("errorsCount")(x.asInstanceOf[js.Any])
}
