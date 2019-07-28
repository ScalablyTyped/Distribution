package typings.chromeDashApps.chromeNs.audioNs

import typings.chromeDashApps.chromeNs.integer
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
  def apply(level: js.UndefOr[integer] = js.undefined): SetDeviceProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level)
    __obj.asInstanceOf[SetDeviceProperties]
  }
}

