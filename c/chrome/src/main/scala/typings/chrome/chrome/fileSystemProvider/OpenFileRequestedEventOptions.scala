package typings.chrome.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenFileRequestedEventOptions extends FilePathRequestedEventOptions {
  /** Whether the file will be used for reading or writing. */
  var mode: String
}

object OpenFileRequestedEventOptions {
  @scala.inline
  def apply(filePath: String, fileSystemId: String, mode: String, requestId: Double): OpenFileRequestedEventOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpenFileRequestedEventOptions]
  }
}

