package typings.chromeDashApps.chrome.fileSystem

import org.scalablytyped.runtime.TopLevel
import typings.chromeDashApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Called when a list of available volumes is changed.
  * @since Chrome 44.
  */
@JSGlobal("chrome.fileSystem.onVolumeListChanged")
@js.native
object onVolumeListChanged
  extends TopLevel[Event[js.Function1[/* object */ js.Array[Volume], Unit]]]

