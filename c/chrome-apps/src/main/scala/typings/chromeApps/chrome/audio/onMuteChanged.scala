package typings.chromeApps.chrome.audio

import org.scalablytyped.runtime.TopLevel
import typings.chromeApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the mute state of the audio input or output changes.
  * Note that mute state is system-wide and the new value applies to
  * every audio device with specified stream type.
  */
@JSGlobal("chrome.audio.onMuteChanged")
@js.native
object onMuteChanged
  extends TopLevel[
      Event[js.Function2[/* streamType */ js.Array[StreamType], /* isMuted */ Boolean, Unit]]
    ]

