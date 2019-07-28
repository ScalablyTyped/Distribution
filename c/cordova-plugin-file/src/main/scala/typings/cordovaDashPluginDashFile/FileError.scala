package typings.cordovaDashPluginDashFile

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileError extends js.Object {
  /** Error code */
  var code: Double
}

@JSGlobal("FileError")
@js.native
class FileErrorCls protected () extends FileError {
  def this(code: Double) = this()
  /** Error code */
  /* CompleteClass */
  override var code: Double = js.native
}

@JSGlobal("FileError")
@js.native
object FileError extends Instantiable1[/* code */ Double, FileError] {
  var ABORT_ERR: Double = js.native
  var ENCODING_ERR: Double = js.native
  var INVALID_MODIFICATION_ERR: Double = js.native
  var INVALID_STATE_ERR: Double = js.native
  var NOT_FOUND_ERR: Double = js.native
  var NOT_READABLE_ERR: Double = js.native
  var NO_MODIFICATION_ALLOWED_ERR: Double = js.native
  var PATH_EXISTS_ERR: Double = js.native
  var QUOTA_EXCEEDED_ERR: Double = js.native
  var SECURITY_ERR: Double = js.native
  var SYNTAX_ERR: Double = js.native
  var TYPE_MISMATCH_ERR: Double = js.native
}

