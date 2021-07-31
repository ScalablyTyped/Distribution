package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsSecretsManagerSecretDetails extends StObject {
  
  /**
    * Whether the secret is deleted.
    */
  var Deleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The user-provided description of the secret.
    */
  var Description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ARN, Key ID, or alias of the AWS KMS customer master key (CMK) used to encrypt the SecretString or SecretBinary values for versions of this secret.
    */
  var KmsKeyId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the secret.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether rotation is enabled.
    */
  var RotationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ARN of the Lambda function that rotates the secret.
    */
  var RotationLambdaArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether the rotation occurred within the specified rotation frequency.
    */
  var RotationOccurredWithinFrequency: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines the rotation schedule for the secret.
    */
  var RotationRules: js.UndefOr[AwsSecretsManagerSecretRotationRules] = js.undefined
}
object AwsSecretsManagerSecretDetails {
  
  @scala.inline
  def apply(): AwsSecretsManagerSecretDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsSecretsManagerSecretDetails]
  }
  
  @scala.inline
  implicit class AwsSecretsManagerSecretDetailsMutableBuilder[Self <: AwsSecretsManagerSecretDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "Deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "Deleted", js.undefined)
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: NonEmptyString): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setRotationEnabled(value: Boolean): Self = StObject.set(x, "RotationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationEnabledUndefined: Self = StObject.set(x, "RotationEnabled", js.undefined)
    
    @scala.inline
    def setRotationLambdaArn(value: NonEmptyString): Self = StObject.set(x, "RotationLambdaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationLambdaArnUndefined: Self = StObject.set(x, "RotationLambdaArn", js.undefined)
    
    @scala.inline
    def setRotationOccurredWithinFrequency(value: Boolean): Self = StObject.set(x, "RotationOccurredWithinFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationOccurredWithinFrequencyUndefined: Self = StObject.set(x, "RotationOccurredWithinFrequency", js.undefined)
    
    @scala.inline
    def setRotationRules(value: AwsSecretsManagerSecretRotationRules): Self = StObject.set(x, "RotationRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationRulesUndefined: Self = StObject.set(x, "RotationRules", js.undefined)
  }
}
