package typings.chromeApps.chrome.mediaGalleries

import typings.chromeApps.chrome.integer
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metadata extends js.Object {
  /** Defined for audio and video only. */
  var album: js.UndefOr[String] = js.native
  var artist: js.UndefOr[String] = js.native
  /**
    * The images embedded in the media file's metadata.
    * This is most often used for album art or video thumbnails.
    */
  var attachedImages: js.Array[Blob] = js.native
  var comment: js.UndefOr[String] = js.native
  var copyright: js.UndefOr[String] = js.native
  var disc: js.UndefOr[integer] = js.native
  /** Defined for audio and video. In seconds. */
  var duration: js.UndefOr[integer] = js.native
  var genre: js.UndefOr[String] = js.native
  /** Defined for images and video. In pixels. */
  var height: js.UndefOr[integer] = js.native
  var language: js.UndefOr[String] = js.native
  /** The browser sniffed mime type. */
  var mimeType: String = js.native
  /**
    * All the metadata in the media file.
    * For formats with multiple streams, stream order will be preserved.
    * Container metadata is the first element.
    */
  var rawTags: js.Array[RawTag] = js.native
  /** Defined for images and video. In degrees. */
  var rotation: js.UndefOr[integer] = js.native
  var title: js.UndefOr[String] = js.native
  var track: js.UndefOr[integer] = js.native
  var width: js.UndefOr[integer] = js.native
}

object Metadata {
  @scala.inline
  def apply(attachedImages: js.Array[Blob], mimeType: String, rawTags: js.Array[RawTag]): Metadata = {
    val __obj = js.Dynamic.literal(attachedImages = attachedImages.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], rawTags = rawTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  @scala.inline
  implicit class MetadataOps[Self <: Metadata] (val x: Self) extends AnyVal {
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
    def setAttachedImagesVarargs(value: Blob*): Self = this.set("attachedImages", js.Array(value :_*))
    @scala.inline
    def setAttachedImages(value: js.Array[Blob]): Self = this.set("attachedImages", value.asInstanceOf[js.Any])
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRawTagsVarargs(value: RawTag*): Self = this.set("rawTags", js.Array(value :_*))
    @scala.inline
    def setRawTags(value: js.Array[RawTag]): Self = this.set("rawTags", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlbum(value: String): Self = this.set("album", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlbum: Self = this.set("album", js.undefined)
    @scala.inline
    def setArtist(value: String): Self = this.set("artist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtist: Self = this.set("artist", js.undefined)
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setCopyright(value: String): Self = this.set("copyright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    @scala.inline
    def setDisc(value: integer): Self = this.set("disc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisc: Self = this.set("disc", js.undefined)
    @scala.inline
    def setDuration(value: integer): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setGenre(value: String): Self = this.set("genre", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenre: Self = this.set("genre", js.undefined)
    @scala.inline
    def setHeight(value: integer): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setRotation(value: integer): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTrack(value: integer): Self = this.set("track", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrack: Self = this.set("track", js.undefined)
    @scala.inline
    def setWidth(value: integer): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

