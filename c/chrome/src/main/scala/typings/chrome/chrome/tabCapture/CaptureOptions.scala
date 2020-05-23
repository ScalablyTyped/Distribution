package typings.chrome.chrome.tabCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptureOptions extends js.Object {
  /** Optional. */
  var audio: js.UndefOr[Boolean] = js.undefined
  /** Optional. */
  var audioConstraints: js.UndefOr[MediaStreamConstraint] = js.undefined
  /** Optional. */
  var video: js.UndefOr[Boolean] = js.undefined
  /** Optional. */
  var videoConstraints: js.UndefOr[MediaStreamConstraint] = js.undefined
}

object CaptureOptions {
  @scala.inline
  def apply(
    audio: js.UndefOr[Boolean] = js.undefined,
    audioConstraints: MediaStreamConstraint = null,
    video: js.UndefOr[Boolean] = js.undefined,
    videoConstraints: MediaStreamConstraint = null
  ): CaptureOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audio)) __obj.updateDynamic("audio")(audio.get.asInstanceOf[js.Any])
    if (audioConstraints != null) __obj.updateDynamic("audioConstraints")(audioConstraints.asInstanceOf[js.Any])
    if (!js.isUndefined(video)) __obj.updateDynamic("video")(video.get.asInstanceOf[js.Any])
    if (videoConstraints != null) __obj.updateDynamic("videoConstraints")(videoConstraints.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureOptions]
  }
}

