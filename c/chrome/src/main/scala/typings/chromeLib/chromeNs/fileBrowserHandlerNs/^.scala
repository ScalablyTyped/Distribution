package typings
package chromeLib.chromeNs.fileBrowserHandlerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.fileBrowserHandler")
@js.native
object ^ extends js.Object {
  var onExecute: chromeLib.chromeNs.fileBrowserHandlerNs.FileBrowserHandlerExecuteEvent = js.native
  def selectFile(
    selectionParams: chromeLib.chromeNs.fileBrowserHandlerNs.SelectionParams,
    callback: js.Function1[/* result */ chromeLib.chromeNs.fileBrowserHandlerNs.SelectionResult, scala.Unit]
  ): scala.Unit = js.native
}

