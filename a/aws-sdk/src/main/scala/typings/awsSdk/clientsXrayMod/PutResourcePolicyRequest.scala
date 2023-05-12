package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResourcePolicyRequest extends StObject {
  
  /**
    * A flag to indicate whether to bypass the resource policy lockout safety check.  Setting this value to true increases the risk that the policy becomes unmanageable. Do not set this value to true indiscriminately.  Use this parameter only when you include a policy in the request and you intend to prevent the principal that is making the request from making a subsequent PutResourcePolicy request. The default value is false.
    */
  var BypassPolicyLockoutCheck: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The resource policy document, which can be up to 5kb in size.
    */
  var PolicyDocument: typings.awsSdk.clientsXrayMod.PolicyDocument
  
  /**
    * The name of the resource policy. Must be unique within a specific Amazon Web Services account.
    */
  var PolicyName: typings.awsSdk.clientsXrayMod.PolicyName
  
  /**
    * Specifies a specific policy revision, to ensure an atomic create operation. By default the resource policy is created if it does not exist, or updated with an incremented revision id. The revision id is unique to each policy in the account. If the policy revision id does not match the latest revision id, the operation will fail with an InvalidPolicyRevisionIdException exception. You can also provide a PolicyRevisionId of 0. In this case, the operation will fail with an InvalidPolicyRevisionIdException exception if a resource policy with the same name already exists. 
    */
  var PolicyRevisionId: js.UndefOr[typings.awsSdk.clientsXrayMod.PolicyRevisionId] = js.undefined
}
object PutResourcePolicyRequest {
  
  inline def apply(PolicyDocument: PolicyDocument, PolicyName: PolicyName): PutResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyDocument = PolicyDocument.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourcePolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutResourcePolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setBypassPolicyLockoutCheck(value: Boolean): Self = StObject.set(x, "BypassPolicyLockoutCheck", value.asInstanceOf[js.Any])
    
    inline def setBypassPolicyLockoutCheckUndefined: Self = StObject.set(x, "BypassPolicyLockoutCheck", js.undefined)
    
    inline def setPolicyDocument(value: PolicyDocument): Self = StObject.set(x, "PolicyDocument", value.asInstanceOf[js.Any])
    
    inline def setPolicyName(value: PolicyName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyRevisionId(value: PolicyRevisionId): Self = StObject.set(x, "PolicyRevisionId", value.asInstanceOf[js.Any])
    
    inline def setPolicyRevisionIdUndefined: Self = StObject.set(x, "PolicyRevisionId", js.undefined)
  }
}
