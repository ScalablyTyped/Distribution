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

