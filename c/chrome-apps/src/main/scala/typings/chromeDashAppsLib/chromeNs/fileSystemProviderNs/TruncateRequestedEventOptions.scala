package typings
package chromeDashAppsLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TruncateRequestedEventOptions
  extends chromeDashAppsLib.chromeNs.fileSystemProviderNs.underscoreInternalUnderscoreNs.FilePathRequestedEventOptions {
  /** Number of bytes to be retained after the operation completes. */
  var length: chromeDashAppsLib.chromeNs.double
}

object TruncateRequestedEventOptions {
  @scala.inline
  def apply(
    filePath: java.lang.String,
    fileSystemId: java.lang.String,
    length: chromeDashAppsLib.chromeNs.double,
    requestId: chromeDashAppsLib.chromeNs.integer
  ): TruncateRequestedEventOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filePath")(filePath)
    __obj.updateDynamic("fileSystemId")(fileSystemId)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("requestId")(requestId)
    __obj.asInstanceOf[TruncateRequestedEventOptions]
  }
}

