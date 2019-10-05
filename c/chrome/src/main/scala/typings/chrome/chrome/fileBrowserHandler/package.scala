package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fileBrowserHandler {
  import typings.chrome.chrome.events.Event

  type FileBrowserHandlerExecuteEvent = Event[
    js.Function2[/* id */ String, /* details */ FileHandlerExecuteEventDetails, Unit]
  ]
}
