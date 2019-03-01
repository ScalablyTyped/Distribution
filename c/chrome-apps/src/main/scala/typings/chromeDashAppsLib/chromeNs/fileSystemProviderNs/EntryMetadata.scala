package typings
package chromeDashAppsLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntryMetadata extends js.Object {
  /** True if it is a directory. Must be provided if requested in options */
  var isDirectory: js.UndefOr[scala.Boolean] = js.undefined
  /** Mime type for the entry.  */
  var mimeType: js.UndefOr[java.lang.String] = js.undefined
  /** The last modified time of this entry. */
  var modificationTime: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * Name of this entry (not full path name).
    * Must not contain '/'.
    * For root it must be empty.
    * Must be provided if requested in options.
    **/
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** File size in bytes. Must be provided if requested in options. */
  var size: js.UndefOr[chromeDashAppsLib.chromeNs.double] = js.undefined
  /**
    * Thumbnail image as a data URI in either PNG, JPEG or WEBP format, at most 32 KB in size.
    * Optional, but can be provided only when explicitly requested
    * by the onGetMetadataRequested event.
    */
  var thumbnail: js.UndefOr[java.lang.String] = js.undefined
}

object EntryMetadata {
  @scala.inline
  def apply(
    isDirectory: js.UndefOr[scala.Boolean] = js.undefined,
    mimeType: java.lang.String = null,
    modificationTime: stdLib.Date = null,
    name: java.lang.String = null,
    size: js.UndefOr[chromeDashAppsLib.chromeNs.double] = js.undefined,
    thumbnail: java.lang.String = null
  ): EntryMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isDirectory)) __obj.updateDynamic("isDirectory")(isDirectory)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (modificationTime != null) __obj.updateDynamic("modificationTime")(modificationTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size)
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail)
    __obj.asInstanceOf[EntryMetadata]
  }
}

