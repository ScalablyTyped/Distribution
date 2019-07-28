package typings.chrome.chromeNs

import typings.chrome.chromeNs.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fileBrowserHandlerNs {
  type FileBrowserHandlerExecuteEvent = Event[
    js.Function2[/* id */ String, /* details */ FileHandlerExecuteEventDetails, Unit]
  ]
}
