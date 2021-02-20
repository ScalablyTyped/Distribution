package typings.consoleUi

import typings.consoleUi.mod.WriteLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object consoleUiStrings {
  
  @js.native
  sealed trait DEBUG extends WriteLevel
  @scala.inline
  def DEBUG: DEBUG = "DEBUG".asInstanceOf[DEBUG]
  
  @js.native
  sealed trait ERROR extends WriteLevel
  @scala.inline
  def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait INFO extends WriteLevel
  @scala.inline
  def INFO: INFO = "INFO".asInstanceOf[INFO]
  
  @js.native
  sealed trait WARNING extends WriteLevel
  @scala.inline
  def WARNING: WARNING = "WARNING".asInstanceOf[WARNING]
}
