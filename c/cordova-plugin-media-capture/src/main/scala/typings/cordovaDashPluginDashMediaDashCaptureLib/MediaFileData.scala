package typings
package cordovaDashPluginDashMediaDashCaptureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates format information about a media file. */

trait MediaFileData extends js.Object {
  /** The average bitrate of the content. The value is zero for images. */
  var bitrate: scala.Double
  /** The actual format of the audio and video content. */
  var codecs: java.lang.String
  /** The length of the video or sound clip in seconds. The value is zero for images. */
  var duration: scala.Double
  /** The height of the image or video in pixels. The value is zero for audio clips. */
  var height: scala.Double
  /** The width of the image or video in pixels. The value is zero for audio clips. */
  var width: scala.Double
}

