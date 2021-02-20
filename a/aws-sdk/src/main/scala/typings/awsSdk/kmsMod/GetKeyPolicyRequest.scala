package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetKeyPolicyRequest extends StObject {
  
  /**
    * A unique identifier for the customer master key (CMK). Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
    */
  var KeyId: KeyIdType = js.native
  
  /**
    * Specifies the name of the key policy. The only valid name is default. To get the names of key policies, use ListKeyPolicies.
    */
  var PolicyName: PolicyNameType = js.native
}
object GetKeyPolicyRequest {
  
  @scala.inline
  def apply(KeyId: KeyIdType, PolicyName: PolicyNameType): GetKeyPolicyRequest = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetKeyPolicyRequest]
  }
  
  @scala.inline
  implicit class GetKeyPolicyRequestMutableBuilder[Self <: GetKeyPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyName(value: PolicyNameType): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
  }
}
