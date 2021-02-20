package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WafOverrideAction extends StObject {
  
  /**
    *  COUNT overrides the action specified by the individual rule within a RuleGroup . If set to NONE, the rule's action will take place.
    */
  var Type: WafOverrideActionType = js.native
}
object WafOverrideAction {
  
  @scala.inline
  def apply(Type: WafOverrideActionType): WafOverrideAction = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[WafOverrideAction]
  }
  
  @scala.inline
  implicit class WafOverrideActionMutableBuilder[Self <: WafOverrideAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: WafOverrideActionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
