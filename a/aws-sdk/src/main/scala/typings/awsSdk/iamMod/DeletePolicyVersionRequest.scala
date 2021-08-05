package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePolicyVersionRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IAM policy from which you want to delete a version. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var PolicyArn: arnType
  
  /**
    * The policy version to delete. This parameter allows (through its regex pattern) a string of characters that consists of the lowercase letter 'v' followed by one or two digits, and optionally followed by a period '.' and a string of letters and digits. For more information about managed policy versions, see Versioning for Managed Policies in the IAM User Guide.
    */
  var VersionId: policyVersionIdType
}
object DeletePolicyVersionRequest {
  
  inline def apply(PolicyArn: arnType, VersionId: policyVersionIdType): DeletePolicyVersionRequest = {
    val __obj = js.Dynamic.literal(PolicyArn = PolicyArn.asInstanceOf[js.Any], VersionId = VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePolicyVersionRequest]
  }
  
  extension [Self <: DeletePolicyVersionRequest](x: Self) {
    
    inline def setPolicyArn(value: arnType): Self = StObject.set(x, "PolicyArn", value.asInstanceOf[js.Any])
    
    inline def setVersionId(value: policyVersionIdType): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
  }
}
