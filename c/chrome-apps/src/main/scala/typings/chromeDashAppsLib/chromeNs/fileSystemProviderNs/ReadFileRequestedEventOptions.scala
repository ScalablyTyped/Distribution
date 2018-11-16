package typings
package chromeDashAppsLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReadFileRequestedEventOptions
  extends chromeDashAppsLib.chromeNs.fileSystemProviderNs.underscoreInternalUnderscoreNs.RequestedEventOptions {
  /** Number of bytes to be returned. */
  var length: chromeDashAppsLib.chromeNs.double
  /** Position in the file (in bytes) to start reading from. */
  var offset: chromeDashAppsLib.chromeNs.double
  /** A request ID used to open the file. */
  var openRequestId: chromeDashAppsLib.chromeNs.integer
}

