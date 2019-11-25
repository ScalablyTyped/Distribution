package typings.ckeditor.CKEDITOR.plugins.notification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ckeditor.ckeditorStrings.info
  - typings.ckeditor.ckeditorStrings.warning
  - typings.ckeditor.ckeditorStrings.success
  - typings.ckeditor.ckeditorStrings.progress
*/
trait `type` extends js.Object

object `type` {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def info: typings.ckeditor.ckeditorStrings.info = this.cast("info")
  @scala.inline
  def progress: typings.ckeditor.ckeditorStrings.progress = this.cast("progress")
  @scala.inline
  def success: typings.ckeditor.ckeditorStrings.success = this.cast("success")
  @scala.inline
  def warning: typings.ckeditor.ckeditorStrings.warning = this.cast("warning")
}

