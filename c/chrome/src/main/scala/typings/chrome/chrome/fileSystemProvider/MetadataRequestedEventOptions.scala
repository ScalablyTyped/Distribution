package typings.chrome.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataRequestedEventOptions extends EntryPathRequestedEventOptions {
  /** Set to true if the thumbnail is requested. */
  var thumbnail: Boolean
}

object MetadataRequestedEventOptions {
  @scala.inline
  def apply(entryPath: String, fileSystemId: String, requestId: Double, thumbnail: Boolean): MetadataRequestedEventOptions = {
    val __obj = js.Dynamic.literal(entryPath = entryPath, fileSystemId = fileSystemId, requestId = requestId, thumbnail = thumbnail)
  
    __obj.asInstanceOf[MetadataRequestedEventOptions]
  }
}

