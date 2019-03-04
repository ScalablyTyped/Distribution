package typings
package chromeLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenFileRequestedEventOptions extends FilePathRequestedEventOptions {
  /** Whether the file will be used for reading or writing. */
  var mode: java.lang.String
}

object OpenFileRequestedEventOptions {
  @scala.inline
  def apply(
    filePath: java.lang.String,
    fileSystemId: java.lang.String,
    mode: java.lang.String,
    requestId: scala.Double
  ): OpenFileRequestedEventOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath, fileSystemId = fileSystemId, mode = mode, requestId = requestId)
  
    __obj.asInstanceOf[OpenFileRequestedEventOptions]
  }
}

