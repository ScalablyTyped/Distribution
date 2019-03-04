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
    val __obj = js.Dynamic.literal(entryPath = entryPath, fileSystemId = fileSystemId, requestId = requestId, thumbnail = thumbnail)
  
    __obj.asInstanceOf[MetadataRequestedEventOptions]
  }
}

