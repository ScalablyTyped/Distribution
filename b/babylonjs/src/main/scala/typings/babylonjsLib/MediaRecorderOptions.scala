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

object MediaRecorderOptions {
  @scala.inline
  def apply(
    audioBitsPerSecond: scala.Int | scala.Double = null,
    bitsPerSecond: scala.Int | scala.Double = null,
    mimeType: java.lang.String = null,
    videoBitsPerSecond: scala.Int | scala.Double = null
  ): MediaRecorderOptions = {
    val __obj = js.Dynamic.literal()
    if (audioBitsPerSecond != null) __obj.updateDynamic("audioBitsPerSecond")(audioBitsPerSecond.asInstanceOf[js.Any])
    if (bitsPerSecond != null) __obj.updateDynamic("bitsPerSecond")(bitsPerSecond.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (videoBitsPerSecond != null) __obj.updateDynamic("videoBitsPerSecond")(videoBitsPerSecond.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRecorderOptions]
  }
}

