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

