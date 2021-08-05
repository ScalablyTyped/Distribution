package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachGroupPolicyRequest extends StObject {
  
  /**
    * The name (friendly name, not ARN) of the group to attach the policy to. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var GroupName: groupNameType
  
  /**
    * The Amazon Resource Name (ARN) of the IAM policy you want to attach. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var PolicyArn: arnType
}
object AttachGroupPolicyRequest {
  
  inline def apply(GroupName: groupNameType, PolicyArn: arnType): AttachGroupPolicyRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any], PolicyArn = PolicyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachGroupPolicyRequest]
  }
  
  extension [Self <: AttachGroupPolicyRequest](x: Self) {
    
    inline def setGroupName(value: groupNameType): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setPolicyArn(value: arnType): Self = StObject.set(x, "PolicyArn", value.asInstanceOf[js.Any])
  }
}
