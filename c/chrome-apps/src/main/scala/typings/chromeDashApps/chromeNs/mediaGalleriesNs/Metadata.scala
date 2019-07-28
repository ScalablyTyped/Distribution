package typings.chromeDashApps.chromeNs.mediaGalleriesNs

import typings.chromeDashApps.chromeNs.integer
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
    disc: js.UndefOr[integer] = js.undefined,
    duration: js.UndefOr[integer] = js.undefined,
    genre: String = null,
    height: js.UndefOr[integer] = js.undefined,
    language: String = null,
    rotation: js.UndefOr[integer] = js.undefined,
    title: String = null,
    track: js.UndefOr[integer] = js.undefined,
    width: js.UndefOr[integer] = js.undefined
  ): Metadata = {
    val __obj = js.Dynamic.literal(attachedImages = attachedImages, mimeType = mimeType, rawTags = rawTags)
    if (album != null) __obj.updateDynamic("album")(album)
    if (artist != null) __obj.updateDynamic("artist")(artist)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (!js.isUndefined(disc)) __obj.updateDynamic("disc")(disc)
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration)
    if (genre != null) __obj.updateDynamic("genre")(genre)
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height)
    if (language != null) __obj.updateDynamic("language")(language)
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(track)) __obj.updateDynamic("track")(track)
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Metadata]
  }
}

