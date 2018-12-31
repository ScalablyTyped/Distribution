package typings
package chromeDashAppsLib.chromeNs.audioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetDeviceProperties extends js.Object {
  /**
    * The audio device's desired sound level. Defaults to the device's current sound level.
    * If used with audio input device, represents audio device gain.
    * If used with audio output device, represents audio device volume.
    */
  var level: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
}

