package typings
package chromeLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OpenedFileOffsetRequestedEventOptions extends OpenedFileRequestedEventOptions {
  /** Number of bytes to be returned. */
  var length: scala.Double
  /** Position in the file (in bytes) to start reading from. */
  var offset: scala.Double
}

