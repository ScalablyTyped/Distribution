package typings.chromeDashApps.chrome.fileSystemProvider

import typings.chromeDashApps.chrome.fileSystemProvider._internal_.EntryPathRequestedEventOptions
import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataRequestedEventOptions extends EntryPathRequestedEventOptions {
  /**
    * Set to true if is_directory value is requested
    * @since Chrome 49.
    */
  var isDirectory: Boolean
  /**
    * Set to true if mimeType value is requested.
    * @since Chrome 49.
    */
  var mimeType: Boolean
  /**
    * Set to true if modificationTime value is requested
    * @since Chrome 49.
    */
  var modificationTime: Boolean
  /**
    * Set to true if is_directory value is requested.
    * @since Chrome 49.
    */
  var name: Boolean
  /**
    * Set to true if size value is requested.
    * @since Chrome 49.
    */
  var size: Boolean
  /**
    * Set to true if the thumbnail is requested.
    */
  var thumbnail: Boolean
}

object MetadataRequestedEventOptions {
  @scala.inline
  def apply(
    entryPath: String,
    fileSystemId: String,
    isDirectory: Boolean,
    mimeType: Boolean,
    modificationTime: Boolean,
    name: Boolean,
    requestId: integer,
    size: Boolean,
    thumbnail: Boolean
  ): MetadataRequestedEventOptions = {
    val __obj = js.Dynamic.literal(entryPath = entryPath, fileSystemId = fileSystemId, isDirectory = isDirectory, mimeType = mimeType, modificationTime = modificationTime, name = name, requestId = requestId, size = size, thumbnail = thumbnail)
  
    __obj.asInstanceOf[MetadataRequestedEventOptions]
  }
}

