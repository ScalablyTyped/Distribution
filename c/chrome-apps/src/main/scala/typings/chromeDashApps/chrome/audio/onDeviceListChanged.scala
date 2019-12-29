package typings.chromeDashApps.chrome.audio

import org.scalablytyped.runtime.TopLevel
import typings.chromeDashApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when audio devices change, either new devices being added,
  * or existing devices being removed.
  * callback `devices` contains a list of all present audio devices after the change.
  */
@JSGlobal("chrome.audio.onDeviceListChanged")
@js.native
object onDeviceListChanged
  extends TopLevel[Event[js.Function1[/* devices */ js.Array[AudioDeviceInfo], Unit]]]

