package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsSecretsManagerSecretDetails extends js.Object {
  
  /**
    * Whether the secret is deleted.
    */
  var Deleted: js.UndefOr[Boolean] = js.native
  
  /**
    * The user-provided description of the secret.
    */
  var Description: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The ARN, Key ID, or alias of the AWS KMS customer master key (CMK) used to encrypt the SecretString or SecretBinary values for versions of this secret.
    */
  var KmsKeyId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the secret.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Whether rotation is enabled.
    */
  var RotationEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The ARN of the Lambda function that rotates the secret.
    */
  var RotationLambdaArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Whether the rotation occurred within the specified rotation frequency.
    */
  var RotationOccurredWithinFrequency: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines the rotation schedule for the secret.
    */
  var RotationRules: js.UndefOr[AwsSecretsManagerSecretRotationRules] = js.native
}
object AwsSecretsManagerSecretDetails {
  
  @scala.inline
  def apply(): AwsSecretsManagerSecretDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsSecretsManagerSecretDetails]
  }
  
  @scala.inline
  implicit class AwsSecretsManagerSecretDetailsOps[Self <: AwsSecretsManagerSecretDetails] (val x: Self) extends AnyVal {
    
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
    def setDeleted(value: Boolean): Self = this.set("Deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleted: Self = this.set("Deleted", js.undefined)
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: NonEmptyString): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setRotationEnabled(value: Boolean): Self = this.set("RotationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotationEnabled: Self = this.set("RotationEnabled", js.undefined)
    
    @scala.inline
    def setRotationLambdaArn(value: NonEmptyString): Self = this.set("RotationLambdaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotationLambdaArn: Self = this.set("RotationLambdaArn", js.undefined)
    
    @scala.inline
    def setRotationOccurredWithinFrequency(value: Boolean): Self = this.set("RotationOccurredWithinFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotationOccurredWithinFrequency: Self = this.set("RotationOccurredWithinFrequency", js.undefined)
    
    @scala.inline
    def setRotationRules(value: AwsSecretsManagerSecretRotationRules): Self = this.set("RotationRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotationRules: Self = this.set("RotationRules", js.undefined)
  }
}
