package typings.chrome.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePathLengthRequestedEventOptions extends FilePathRequestedEventOptions {
  /** Number of bytes to be retained after the operation completes. */
  var length: Double
}

object FilePathLengthRequestedEventOptions {
  @scala.inline
  def apply(filePath: String, fileSystemId: String, length: Double, requestId: Double): FilePathLengthRequestedEventOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath, fileSystemId = fileSystemId, length = length, requestId = requestId)
  
    __obj.asInstanceOf[FilePathLengthRequestedEventOptions]
  }
}

