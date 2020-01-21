package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.chrome.double
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntryMetadata extends js.Object {
  /** True if it is a directory. Must be provided if requested in options */
  var isDirectory: js.UndefOr[Boolean] = js.undefined
  /** Mime type for the entry.  */
  var mimeType: js.UndefOr[String] = js.undefined
  /** The last modified time of this entry. */
  var modificationTime: js.UndefOr[Date] = js.undefined
  /**
    * Name of this entry (not full path name).
    * Must not contain '/'.
    * For root it must be empty.
    * Must be provided if requested in options.
    **/
  var name: js.UndefOr[String] = js.undefined
  /** File size in bytes. Must be provided if requested in options. */
  var size: js.UndefOr[double] = js.undefined
  /**
    * Thumbnail image as a data URI in either PNG, JPEG or WEBP format, at most 32 KB in size.
    * Optional, but can be provided only when explicitly requested
    * by the onGetMetadataRequested event.
    */
  var thumbnail: js.UndefOr[String] = js.undefined
}

object EntryMetadata {
  @scala.inline
  def apply(
    isDirectory: js.UndefOr[Boolean] = js.undefined,
    mimeType: String = null,
    modificationTime: Date = null,
    name: String = null,
    size: Int | Double = null,
    thumbnail: String = null
  ): EntryMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isDirectory)) __obj.updateDynamic("isDirectory")(isDirectory.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (modificationTime != null) __obj.updateDynamic("modificationTime")(modificationTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryMetadata]
  }
}

