package typings.chrome.chromeNs.fileBrowserHandlerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.fileBrowserHandler")
@js.native
object ^ extends js.Object {
  var onExecute: FileBrowserHandlerExecuteEvent = js.native
  def selectFile(selectionParams: SelectionParams, callback: js.Function1[/* result */ SelectionResult, Unit]): Unit = js.native
}

