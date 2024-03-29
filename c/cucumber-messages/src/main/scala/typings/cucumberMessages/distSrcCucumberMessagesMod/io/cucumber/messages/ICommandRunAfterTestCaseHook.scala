package typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CommandRunAfterTestCaseHook. */
trait ICommandRunAfterTestCaseHook extends StObject {
  
  /** CommandRunAfterTestCaseHook actionId */
  var actionId: js.UndefOr[String | Null] = js.undefined
  
  /** CommandRunAfterTestCaseHook hookId */
  var hookId: js.UndefOr[String | Null] = js.undefined
  
  /** CommandRunAfterTestCaseHook testCaseId */
  var testCaseId: js.UndefOr[String | Null] = js.undefined
}
object ICommandRunAfterTestCaseHook {
  
  inline def apply(): ICommandRunAfterTestCaseHook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICommandRunAfterTestCaseHook]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICommandRunAfterTestCaseHook] (val x: Self) extends AnyVal {
    
    inline def setActionId(value: String): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    inline def setActionIdNull: Self = StObject.set(x, "actionId", null)
    
    inline def setActionIdUndefined: Self = StObject.set(x, "actionId", js.undefined)
    
    inline def setHookId(value: String): Self = StObject.set(x, "hookId", value.asInstanceOf[js.Any])
    
    inline def setHookIdNull: Self = StObject.set(x, "hookId", null)
    
    inline def setHookIdUndefined: Self = StObject.set(x, "hookId", js.undefined)
    
    inline def setTestCaseId(value: String): Self = StObject.set(x, "testCaseId", value.asInstanceOf[js.Any])
    
    inline def setTestCaseIdNull: Self = StObject.set(x, "testCaseId", null)
    
    inline def setTestCaseIdUndefined: Self = StObject.set(x, "testCaseId", js.undefined)
  }
}
