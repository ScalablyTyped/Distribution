package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebACL extends StObject {
  
  /**
    * The action to perform if none of the Rules contained in the WebACL match. The action is specified by the WafAction object.
    */
  var DefaultAction: WafAction
  
  /**
    * A friendly name or description for the metrics for this WebACL. The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128 and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF, including "All" and "Default_Action." You can't change MetricName after you create the WebACL.
    */
  var MetricName: js.UndefOr[typings.awsSdk.wafMod.MetricName] = js.undefined
  
  /**
    * A friendly name or description of the WebACL. You can't change the name of a WebACL after you create it.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * An array that contains the action for each Rule in a WebACL, the priority of the Rule, and the ID of the Rule.
    */
  var Rules: ActivatedRules
  
  /**
    * Tha Amazon Resource Name (ARN) of the web ACL.
    */
  var WebACLArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * A unique identifier for a WebACL. You use WebACLId to get information about a WebACL (see GetWebACL), update a WebACL (see UpdateWebACL), and delete a WebACL from AWS WAF (see DeleteWebACL).  WebACLId is returned by CreateWebACL and by ListWebACLs.
    */
  var WebACLId: ResourceId
}
object WebACL {
  
  inline def apply(DefaultAction: WafAction, Rules: ActivatedRules, WebACLId: ResourceId): WebACL = {
    val __obj = js.Dynamic.literal(DefaultAction = DefaultAction.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any], WebACLId = WebACLId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebACL]
  }
  
  extension [Self <: WebACL](x: Self) {
    
    inline def setDefaultAction(value: WafAction): Self = StObject.set(x, "DefaultAction", value.asInstanceOf[js.Any])
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRules(value: ActivatedRules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: ActivatedRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
    
    inline def setWebACLArn(value: ResourceArn): Self = StObject.set(x, "WebACLArn", value.asInstanceOf[js.Any])
    
    inline def setWebACLArnUndefined: Self = StObject.set(x, "WebACLArn", js.undefined)
    
    inline def setWebACLId(value: ResourceId): Self = StObject.set(x, "WebACLId", value.asInstanceOf[js.Any])
  }
}
