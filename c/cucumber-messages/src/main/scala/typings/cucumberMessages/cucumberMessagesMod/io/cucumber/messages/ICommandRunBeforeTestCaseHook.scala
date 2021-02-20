package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CommandRunBeforeTestCaseHook. */
@js.native
trait ICommandRunBeforeTestCaseHook extends StObject {
  
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
  implicit class ICommandRunBeforeTestCaseHookMutableBuilder[Self <: ICommandRunBeforeTestCaseHook] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionId(value: String): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionIdNull: Self = StObject.set(x, "actionId", null)
    
    @scala.inline
    def setActionIdUndefined: Self = StObject.set(x, "actionId", js.undefined)
    
    @scala.inline
    def setHookId(value: String): Self = StObject.set(x, "hookId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHookIdNull: Self = StObject.set(x, "hookId", null)
    
    @scala.inline
    def setHookIdUndefined: Self = StObject.set(x, "hookId", js.undefined)
    
    @scala.inline
    def setTestCaseId(value: String): Self = StObject.set(x, "testCaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCaseIdNull: Self = StObject.set(x, "testCaseId", null)
    
    @scala.inline
    def setTestCaseIdUndefined: Self = StObject.set(x, "testCaseId", js.undefined)
  }
}
