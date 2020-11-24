package typings.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSecretResponse extends js.Object {
  
  /**
    * The ARN of the secret.
    */
  var ARN: js.UndefOr[SecretARNType] = js.native
  
  /**
    * The date that the secret was created.
    */
  var CreatedDate: js.UndefOr[TimestampType] = js.native
  
  /**
    * This value exists if the secret is scheduled for deletion. Some time after the specified date and time, Secrets Manager deletes the secret and all of its versions. If a secret is scheduled for deletion, then its details, including the encrypted secret information, is not accessible. To cancel a scheduled deletion and restore access, use RestoreSecret.
    */
  var DeletedDate: js.UndefOr[DeletedDateType] = js.native
  
  /**
    * The user-provided description of the secret.
    */
  var Description: js.UndefOr[DescriptionType] = js.native
  
  /**
    * The ARN or alias of the AWS KMS customer master key (CMK) that's used to encrypt the SecretString or SecretBinary fields in each version of the secret. If you don't provide a key, then Secrets Manager defaults to encrypting the secret fields with the default AWS KMS CMK (the one named awssecretsmanager) for this account.
    */
  var KmsKeyId: js.UndefOr[KmsKeyIdType] = js.native
  
  /**
    * The last date that this secret was accessed. This value is truncated to midnight of the date and therefore shows only the date, not the time.
    */
  var LastAccessedDate: js.UndefOr[LastAccessedDateType] = js.native
  
  /**
    * The last date and time that this secret was modified in any way.
    */
  var LastChangedDate: js.UndefOr[LastChangedDateType] = js.native
  
  /**
    * The most recent date and time that the Secrets Manager rotation process was successfully completed. This value is null if the secret has never rotated.
    */
  var LastRotatedDate: js.UndefOr[LastRotatedDateType] = js.native
  
  /**
    * The user-provided friendly name of the secret.
    */
  var Name: js.UndefOr[SecretNameType] = js.native
  
  /**
    * Returns the name of the service that created this secret.
    */
  var OwningService: js.UndefOr[OwningServiceType] = js.native
  
  /**
    * Specifies whether automatic rotation is enabled for this secret. To enable rotation, use RotateSecret with AutomaticallyRotateAfterDays set to a value greater than 0. To disable rotation, use CancelRotateSecret.
    */
  var RotationEnabled: js.UndefOr[RotationEnabledType] = js.native
  
  /**
    * The ARN of a Lambda function that's invoked by Secrets Manager to rotate the secret either automatically per the schedule or manually by a call to RotateSecret.
    */
  var RotationLambdaARN: js.UndefOr[RotationLambdaARNType] = js.native
  
  /**
    * A structure that contains the rotation configuration for this secret.
    */
  var RotationRules: js.UndefOr[RotationRulesType] = js.native
  
  /**
    * The list of user-defined tags that are associated with the secret. To add tags to a secret, use TagResource. To remove tags, use UntagResource.
    */
  var Tags: js.UndefOr[TagListType] = js.native
  
  /**
    * A list of all of the currently assigned VersionStage staging labels and the VersionId that each is attached to. Staging labels are used to keep track of the different versions during the rotation process.  A version that does not have any staging labels attached is considered deprecated and subject to deletion. Such versions are not included in this list. 
    */
  var VersionIdsToStages: js.UndefOr[SecretVersionsToStagesMapType] = js.native
}
object DescribeSecretResponse {
  
  @scala.inline
  def apply(): DescribeSecretResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSecretResponse]
  }
  
  @scala.inline
  implicit class DescribeSecretResponseOps[Self <: DescribeSecretResponse] (val x: Self) extends AnyVal {
    
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
    def setARN(value: SecretARNType): Self = this.set("ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteARN: Self = this.set("ARN", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: TimestampType): Self = this.set("CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("CreatedDate", js.undefined)
    
    @scala.inline
    def setDeletedDate(value: DeletedDateType): Self = this.set("DeletedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletedDate: Self = this.set("DeletedDate", js.undefined)
    
    @scala.inline
    def setDescription(value: DescriptionType): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: KmsKeyIdType): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    
    @scala.inline
    def setLastAccessedDate(value: LastAccessedDateType): Self = this.set("LastAccessedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastAccessedDate: Self = this.set("LastAccessedDate", js.undefined)
    
    @scala.inline
    def setLastChangedDate(value: LastChangedDateType): Self = this.set("LastChangedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastChangedDate: Self = this.set("LastChangedDate", js.undefined)
    
    @scala.inline
    def setLastRotatedDate(value: LastRotatedDateType): Self = this.set("LastRotatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastRotatedDate: Self = this.set("LastRotatedDate", js.undefined)
    
    @scala.inline
    def setName(value: SecretNameType): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setOwningService(value: OwningServiceType): Self = this.set("OwningService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwningService: Self = this.set("OwningService", js.undefined)
    
    @scala.inline
    def setRotationEnabled(value: RotationEnabledType): Self = this.set("RotationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotationEnabled: Self = this.set("RotationEnabled", js.undefined)
    
    @scala.inline
    def setRotationLambdaARN(value: RotationLambdaARNType): Self = this.set("RotationLambdaARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotationLambdaARN: Self = this.set("RotationLambdaARN", js.undefined)
    
    @scala.inline
    def setRotationRules(value: RotationRulesType): Self = this.set("RotationRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotationRules: Self = this.set("RotationRules", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagListType): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setVersionIdsToStages(value: SecretVersionsToStagesMapType): Self = this.set("VersionIdsToStages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionIdsToStages: Self = this.set("VersionIdsToStages", js.undefined)
  }
}
