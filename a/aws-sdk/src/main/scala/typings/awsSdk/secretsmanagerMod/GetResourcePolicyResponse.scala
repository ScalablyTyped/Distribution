package typings.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResourcePolicyResponse extends StObject {
  
  /**
    * The ARN of the secret that the resource-based policy was retrieved for.
    */
  var ARN: js.UndefOr[SecretARNType] = js.native
  
  /**
    * The friendly name of the secret that the resource-based policy was retrieved for.
    */
  var Name: js.UndefOr[NameType] = js.native
  
  /**
    * A JSON-formatted string that describes the permissions that are associated with the attached secret. These permissions are combined with any permissions that are associated with the user or role that attempts to access this secret. The combined permissions specify who can access the secret and what actions they can perform. For more information, see Authentication and Access Control for AWS Secrets Manager in the AWS Secrets Manager User Guide.
    */
  var ResourcePolicy: js.UndefOr[NonEmptyResourcePolicyType] = js.native
}
object GetResourcePolicyResponse {
  
  @scala.inline
  def apply(): GetResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourcePolicyResponse]
  }
  
  @scala.inline
  implicit class GetResourcePolicyResponseMutableBuilder[Self <: GetResourcePolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARN(value: SecretARNType): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    @scala.inline
    def setName(value: NameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setResourcePolicy(value: NonEmptyResourcePolicyType): Self = StObject.set(x, "ResourcePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcePolicyUndefined: Self = StObject.set(x, "ResourcePolicy", js.undefined)
  }
}
