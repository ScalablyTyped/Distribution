package typings
package consoleDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object consoleDashUiLibStrings {
  @js.native
  sealed trait DEBUG
    extends consoleDashUiLib.consoleDashUiMod.WriteLevel
  
  @js.native
  sealed trait ERROR
    extends consoleDashUiLib.consoleDashUiMod.WriteLevel
  
  @js.native
  sealed trait INFO
    extends consoleDashUiLib.consoleDashUiMod.WriteLevel
  
  @js.native
  sealed trait WARNING
    extends consoleDashUiLib.consoleDashUiMod.WriteLevel
  
  @scala.inline
  def DEBUG: DEBUG = "DEBUG".asInstanceOf[DEBUG]
  @scala.inline
  def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  @scala.inline
  def INFO: INFO = "INFO".asInstanceOf[INFO]
  @scala.inline
  def WARNING: WARNING = "WARNING".asInstanceOf[WARNING]
}

