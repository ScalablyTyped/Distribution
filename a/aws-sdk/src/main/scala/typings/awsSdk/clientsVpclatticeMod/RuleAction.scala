package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleAction extends StObject {
  
  /**
    *  Describes the rule action that returns a custom HTTP response. 
    */
  var fixedResponse: js.UndefOr[FixedResponseAction] = js.undefined
  
  /**
    * The forward action. Traffic that matches the rule is forwarded to the specified target groups.
    */
  var forward: js.UndefOr[ForwardAction] = js.undefined
}
object RuleAction {
  
  inline def apply(): RuleAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleAction] (val x: Self) extends AnyVal {
    
    inline def setFixedResponse(value: FixedResponseAction): Self = StObject.set(x, "fixedResponse", value.asInstanceOf[js.Any])
    
    inline def setFixedResponseUndefined: Self = StObject.set(x, "fixedResponse", js.undefined)
    
    inline def setForward(value: ForwardAction): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
    
    inline def setForwardUndefined: Self = StObject.set(x, "forward", js.undefined)
  }
}
