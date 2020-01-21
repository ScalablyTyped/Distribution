package typings.chromeApps.chrome.audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.audio.getDevices")
@js.native
object getDevices extends js.Object {
  def apply(callback: js.Function1[/* devices */ js.Array[AudioDeviceInfo], Unit]): Unit = js.native
  /**
    * Gets a list of audio devices filtered based on |filter|.
    */
  def apply(filter: Filter, callback: js.Function1[/* devices */ js.Array[AudioDeviceInfo], Unit]): Unit = js.native
}

