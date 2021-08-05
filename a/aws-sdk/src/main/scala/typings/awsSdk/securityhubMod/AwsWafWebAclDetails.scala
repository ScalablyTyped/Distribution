package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsWafWebAclDetails extends StObject {
  
  /**
    * The action to perform if none of the rules contained in the WebACL match.
    */
  var DefaultAction: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A friendly name or description of the WebACL. You can't change the name of a WebACL after you create it.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * An array that contains the action for each rule in a WebACL, the priority of the rule, and the ID of the rule.
    */
  var Rules: js.UndefOr[AwsWafWebAclRuleList] = js.undefined
  
  /**
    * A unique identifier for a WebACL.
    */
  var WebAclId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsWafWebAclDetails {
  
  inline def apply(): AwsWafWebAclDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsWafWebAclDetails]
  }
  
  extension [Self <: AwsWafWebAclDetails](x: Self) {
    
    inline def setDefaultAction(value: NonEmptyString): Self = StObject.set(x, "DefaultAction", value.asInstanceOf[js.Any])
    
    inline def setDefaultActionUndefined: Self = StObject.set(x, "DefaultAction", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRules(value: AwsWafWebAclRuleList): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    inline def setRulesVarargs(value: AwsWafWebAclRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
    
    inline def setWebAclId(value: NonEmptyString): Self = StObject.set(x, "WebAclId", value.asInstanceOf[js.Any])
    
    inline def setWebAclIdUndefined: Self = StObject.set(x, "WebAclId", js.undefined)
  }
}
