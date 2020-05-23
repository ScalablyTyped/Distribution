package typings.braftEditor.anon

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var file: File
  var libraryId: String
  def error(err: Msg): Unit
  def progress(progress: Double): Unit
  def success(res: Meta): Unit
}

object Error {
  @scala.inline
  def apply(error: Msg => Unit, file: File, libraryId: String, progress: Double => Unit, success: Meta => Unit): Error = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), file = file.asInstanceOf[js.Any], libraryId = libraryId.asInstanceOf[js.Any], progress = js.Any.fromFunction1(progress), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[Error]
  }
}

