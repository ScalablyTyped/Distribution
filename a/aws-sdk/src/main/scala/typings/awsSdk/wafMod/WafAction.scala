package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WafAction extends StObject {
  
  /**
    * Specifies how you want AWS WAF to respond to requests that match the settings in a Rule. Valid settings include the following:    ALLOW: AWS WAF allows requests    BLOCK: AWS WAF blocks requests    COUNT: AWS WAF increments a counter of the requests that match all of the conditions in the rule. AWS WAF then continues to inspect the web request based on the remaining rules in the web ACL. You can't specify COUNT for the default action for a WebACL.  
    */
  var Type: WafActionType = js.native
}
object WafAction {
  
  @scala.inline
  def apply(Type: WafActionType): WafAction = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[WafAction]
  }
  
  @scala.inline
  implicit class WafActionMutableBuilder[Self <: WafAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: WafActionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
