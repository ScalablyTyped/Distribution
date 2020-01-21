package typings.braftEditor

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErr extends js.Object {
  var file: File
  var libraryId: String
  def error(err: AnonMsg): Unit
  def progress(progress: Double): Unit
  def success(res: AnonMeta): Unit
}

object AnonErr {
  @scala.inline
  def apply(
    error: AnonMsg => Unit,
    file: File,
    libraryId: String,
    progress: Double => Unit,
    success: AnonMeta => Unit
  ): AnonErr = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), file = file.asInstanceOf[js.Any], libraryId = libraryId.asInstanceOf[js.Any], progress = js.Any.fromFunction1(progress), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[AnonErr]
  }
}

