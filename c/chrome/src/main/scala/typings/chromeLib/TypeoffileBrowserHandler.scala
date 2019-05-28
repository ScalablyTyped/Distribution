package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeoffileBrowserHandler extends js.Object {
  var onExecute: chromeLib.chromeNs.fileBrowserHandlerNs.FileBrowserHandlerExecuteEvent
  def selectFile(
    selectionParams: chromeLib.chromeNs.fileBrowserHandlerNs.SelectionParams,
    callback: js.Function1[/* result */ chromeLib.chromeNs.fileBrowserHandlerNs.SelectionResult, scala.Unit]
  ): scala.Unit
}

object TypeoffileBrowserHandler {
  @scala.inline
  def apply(
    onExecute: chromeLib.chromeNs.fileBrowserHandlerNs.FileBrowserHandlerExecuteEvent,
    selectFile: (chromeLib.chromeNs.fileBrowserHandlerNs.SelectionParams, js.Function1[/* result */ chromeLib.chromeNs.fileBrowserHandlerNs.SelectionResult, scala.Unit]) => scala.Unit
  ): TypeoffileBrowserHandler = {
    val __obj = js.Dynamic.literal(onExecute = onExecute, selectFile = js.Any.fromFunction2(selectFile))
  
    __obj.asInstanceOf[TypeoffileBrowserHandler]
  }
}

