package typings.chromeDashApps.chrome.audio

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetDeviceProperties extends js.Object {
  /**
    * The audio device's desired sound level. Defaults to the device's current sound level.
    * If used with audio input device, represents audio device gain.
    * If used with audio output device, represents audio device volume.
    */
  var level: js.UndefOr[integer] = js.undefined
}

object SetDeviceProperties {
  @scala.inline
  def apply(level: Int | Double = null): SetDeviceProperties = {
    val __obj = js.Dynamic.literal()
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDeviceProperties]
  }
}

