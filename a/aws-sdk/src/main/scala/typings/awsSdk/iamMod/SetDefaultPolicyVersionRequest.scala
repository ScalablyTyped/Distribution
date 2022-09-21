package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetDefaultPolicyVersionRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IAM policy whose default version you want to set. For more information about ARNs, see Amazon Resource Names (ARNs) in the Amazon Web Services General Reference.
    */
  var PolicyArn: arnType
  
  /**
    * The version of the policy to set as the default (operative) version. For more information about managed policy versions, see Versioning for managed policies in the IAM User Guide.
    */
  var VersionId: policyVersionIdType
}
object SetDefaultPolicyVersionRequest {
  
  inline def apply(PolicyArn: arnType, VersionId: policyVersionIdType): SetDefaultPolicyVersionRequest = {
    val __obj = js.Dynamic.literal(PolicyArn = PolicyArn.asInstanceOf[js.Any], VersionId = VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDefaultPolicyVersionRequest]
  }
  
  extension [Self <: SetDefaultPolicyVersionRequest](x: Self) {
    
    inline def setPolicyArn(value: arnType): Self = StObject.set(x, "PolicyArn", value.asInstanceOf[js.Any])
    
    inline def setVersionId(value: policyVersionIdType): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
  }
}
