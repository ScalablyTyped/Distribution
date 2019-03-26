package typings
package cordovaDashPluginDashFileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileError extends js.Object {
  /** Error code */
  var code: scala.Double
}

@JSGlobal("FileError")
@js.native
class FileErrorCls protected () extends FileError {
  def this(code: scala.Double) = this()
  /** Error code */
  /* CompleteClass */
  override var code: scala.Double = js.native
}

@JSGlobal("FileError")
@js.native
object FileError
  extends org.scalablytyped.runtime.Instantiable1[/* code */ scala.Double, FileError] {
  var ABORT_ERR: scala.Double = js.native
  var ENCODING_ERR: scala.Double = js.native
  var INVALID_MODIFICATION_ERR: scala.Double = js.native
  var INVALID_STATE_ERR: scala.Double = js.native
  var NOT_FOUND_ERR: scala.Double = js.native
  var NOT_READABLE_ERR: scala.Double = js.native
  var NO_MODIFICATION_ALLOWED_ERR: scala.Double = js.native
  var PATH_EXISTS_ERR: scala.Double = js.native
  var QUOTA_EXCEEDED_ERR: scala.Double = js.native
  var SECURITY_ERR: scala.Double = js.native
  var SYNTAX_ERR: scala.Double = js.native
  var TYPE_MISMATCH_ERR: scala.Double = js.native
}

