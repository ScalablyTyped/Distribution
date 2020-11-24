package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CommandRunBeforeTestCaseHook. */
@js.native
trait ICommandRunBeforeTestCaseHook extends js.Object {
  
  /** CommandRunBeforeTestCaseHook actionId */
  var actionId: js.UndefOr[String | Null] = js.native
  
  /** CommandRunBeforeTestCaseHook hookId */
  var hookId: js.UndefOr[String | Null] = js.native
  
  /** CommandRunBeforeTestCaseHook testCaseId */
  var testCaseId: js.UndefOr[String | Null] = js.native
}
object ICommandRunBeforeTestCaseHook {
  
  @scala.inline
  def apply(): ICommandRunBeforeTestCaseHook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICommandRunBeforeTestCaseHook]
  }
  
  @scala.inline
  implicit class ICommandRunBeforeTestCaseHookOps[Self <: ICommandRunBeforeTestCaseHook] (val x: Self) extends AnyVal {
    
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
    def setActionId(value: String): Self = this.set("actionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionId: Self = this.set("actionId", js.undefined)
    
    @scala.inline
    def setActionIdNull: Self = this.set("actionId", null)
    
    @scala.inline
    def setHookId(value: String): Self = this.set("hookId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHookId: Self = this.set("hookId", js.undefined)
    
    @scala.inline
    def setHookIdNull: Self = this.set("hookId", null)
    
    @scala.inline
    def setTestCaseId(value: String): Self = this.set("testCaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestCaseId: Self = this.set("testCaseId", js.undefined)
    
    @scala.inline
    def setTestCaseIdNull: Self = this.set("testCaseId", null)
  }
}
