package typings
package chromeLib.chromeNs.fileBrowserHandlerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.fileBrowserHandler")
@js.native
object ^ extends js.Object {
  var onExecute: FileBrowserHandlerExecuteEvent = js.native
  def selectFile(selectionParams: SelectionParams, callback: js.Function1[/* result */ SelectionResult, scala.Unit]): scala.Unit = js.native
}

