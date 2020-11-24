package typings.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecretListEntry extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the secret. For more information about ARNs in Secrets Manager, see Policy Resources in the AWS Secrets Manager User Guide.
    */
  var ARN: js.UndefOr[SecretARNType] = js.native
  
  /**
    * The date and time when a secret was created.
    */
  var CreatedDate: js.UndefOr[TimestampType] = js.native
  
  /**
    * The date and time the deletion of the secret occurred. Not present on active secrets. The secret can be recovered until the number of days in the recovery window has passed, as specified in the RecoveryWindowInDays parameter of the DeleteSecret operation.
    */
  var DeletedDate: js.UndefOr[DeletedDateType] = js.native
  
  /**
    * The user-provided description of the secret.
    */
  var Description: js.UndefOr[DescriptionType] = js.native
  
  /**
    * The ARN or alias of the AWS KMS customer master key (CMK) used to encrypt the SecretString and SecretBinary fields in each version of the secret. If you don't provide a key, then Secrets Manager defaults to encrypting the secret fields with the default KMS CMK, the key named awssecretsmanager, for this account.
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
    * The last date and time that the rotation process for this secret was invoked.
    */
  var LastRotatedDate: js.UndefOr[LastRotatedDateType] = js.native
  
  /**
    * The friendly name of the secret. You can use forward slashes in the name to represent a path hierarchy. For example, /prod/databases/dbserver1 could represent the secret for a server named dbserver1 in the folder databases in the folder prod. 
    */
  var Name: js.UndefOr[SecretNameType] = js.native
  
  /**
    * Returns the name of the service that created the secret.
    */
  var OwningService: js.UndefOr[OwningServiceType] = js.native
  
  /**
    * Indicates whether automatic, scheduled rotation is enabled for this secret.
    */
  var RotationEnabled: js.UndefOr[RotationEnabledType] = js.native
  
  /**
    * The ARN of an AWS Lambda function invoked by Secrets Manager to rotate and expire the secret either automatically per the schedule or manually by a call to RotateSecret.
    */
  var RotationLambdaARN: js.UndefOr[RotationLambdaARNType] = js.native
  
  /**
    * A structure that defines the rotation configuration for the secret.
    */
  var RotationRules: js.UndefOr[RotationRulesType] = js.native
  
  /**
    * A list of all of the currently assigned SecretVersionStage staging labels and the SecretVersionId attached to each one. Staging labels are used to keep track of the different versions during the rotation process.  A version that does not have any SecretVersionStage is considered deprecated and subject to deletion. Such versions are not included in this list. 
    */
  var SecretVersionsToStages: js.UndefOr[SecretVersionsToStagesMapType] = js.native
  
  /**
    * The list of user-defined tags associated with the secret. To add tags to a secret, use TagResource. To remove tags, use UntagResource.
    */
  var Tags: js.UndefOr[TagListType] = js.native
}
object SecretListEntry {
  
  @scala.inline
  def apply(): SecretListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretListEntry]
  }
  
  @scala.inline
  implicit class SecretListEntryOps[Self <: SecretListEntry] (val x: Self) extends AnyVal {
    
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
    def setSecretVersionsToStages(value: SecretVersionsToStagesMapType): Self = this.set("SecretVersionsToStages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretVersionsToStages: Self = this.set("SecretVersionsToStages", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagListType): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
