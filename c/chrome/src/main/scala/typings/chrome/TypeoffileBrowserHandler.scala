package typings.chrome

import typings.chrome.chromeNs.fileBrowserHandlerNs.FileBrowserHandlerExecuteEvent
import typings.chrome.chromeNs.fileBrowserHandlerNs.SelectionParams
import typings.chrome.chromeNs.fileBrowserHandlerNs.SelectionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeoffileBrowserHandler extends js.Object {
  var onExecute: FileBrowserHandlerExecuteEvent
  def selectFile(selectionParams: SelectionParams, callback: js.Function1[/* result */ SelectionResult, Unit]): Unit
}

object TypeoffileBrowserHandler {
  @scala.inline
  def apply(
    onExecute: FileBrowserHandlerExecuteEvent,
    selectFile: (SelectionParams, js.Function1[/* result */ SelectionResult, Unit]) => Unit
  ): TypeoffileBrowserHandler = {
    val __obj = js.Dynamic.literal(onExecute = onExecute, selectFile = js.Any.fromFunction2(selectFile))
  
    __obj.asInstanceOf[TypeoffileBrowserHandler]
  }
}

