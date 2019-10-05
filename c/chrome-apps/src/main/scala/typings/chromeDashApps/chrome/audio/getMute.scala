package typings.chromeDashApps.chrome.audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.audio.getMute")
@js.native
object getMute extends js.Object {
  /**
    * Gets the system-wide mute state for the specified stream type.
    * @param streamType Stream type for which mute state should be fetched.
    * @param callback Callback reporting whether mute is set or not for specified stream type.
    */
  def apply(streamType: StreamType, callback: js.Function1[/* value */ Boolean, Unit]): Unit = js.native
}

