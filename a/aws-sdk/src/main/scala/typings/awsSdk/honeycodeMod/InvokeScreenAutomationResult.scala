package typings.awsSdk.honeycodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvokeScreenAutomationResult extends js.Object {
  /**
    * The updated workbook cursor after performing the automation action.
    */
  var workbookCursor: WorkbookCursor = js.native
}

object InvokeScreenAutomationResult {
  @scala.inline
  def apply(workbookCursor: WorkbookCursor): InvokeScreenAutomationResult = {
    val __obj = js.Dynamic.literal(workbookCursor = workbookCursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeScreenAutomationResult]
  }
}

