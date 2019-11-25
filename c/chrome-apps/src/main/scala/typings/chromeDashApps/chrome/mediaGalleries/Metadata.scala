package typings.chromeDashApps.chrome.mediaGalleries

import typings.chromeDashApps.chrome.integer
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  /** Defined for audio and video only. */
  var album: js.UndefOr[String] = js.undefined
  var artist: js.UndefOr[String] = js.undefined
  /**
    * The images embedded in the media file's metadata.
    * This is most often used for album art or video thumbnails.
    */
  var attachedImages: js.Array[Blob]
  var comment: js.UndefOr[String] = js.undefined
  var copyright: js.UndefOr[String] = js.undefined
  var disc: js.UndefOr[integer] = js.undefined
  /** Defined for audio and video. In seconds. */
  var duration: js.UndefOr[integer] = js.undefined
  var genre: js.UndefOr[String] = js.undefined
  /** Defined for images and video. In pixels. */
  var height: js.UndefOr[integer] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  /** The browser sniffed mime type. */
  var mimeType: String
  /**
    * All the metadata in the media file.
    * For formats with multiple streams, stream order will be preserved.
    * Container metadata is the first element.
    */
  var rawTags: js.Array[RawTag]
  /** Defined for images and video. In degrees. */
  var rotation: js.UndefOr[integer] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var track: js.UndefOr[integer] = js.undefined
  var width: js.UndefOr[integer] = js.undefined
}

object Metadata {
  @scala.inline
  def apply(
    attachedImages: js.Array[Blob],
    mimeType: String,
    rawTags: js.Array[RawTag],
    album: String = null,
    artist: String = null,
    comment: String = null,
    copyright: String = null,
    disc: Int | Double = null,
    duration: Int | Double = null,
    genre: String = null,
    height: Int | Double = null,
    language: String = null,
    rotation: Int | Double = null,
    title: String = null,
    track: Int | Double = null,
    width: Int | Double = null
  ): Metadata = {
    val __obj = js.Dynamic.literal(attachedImages = attachedImages.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], rawTags = rawTags.asInstanceOf[js.Any])
    if (album != null) __obj.updateDynamic("album")(album.asInstanceOf[js.Any])
    if (artist != null) __obj.updateDynamic("artist")(artist.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (disc != null) __obj.updateDynamic("disc")(disc.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (genre != null) __obj.updateDynamic("genre")(genre.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (track != null) __obj.updateDynamic("track")(track.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
}

