package typings.chrome.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fileBrowserHandlerNs {
  import typings.chrome.chromeNs.eventsNs.Event

  type FileBrowserHandlerExecuteEvent = Event[
    js.Function2[/* id */ String, /* details */ FileHandlerExecuteEventDetails, Unit]
  ]
}
