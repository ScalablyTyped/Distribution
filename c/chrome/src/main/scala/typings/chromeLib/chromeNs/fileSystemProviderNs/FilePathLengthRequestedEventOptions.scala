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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filePath")(filePath)
    __obj.updateDynamic("fileSystemId")(fileSystemId)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("requestId")(requestId)
    __obj.asInstanceOf[FilePathLengthRequestedEventOptions]
  }
}

