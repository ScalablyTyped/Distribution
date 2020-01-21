package typings.ckeditorCkeditor5Utils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.equal
  - typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.insert
  - typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.delete
*/
trait Change extends js.Object

object Change {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.delete = this.cast("delete")
  @scala.inline
  def equal: typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.equal = this.cast("equal")
  @scala.inline
  def insert: typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.insert = this.cast("insert")
}

