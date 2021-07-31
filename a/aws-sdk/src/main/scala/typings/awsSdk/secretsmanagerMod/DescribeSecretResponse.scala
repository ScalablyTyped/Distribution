package typings.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSecretResponse extends StObject {
  
  /**
    * The ARN of the secret.
    */
  var ARN: js.UndefOr[SecretARNType] = js.undefined
  
  /**
    * The date that the secret was created.
    */
  var CreatedDate: js.UndefOr[TimestampType] = js.undefined
  
  /**
    * This value exists if the secret is scheduled for deletion. Some time after the specified date and time, Secrets Manager deletes the secret and all of its versions. If a secret is scheduled for deletion, then its details, including the encrypted secret information, is not accessible. To cancel a scheduled deletion and restore access, use RestoreSecret.
    */
  var DeletedDate: js.UndefOr[DeletedDateType] = js.undefined
  
  /**
    * The user-provided description of the secret.
    */
  var Description: js.UndefOr[DescriptionType] = js.undefined
  
  /**
    * The ARN or alias of the AWS KMS customer master key (CMK) that's used to encrypt the SecretString or SecretBinary fields in each version of the secret. If you don't provide a key, then Secrets Manager defaults to encrypting the secret fields with the default AWS KMS CMK (the one named awssecretsmanager) for this account.
    */
  var KmsKeyId: js.UndefOr[KmsKeyIdType] = js.undefined
  
  /**
    * The last date that this secret was accessed. This value is truncated to midnight of the date and therefore shows only the date, not the time.
    */
  var LastAccessedDate: js.UndefOr[LastAccessedDateType] = js.undefined
  
  /**
    * The last date and time that this secret was modified in any way.
    */
  var LastChangedDate: js.UndefOr[LastChangedDateType] = js.undefined
  
  /**
    * The most recent date and time that the Secrets Manager rotation process was successfully completed. This value is null if the secret has never rotated.
    */
  var LastRotatedDate: js.UndefOr[LastRotatedDateType] = js.undefined
  
  /**
    * The user-provided friendly name of the secret.
    */
  var Name: js.UndefOr[SecretNameType] = js.undefined
  
  /**
    * Returns the name of the service that created this secret.
    */
  var OwningService: js.UndefOr[OwningServiceType] = js.undefined
  
  /**
    * Specifies whether automatic rotation is enabled for this secret. To enable rotation, use RotateSecret with AutomaticallyRotateAfterDays set to a value greater than 0. To disable rotation, use CancelRotateSecret.
    */
  var RotationEnabled: js.UndefOr[RotationEnabledType] = js.undefined
  
  /**
    * The ARN of a Lambda function that's invoked by Secrets Manager to rotate the secret either automatically per the schedule or manually by a call to RotateSecret.
    */
  var RotationLambdaARN: js.UndefOr[RotationLambdaARNType] = js.undefined
  
  /**
    * A structure that contains the rotation configuration for this secret.
    */
  var RotationRules: js.UndefOr[RotationRulesType] = js.undefined
  
  /**
    * The list of user-defined tags that are associated with the secret. To add tags to a secret, use TagResource. To remove tags, use UntagResource.
    */
  var Tags: js.UndefOr[TagListType] = js.undefined
  
  /**
    * A list of all of the currently assigned VersionStage staging labels and the VersionId that each is attached to. Staging labels are used to keep track of the different versions during the rotation process.  A version that does not have any staging labels attached is considered deprecated and subject to deletion. Such versions are not included in this list. 
    */
  var VersionIdsToStages: js.UndefOr[SecretVersionsToStagesMapType] = js.undefined
}
object DescribeSecretResponse {
  
  @scala.inline
  def apply(): DescribeSecretResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSecretResponse]
  }
  
  @scala.inline
  implicit class DescribeSecretResponseMutableBuilder[Self <: DescribeSecretResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARN(value: SecretARNType): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: TimestampType): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    @scala.inline
    def setDeletedDate(value: DeletedDateType): Self = StObject.set(x, "DeletedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedDateUndefined: Self = StObject.set(x, "DeletedDate", js.undefined)
    
    @scala.inline
    def setDescription(value: DescriptionType): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: KmsKeyIdType): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setLastAccessedDate(value: LastAccessedDateType): Self = StObject.set(x, "LastAccessedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAccessedDateUndefined: Self = StObject.set(x, "LastAccessedDate", js.undefined)
    
    @scala.inline
    def setLastChangedDate(value: LastChangedDateType): Self = StObject.set(x, "LastChangedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastChangedDateUndefined: Self = StObject.set(x, "LastChangedDate", js.undefined)
    
    @scala.inline
    def setLastRotatedDate(value: LastRotatedDateType): Self = StObject.set(x, "LastRotatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRotatedDateUndefined: Self = StObject.set(x, "LastRotatedDate", js.undefined)
    
    @scala.inline
    def setName(value: SecretNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOwningService(value: OwningServiceType): Self = StObject.set(x, "OwningService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwningServiceUndefined: Self = StObject.set(x, "OwningService", js.undefined)
    
    @scala.inline
    def setRotationEnabled(value: RotationEnabledType): Self = StObject.set(x, "RotationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationEnabledUndefined: Self = StObject.set(x, "RotationEnabled", js.undefined)
    
    @scala.inline
    def setRotationLambdaARN(value: RotationLambdaARNType): Self = StObject.set(x, "RotationLambdaARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationLambdaARNUndefined: Self = StObject.set(x, "RotationLambdaARN", js.undefined)
    
    @scala.inline
    def setRotationRules(value: RotationRulesType): Self = StObject.set(x, "RotationRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationRulesUndefined: Self = StObject.set(x, "RotationRules", js.undefined)
    
    @scala.inline
    def setTags(value: TagListType): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setVersionIdsToStages(value: SecretVersionsToStagesMapType): Self = StObject.set(x, "VersionIdsToStages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdsToStagesUndefined: Self = StObject.set(x, "VersionIdsToStages", js.undefined)
  }
}
