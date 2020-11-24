package typings.consoleUi

import typings.consoleUi.mod.WriteLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object consoleUiStrings {
  
  @scala.inline
  def DEBUG: DEBUG = "DEBUG".asInstanceOf[DEBUG]
  
  @scala.inline
  def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @scala.inline
  def INFO: INFO = "INFO".asInstanceOf[INFO]
  
  @scala.inline
  def WARNING: WARNING = "WARNING".asInstanceOf[WARNING]
  
  @js.native
  sealed trait DEBUG extends WriteLevel
  
  @js.native
  sealed trait ERROR extends WriteLevel
  
  @js.native
  sealed trait INFO extends WriteLevel
  
  @js.native
  sealed trait WARNING extends WriteLevel
}
