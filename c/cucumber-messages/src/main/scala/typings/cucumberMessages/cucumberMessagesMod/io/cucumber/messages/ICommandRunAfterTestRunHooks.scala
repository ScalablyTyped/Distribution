package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CommandRunAfterTestRunHooks. */
@js.native
trait ICommandRunAfterTestRunHooks extends StObject {
  
  /** CommandRunAfterTestRunHooks actionId */
  var actionId: js.UndefOr[String | Null] = js.native
}
object ICommandRunAfterTestRunHooks {
  
  @scala.inline
  def apply(): ICommandRunAfterTestRunHooks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICommandRunAfterTestRunHooks]
  }
  
  @scala.inline
  implicit class ICommandRunAfterTestRunHooksMutableBuilder[Self <: ICommandRunAfterTestRunHooks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionId(value: String): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionIdNull: Self = StObject.set(x, "actionId", null)
    
    @scala.inline
    def setActionIdUndefined: Self = StObject.set(x, "actionId", js.undefined)
  }
}
