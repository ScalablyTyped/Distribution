package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CommandRunBeforeTestRunHooks. */
trait ICommandRunBeforeTestRunHooks extends StObject {
  
  /** CommandRunBeforeTestRunHooks actionId */
  var actionId: js.UndefOr[String | Null] = js.undefined
}
object ICommandRunBeforeTestRunHooks {
  
  @scala.inline
  def apply(): ICommandRunBeforeTestRunHooks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICommandRunBeforeTestRunHooks]
  }
  
  @scala.inline
  implicit class ICommandRunBeforeTestRunHooksMutableBuilder[Self <: ICommandRunBeforeTestRunHooks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionId(value: String): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionIdNull: Self = StObject.set(x, "actionId", null)
    
    @scala.inline
    def setActionIdUndefined: Self = StObject.set(x, "actionId", js.undefined)
  }
}
