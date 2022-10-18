package typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CommandRunAfterTestRunHooks. */
trait ICommandRunAfterTestRunHooks extends StObject {
  
  /** CommandRunAfterTestRunHooks actionId */
  var actionId: js.UndefOr[String | Null] = js.undefined
}
object ICommandRunAfterTestRunHooks {
  
  inline def apply(): ICommandRunAfterTestRunHooks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICommandRunAfterTestRunHooks]
  }
  
  extension [Self <: ICommandRunAfterTestRunHooks](x: Self) {
    
    inline def setActionId(value: String): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    inline def setActionIdNull: Self = StObject.set(x, "actionId", null)
    
    inline def setActionIdUndefined: Self = StObject.set(x, "actionId", js.undefined)
  }
}
