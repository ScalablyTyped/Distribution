package typings.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "Logger")
@js.native
class Logger ()
  extends typings.babylonjs.miscIndexMod.Logger
/* static members */
@JSImport("babylonjs/index", "Logger")
@js.native
object Logger extends js.Object {
  
  /**
    * All logs
    */
  val AllLogLevel: Double = js.native
  
  /**
    * Clears the log cache
    */
  def ClearLogCache(): Unit = js.native
  
  /**
    * Write an error message to the console
    */
  def Error(message: String): Unit = js.native
  
  /**
    * Only error logs
    */
  val ErrorLogLevel: Double = js.native
  
  /**
    * Log a message to the console
    */
  def Log(message: String): Unit = js.native
  
  /**
    * Gets current log cache (list of logs)
    */
  def LogCache: String = js.native
  
  /**
    * Sets the current log level (MessageLogLevel / WarningLogLevel / ErrorLogLevel)
    */
  def LogLevels_=(level: Double): Unit = js.native
  
  /**
    * Only message logs
    */
  val MessageLogLevel: Double = js.native
  
  /**
    * No log
    */
  val NoneLogLevel: Double = js.native
  
  /**
    * Callback called when a new log is added
    */
  def OnNewCacheEntry(entry: String): Unit = js.native
  
  /**
    * Write a warning message to the console
    */
  def Warn(message: String): Unit = js.native
  
  /**
    * Only warning logs
    */
  val WarningLogLevel: Double = js.native
  
  var _AddLogEntry: js.Any = js.native
  
  var _ErrorDisabled: js.Any = js.native
  
  var _ErrorEnabled: js.Any = js.native
  
  var _FormatMessage: js.Any = js.native
  
  var _LogCache: js.Any = js.native
  
  var _LogDisabled: js.Any = js.native
  
  var _LogEnabled: js.Any = js.native
  
  var _WarnDisabled: js.Any = js.native
  
  var _WarnEnabled: js.Any = js.native
  
  /**
    * Gets a value indicating the number of loading errors
    * @ignorenaming
    */
  var errorsCount: Double = js.native
}
