package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MediaRecorderOptions extends js.Object {
  /** The chosen bitrate for the audio component of the media. */
  var audioBitsPerSecond: js.UndefOr[scala.Double] = js.undefined
  /** The chosen bitrate for the audio and video components of the media. This can be specified instead of the above two properties. If this is specified along with one or the other of the above properties, this will be used for the one that isn't specified. */
  var bitsPerSecond: js.UndefOr[scala.Double] = js.undefined
  /** The mime type you want to use as the recording container for the new MediaRecorder */
  var mimeType: js.UndefOr[java.lang.String] = js.undefined
  /** The chosen bitrate for the video component of the media. */
  var videoBitsPerSecond: js.UndefOr[scala.Double] = js.undefined
}

