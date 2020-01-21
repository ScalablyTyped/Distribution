package typings.chromeApps.chrome.audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.audio.setProperties")
@js.native
object setProperties extends js.Object {
  /** Sets the properties for the input or output device. */
  def apply(id: String, properties: SetDeviceProperties, callback: js.Function0[Unit]): Unit = js.native
}

