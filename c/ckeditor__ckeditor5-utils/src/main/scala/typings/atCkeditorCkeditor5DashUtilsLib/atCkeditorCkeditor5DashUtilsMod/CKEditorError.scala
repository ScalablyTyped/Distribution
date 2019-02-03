package typings
package atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-utils", "CKEditorError")
@js.native
class CKEditorError protected ()
  extends stdLib.Error {
  def this(message: java.lang.String) = this()
  def this(message: java.lang.String, data: js.Object) = this()
  var data: js.UndefOr[js.Object] = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

/* static members */
@JSImport("@ckeditor/ckeditor5-utils", "CKEditorError")
@js.native
object CKEditorError extends js.Object {
  def isCKEditorError(error: stdLib.Error): scala.Boolean = js.native
}

