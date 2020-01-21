package typings.chromeApps.chrome.audio

import org.scalablytyped.runtime.TopLevel
import typings.chromeApps.chrome.events.Event
import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when sound level changes for an active audio device. */
@JSGlobal("chrome.audio.onLevelChanged")
@js.native
object onLevelChanged
  extends TopLevel[Event[js.Function2[/* deviceId */ String, /* level */ integer, Unit]]]

