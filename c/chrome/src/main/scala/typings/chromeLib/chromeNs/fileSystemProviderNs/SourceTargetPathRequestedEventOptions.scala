package typings
package chromeLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceTargetPathRequestedEventOptions extends RequestedEventOptions {
  /** The source path for the operation. */
  var sourcePath: java.lang.String
  /** The destination path for the operation. */
  var targetPath: java.lang.String
}

object SourceTargetPathRequestedEventOptions {
  @scala.inline
  def apply(
    fileSystemId: java.lang.String,
    requestId: scala.Double,
    sourcePath: java.lang.String,
    targetPath: java.lang.String
  ): SourceTargetPathRequestedEventOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileSystemId")(fileSystemId)
    __obj.updateDynamic("requestId")(requestId)
    __obj.updateDynamic("sourcePath")(sourcePath)
    __obj.updateDynamic("targetPath")(targetPath)
    __obj.asInstanceOf[SourceTargetPathRequestedEventOptions]
  }
}

