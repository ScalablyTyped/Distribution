package typings.chromeApps.chrome.audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.audio.setMute")
@js.native
object setMute extends js.Object {
  /**
    * Sets mute state for a stream type. The mute state will apply to all audio devices with the specified audio stream type.
    * @param streamType Stream type for which mute state should be set.
    * @param isMuted New mute value.
    * @param [callback] If you specify the callback parameter, it should be a function that looks like this: function() {...};
    */
  def apply(streamType: StreamType, isMuted: Boolean): Unit = js.native
  def apply(streamType: StreamType, isMuted: Boolean, callback: js.Function0[Unit]): Unit = js.native
}

