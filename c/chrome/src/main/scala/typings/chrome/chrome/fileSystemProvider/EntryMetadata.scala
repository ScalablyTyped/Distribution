package typings.chrome.chrome.fileSystemProvider

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntryMetadata extends js.Object {
  /** True if it is a directory. */
  var isDirectory: Boolean = js.native
  /** Optional. Mime type for the entry.  */
  var mimeType: js.UndefOr[String] = js.native
  /** The last modified time of this entry. */
  var modificationTime: Date = js.native
  /** Name of this entry (not full path name). Must not contain '/'. For root it must be empty. */
  var name: String = js.native
  /** File size in bytes. */
  var size: Double = js.native
  /** Optional. Thumbnail image as a data URI in either PNG, JPEG or WEBP format, at most 32 KB in size. Optional, but can be provided only when explicitly requested by the onGetMetadataRequested event.  */
  var thumbnail: js.UndefOr[String] = js.native
}

object EntryMetadata {
  @scala.inline
  def apply(isDirectory: Boolean, modificationTime: Date, name: String, size: Double): EntryMetadata = {
    val __obj = js.Dynamic.literal(isDirectory = isDirectory.asInstanceOf[js.Any], modificationTime = modificationTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryMetadata]
  }
  @scala.inline
  implicit class EntryMetadataOps[Self <: EntryMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsDirectory(value: Boolean): Self = this.set("isDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def setModificationTime(value: Date): Self = this.set("modificationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    @scala.inline
    def setThumbnail(value: String): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnail: Self = this.set("thumbnail", js.undefined)
  }
  
}

