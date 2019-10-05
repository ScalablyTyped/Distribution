package typings.chrome.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenedFileInfo extends js.Object {
  /** The path of the opened file. */
  var filePath: String
  /** Whether the file was opened for reading or writing. */
  var mode: String
  /** A request ID to be be used by consecutive read/write and close requests. */
  var openRequestId: Double
}

object OpenedFileInfo {
  @scala.inline
  def apply(filePath: String, mode: String, openRequestId: Double): OpenedFileInfo = {
    val __obj = js.Dynamic.literal(filePath = filePath, mode = mode, openRequestId = openRequestId)
  
    __obj.asInstanceOf[OpenedFileInfo]
  }
}

