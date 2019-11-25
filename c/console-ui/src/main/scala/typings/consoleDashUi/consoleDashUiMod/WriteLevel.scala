package typings.consoleDashUi.consoleDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.consoleDashUi.consoleDashUiStrings.DEBUG
  - typings.consoleDashUi.consoleDashUiStrings.INFO
  - typings.consoleDashUi.consoleDashUiStrings.WARNING
  - typings.consoleDashUi.consoleDashUiStrings.ERROR
*/
trait WriteLevel extends js.Object

object WriteLevel {
  @scala.inline
  def DEBUG: typings.consoleDashUi.consoleDashUiStrings.DEBUG = this.cast("DEBUG")
  @scala.inline
  def ERROR: typings.consoleDashUi.consoleDashUiStrings.ERROR = this.cast("ERROR")
  @scala.inline
  def INFO: typings.consoleDashUi.consoleDashUiStrings.INFO = this.cast("INFO")
  @scala.inline
  def WARNING: typings.consoleDashUi.consoleDashUiStrings.WARNING = this.cast("WARNING")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

