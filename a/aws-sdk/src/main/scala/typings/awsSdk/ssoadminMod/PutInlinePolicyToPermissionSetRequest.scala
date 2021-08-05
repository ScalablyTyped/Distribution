package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutInlinePolicyToPermissionSetRequest extends StObject {
  
  /**
    * The IAM inline policy to attach to a PermissionSet.
    */
  var InlinePolicy: PermissionSetPolicyDocument
  
  /**
    * The ARN of the SSO instance under which the operation will be executed. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var InstanceArn: typings.awsSdk.ssoadminMod.InstanceArn
  
  /**
    * The ARN of the permission set.
    */
  var PermissionSetArn: typings.awsSdk.ssoadminMod.PermissionSetArn
}
object PutInlinePolicyToPermissionSetRequest {
  
  inline def apply(
    InlinePolicy: PermissionSetPolicyDocument,
    InstanceArn: InstanceArn,
    PermissionSetArn: PermissionSetArn
  ): PutInlinePolicyToPermissionSetRequest = {
    val __obj = js.Dynamic.literal(InlinePolicy = InlinePolicy.asInstanceOf[js.Any], InstanceArn = InstanceArn.asInstanceOf[js.Any], PermissionSetArn = PermissionSetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutInlinePolicyToPermissionSetRequest]
  }
  
  extension [Self <: PutInlinePolicyToPermissionSetRequest](x: Self) {
    
    inline def setInlinePolicy(value: PermissionSetPolicyDocument): Self = StObject.set(x, "InlinePolicy", value.asInstanceOf[js.Any])
    
    inline def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "InstanceArn", value.asInstanceOf[js.Any])
    
    inline def setPermissionSetArn(value: PermissionSetArn): Self = StObject.set(x, "PermissionSetArn", value.asInstanceOf[js.Any])
  }
}
