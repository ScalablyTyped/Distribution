package typings.chromeDashApps.chrome.fileSystem

import org.scalablytyped.runtime.TopLevel
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
  extends TopLevel[
      typings.chromeDashApps.chrome.events.Event[js.Function1[/* object */ js.Array[Volume], Unit]]
    ]

