package typings.chromeDashApps.chromeNs.fileSystemProviderNs

import typings.chromeDashApps.chromeNs.fileSystemProviderNs.underscoreInternalUnderscoreNs.RequestedEventOptions
import typings.chromeDashApps.chromeNs.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadDirectoryRequestedEventOptions extends RequestedEventOptions {
  /** The path of the directory which is to be operated on. */
  var directoryPath: String
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

object ReadDirectoryRequestedEventOptions {
  @scala.inline
  def apply(
    directoryPath: String,
    fileSystemId: String,
    isDirectory: Boolean,
    mimeType: Boolean,
    modificationTime: Boolean,
    name: Boolean,
    requestId: integer,
    size: Boolean,
    thumbnail: Boolean
  ): ReadDirectoryRequestedEventOptions = {
    val __obj = js.Dynamic.literal(directoryPath = directoryPath, fileSystemId = fileSystemId, isDirectory = isDirectory, mimeType = mimeType, modificationTime = modificationTime, name = name, requestId = requestId, size = size, thumbnail = thumbnail)
  
    __obj.asInstanceOf[ReadDirectoryRequestedEventOptions]
  }
}

