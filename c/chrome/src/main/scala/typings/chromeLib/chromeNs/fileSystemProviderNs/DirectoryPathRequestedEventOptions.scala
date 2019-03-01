package typings
package chromeLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryPathRequestedEventOptions extends RequestedEventOptions {
  /** The path of the directory which is to be operated on. */
  var directoryPath: java.lang.String
}

object DirectoryPathRequestedEventOptions {
  @scala.inline
  def apply(directoryPath: java.lang.String, fileSystemId: java.lang.String, requestId: scala.Double): DirectoryPathRequestedEventOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("directoryPath")(directoryPath)
    __obj.updateDynamic("fileSystemId")(fileSystemId)
    __obj.updateDynamic("requestId")(requestId)
    __obj.asInstanceOf[DirectoryPathRequestedEventOptions]
  }
}

