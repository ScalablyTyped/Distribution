package typings
package chromeLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataRequestedEventOptions extends EntryPathRequestedEventOptions {
  /** Set to true if the thumbnail is requested. */
  var thumbnail: scala.Boolean
}

object MetadataRequestedEventOptions {
  @scala.inline
  def apply(
    entryPath: java.lang.String,
    fileSystemId: java.lang.String,
    requestId: scala.Double,
    thumbnail: scala.Boolean
  ): MetadataRequestedEventOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("entryPath")(entryPath)
    __obj.updateDynamic("fileSystemId")(fileSystemId)
    __obj.updateDynamic("requestId")(requestId)
    __obj.updateDynamic("thumbnail")(thumbnail)
    __obj.asInstanceOf[MetadataRequestedEventOptions]
  }
}

