package typings
package chromeDashAppsLib.chromeNs.mediaGalleriesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  /** Defined for audio and video only. */
  var album: js.UndefOr[java.lang.String] = js.undefined
  var artist: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The images embedded in the media file's metadata.
    * This is most often used for album art or video thumbnails.
    */
  var attachedImages: js.Array[stdLib.Blob]
  var comment: js.UndefOr[java.lang.String] = js.undefined
  var copyright: js.UndefOr[java.lang.String] = js.undefined
  var disc: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /** Defined for audio and video. In seconds. */
  var duration: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  var genre: js.UndefOr[java.lang.String] = js.undefined
  /** Defined for images and video. In pixels. */
  var height: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  /** The browser sniffed mime type. */
  var mimeType: java.lang.String
  /**
    * All the metadata in the media file.
    * For formats with multiple streams, stream order will be preserved.
    * Container metadata is the first element.
    */
  var rawTags: js.Array[RawTag]
  /** Defined for images and video. In degrees. */
  var rotation: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var track: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  var width: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
}

object Metadata {
  @scala.inline
  def apply(
    attachedImages: js.Array[stdLib.Blob],
    mimeType: java.lang.String,
    rawTags: js.Array[RawTag],
    album: java.lang.String = null,
    artist: java.lang.String = null,
    comment: java.lang.String = null,
    copyright: java.lang.String = null,
    disc: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined,
    duration: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined,
    genre: java.lang.String = null,
    height: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined,
    language: java.lang.String = null,
    rotation: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined,
    title: java.lang.String = null,
    track: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined,
    width: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  ): Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attachedImages")(attachedImages)
    __obj.updateDynamic("mimeType")(mimeType)
    __obj.updateDynamic("rawTags")(rawTags)
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

