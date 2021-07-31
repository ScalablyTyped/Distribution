package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWebACLRequest extends StObject {
  
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.wafregionalMod.ChangeToken
  
  /**
    * A default action for the web ACL, either ALLOW or BLOCK. AWS WAF performs the default action if a request doesn't match the criteria in any of the rules in a web ACL.
    */
  var DefaultAction: js.UndefOr[WafAction] = js.undefined
  
  /**
    * An array of updates to make to the WebACL. An array of WebACLUpdate objects that you want to insert into or delete from a WebACL. For more information, see the applicable data types:    WebACLUpdate: Contains Action and ActivatedRule     ActivatedRule: Contains Action, OverrideAction, Priority, RuleId, and Type. ActivatedRule|OverrideAction applies only when updating or adding a RuleGroup to a WebACL. In this case, you do not use ActivatedRule|Action. For all other update requests, ActivatedRule|Action is used instead of ActivatedRule|OverrideAction.     WafAction: Contains Type   
    */
  var Updates: js.UndefOr[WebACLUpdates] = js.undefined
  
  /**
    * The WebACLId of the WebACL that you want to update. WebACLId is returned by CreateWebACL and by ListWebACLs.
    */
  var WebACLId: ResourceId
}
object UpdateWebACLRequest {
  
  @scala.inline
  def apply(ChangeToken: ChangeToken, WebACLId: ResourceId): UpdateWebACLRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], WebACLId = WebACLId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWebACLRequest]
  }
  
  @scala.inline
  implicit class UpdateWebACLRequestMutableBuilder[Self <: UpdateWebACLRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultAction(value: WafAction): Self = StObject.set(x, "DefaultAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultActionUndefined: Self = StObject.set(x, "DefaultAction", js.undefined)
    
    @scala.inline
    def setUpdates(value: WebACLUpdates): Self = StObject.set(x, "Updates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatesUndefined: Self = StObject.set(x, "Updates", js.undefined)
    
    @scala.inline
    def setUpdatesVarargs(value: WebACLUpdate*): Self = StObject.set(x, "Updates", js.Array(value :_*))
    
    @scala.inline
    def setWebACLId(value: ResourceId): Self = StObject.set(x, "WebACLId", value.asInstanceOf[js.Any])
  }
}
