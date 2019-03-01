package typings
package chromeDashAppsLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadDirectoryRequestedEventOptions
  extends chromeDashAppsLib.chromeNs.fileSystemProviderNs.underscoreInternalUnderscoreNs.RequestedEventOptions {
  /** The path of the directory which is to be operated on. */
  var directoryPath: java.lang.String
  /**
    * Set to true if is_directory value is requested
    * @since Chrome 49.
    */
  var isDirectory: scala.Boolean
  /**
    * Set to true if mimeType value is requested.
    * @since Chrome 49.
    */
  var mimeType: scala.Boolean
  /**
    * Set to true if modificationTime value is requested
    * @since Chrome 49.
    */
  var modificationTime: scala.Boolean
  /**
    * Set to true if is_directory value is requested.
    * @since Chrome 49.
    */
  var name: scala.Boolean
  /**
    * Set to true if size value is requested.
    * @since Chrome 49.
    */
  var size: scala.Boolean
  /**
    * Set to true if the thumbnail is requested.
    */
  var thumbnail: scala.Boolean
}

object ReadDirectoryRequestedEventOptions {
  @scala.inline
  def apply(
    directoryPath: java.lang.String,
    fileSystemId: java.lang.String,
    isDirectory: scala.Boolean,
    mimeType: scala.Boolean,
    modificationTime: scala.Boolean,
    name: scala.Boolean,
    requestId: chromeDashAppsLib.chromeNs.integer,
    size: scala.Boolean,
    thumbnail: scala.Boolean
  ): ReadDirectoryRequestedEventOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("directoryPath")(directoryPath)
    __obj.updateDynamic("fileSystemId")(fileSystemId)
    __obj.updateDynamic("isDirectory")(isDirectory)
    __obj.updateDynamic("mimeType")(mimeType)
    __obj.updateDynamic("modificationTime")(modificationTime)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("requestId")(requestId)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("thumbnail")(thumbnail)
    __obj.asInstanceOf[ReadDirectoryRequestedEventOptions]
  }
}

