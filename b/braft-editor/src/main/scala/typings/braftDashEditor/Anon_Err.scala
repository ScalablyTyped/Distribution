package typings.braftDashEditor

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Err extends js.Object {
  var file: File
  var libraryId: String
  def error(err: Anon_Msg): Unit
  def progress(progress: Double): Unit
  def success(res: Anon_Meta): Unit
}

object Anon_Err {
  @scala.inline
  def apply(
    error: Anon_Msg => Unit,
    file: File,
    libraryId: String,
    progress: Double => Unit,
    success: Anon_Meta => Unit
  ): Anon_Err = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), file = file, libraryId = libraryId, progress = js.Any.fromFunction1(progress), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_Err]
  }
}

