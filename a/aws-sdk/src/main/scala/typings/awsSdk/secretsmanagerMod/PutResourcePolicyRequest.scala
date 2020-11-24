package typings.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutResourcePolicyRequest extends js.Object {
  
  /**
    * Makes an optional API call to Zelkova to validate the Resource Policy to prevent broad access to your secret.
    */
  var BlockPublicPolicy: js.UndefOr[BooleanType] = js.native
  
  /**
    * A JSON-formatted string that's constructed according to the grammar and syntax for an AWS resource-based policy. The policy in the string identifies who can access or manage this secret and its versions. For information on how to format a JSON parameter for the various command line tool environments, see Using JSON for Parameters in the AWS CLI User Guide.
    */
  var ResourcePolicy: NonEmptyResourcePolicyType = js.native
  
  /**
    * Specifies the secret that you want to attach the resource-based policy to. You can specify either the ARN or the friendly name of the secret.  If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters. If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you must not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a ResourceNotFoundException or an AccessDeniedException error, depending on your permissions. 
    */
  var SecretId: SecretIdType = js.native
}
object PutResourcePolicyRequest {
  
  @scala.inline
  def apply(ResourcePolicy: NonEmptyResourcePolicyType, SecretId: SecretIdType): PutResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(ResourcePolicy = ResourcePolicy.asInstanceOf[js.Any], SecretId = SecretId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourcePolicyRequest]
  }
  
  @scala.inline
  implicit class PutResourcePolicyRequestOps[Self <: PutResourcePolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResourcePolicy(value: NonEmptyResourcePolicyType): Self = this.set("ResourcePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretId(value: SecretIdType): Self = this.set("SecretId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockPublicPolicy(value: BooleanType): Self = this.set("BlockPublicPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockPublicPolicy: Self = this.set("BlockPublicPolicy", js.undefined)
  }
}
