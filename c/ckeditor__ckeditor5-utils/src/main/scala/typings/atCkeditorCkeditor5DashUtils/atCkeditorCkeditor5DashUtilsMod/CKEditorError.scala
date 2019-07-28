package typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-utils", "CKEditorError")
@js.native
class CKEditorError protected () extends Error {
  def this(message: String) = this()
  def this(message: String, data: js.Object) = this()
  var data: js.UndefOr[js.Object] = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

/* static members */
@JSImport("@ckeditor/ckeditor5-utils", "CKEditorError")
@js.native
object CKEditorError extends js.Object {
  def isCKEditorError(error: Error): Boolean = js.native
}

