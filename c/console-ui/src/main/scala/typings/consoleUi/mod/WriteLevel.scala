package typings.consoleUi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.consoleUi.consoleUiStrings.DEBUG
  - typings.consoleUi.consoleUiStrings.INFO
  - typings.consoleUi.consoleUiStrings.WARNING
  - typings.consoleUi.consoleUiStrings.ERROR
*/
trait WriteLevel extends js.Object

object WriteLevel {
  @scala.inline
  def DEBUG: typings.consoleUi.consoleUiStrings.DEBUG = this.cast("DEBUG")
  @scala.inline
  def ERROR: typings.consoleUi.consoleUiStrings.ERROR = this.cast("ERROR")
  @scala.inline
  def INFO: typings.consoleUi.consoleUiStrings.INFO = this.cast("INFO")
  @scala.inline
  def WARNING: typings.consoleUi.consoleUiStrings.WARNING = this.cast("WARNING")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

