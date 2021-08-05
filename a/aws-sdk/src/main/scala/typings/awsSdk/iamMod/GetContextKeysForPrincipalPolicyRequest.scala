package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContextKeysForPrincipalPolicyRequest extends StObject {
  
  /**
    * An optional list of additional policies for which you want the list of context keys that are referenced. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
    */
  var PolicyInputList: js.UndefOr[SimulationPolicyListType] = js.undefined
  
  /**
    * The ARN of a user, group, or role whose policies contain the context keys that you want listed. If you specify a user, the list includes context keys that are found in all policies that are attached to the user. The list also includes all groups that the user is a member of. If you pick a group or a role, then it includes only those context keys that are found in policies attached to that entity. Note that all parameters are shown in unencoded form here for clarity, but must be URL encoded to be included as a part of a real HTML request. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var PolicySourceArn: arnType
}
object GetContextKeysForPrincipalPolicyRequest {
  
  inline def apply(PolicySourceArn: arnType): GetContextKeysForPrincipalPolicyRequest = {
    val __obj = js.Dynamic.literal(PolicySourceArn = PolicySourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContextKeysForPrincipalPolicyRequest]
  }
  
  extension [Self <: GetContextKeysForPrincipalPolicyRequest](x: Self) {
    
    inline def setPolicyInputList(value: SimulationPolicyListType): Self = StObject.set(x, "PolicyInputList", value.asInstanceOf[js.Any])
    
    inline def setPolicyInputListUndefined: Self = StObject.set(x, "PolicyInputList", js.undefined)
    
    inline def setPolicyInputListVarargs(value: policyDocumentType*): Self = StObject.set(x, "PolicyInputList", js.Array(value :_*))
    
    inline def setPolicySourceArn(value: arnType): Self = StObject.set(x, "PolicySourceArn", value.asInstanceOf[js.Any])
  }
}
