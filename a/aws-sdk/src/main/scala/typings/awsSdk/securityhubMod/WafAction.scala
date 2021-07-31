package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WafAction extends StObject {
  
  /**
    * Specifies how you want AWS WAF to respond to requests that match the settings in a rule. Valid settings include the following:    ALLOW - AWS WAF allows requests    BLOCK - AWS WAF blocks requests    COUNT - AWS WAF increments a counter of the requests that match all of the conditions in the rule. AWS WAF then continues to inspect the web request based on the remaining rules in the web ACL. You can't specify COUNT for the default action for a WebACL.  
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
}
object WafAction {
  
  @scala.inline
  def apply(): WafAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WafAction]
  }
  
  @scala.inline
  implicit class WafActionMutableBuilder[Self <: WafAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
