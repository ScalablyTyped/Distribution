package typings.chromeApps.chrome.audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.audio.setDevices")
@js.native
object setDevices extends js.Object {
  /** Sets lists of active input and/or output devices. */
  def apply(ids: js.Array[DeviceIdLists | String], callback: js.Function0[Unit]): Unit = js.native
}

