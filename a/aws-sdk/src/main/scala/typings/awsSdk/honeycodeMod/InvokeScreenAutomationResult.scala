package typings.awsSdk.honeycodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class InvokeScreenAutomationResultOps[Self <: InvokeScreenAutomationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setWorkbookCursor(value: WorkbookCursor): Self = this.set("workbookCursor", value.asInstanceOf[js.Any])
  }
}
