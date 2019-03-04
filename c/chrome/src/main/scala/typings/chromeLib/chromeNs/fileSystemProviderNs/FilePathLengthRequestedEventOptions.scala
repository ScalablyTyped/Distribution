package typings
package chromeLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePathLengthRequestedEventOptions extends FilePathRequestedEventOptions {
  /** Number of bytes to be retained after the operation completes. */
  var length: scala.Double
}

object FilePathLengthRequestedEventOptions {
  @scala.inline
  def apply(
    filePath: java.lang.String,
    fileSystemId: java.lang.String,
    length: scala.Double,
    requestId: scala.Double
  ): FilePathLengthRequestedEventOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath, fileSystemId = fileSystemId, length = length, requestId = requestId)
  
    __obj.asInstanceOf[FilePathLengthRequestedEventOptions]
  }
}

