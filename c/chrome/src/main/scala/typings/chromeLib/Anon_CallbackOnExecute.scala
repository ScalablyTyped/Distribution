package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackOnExecute extends js.Object {
  var onExecute: chromeLib.chromeNs.fileBrowserHandlerNs.FileBrowserHandlerExecuteEvent
  def selectFile(
    selectionParams: chromeLib.chromeNs.fileBrowserHandlerNs.SelectionParams,
    callback: js.Function1[/* result */ chromeLib.chromeNs.fileBrowserHandlerNs.SelectionResult, scala.Unit]
  ): scala.Unit
}

object Anon_CallbackOnExecute {
  @scala.inline
  def apply(
    onExecute: chromeLib.chromeNs.fileBrowserHandlerNs.FileBrowserHandlerExecuteEvent,
    selectFile: js.Function2[
      chromeLib.chromeNs.fileBrowserHandlerNs.SelectionParams, 
      js.Function1[/* result */ chromeLib.chromeNs.fileBrowserHandlerNs.SelectionResult, scala.Unit], 
      scala.Unit
    ]
  ): Anon_CallbackOnExecute = {
    val __obj = js.Dynamic.literal(onExecute = onExecute, selectFile = selectFile)
  
    __obj.asInstanceOf[Anon_CallbackOnExecute]
  }
}

