package typings.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecretListEntry extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the secret. For more information about ARNs in Secrets Manager, see Policy Resources in the AWS Secrets Manager User Guide.
    */
  var ARN: js.UndefOr[SecretARNType] = js.native
  /**
    * The date and time on which this secret was deleted. Not present on active secrets. The secret can be recovered until the number of days in the recovery window has passed, as specified in the RecoveryWindowInDays parameter of the DeleteSecret operation.
    */
  var DeletedDate: js.UndefOr[DeletedDateType] = js.native
  /**
    * The user-provided description of the secret.
    */
  var Description: js.UndefOr[DescriptionType] = js.native
  /**
    * The ARN or alias of the AWS KMS customer master key (CMK) that's used to encrypt the SecretString and SecretBinary fields in each version of the secret. If you don't provide a key, then Secrets Manager defaults to encrypting the secret fields with the default KMS CMK (the one named awssecretsmanager) for this account.
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
    * The ARN of an AWS Lambda function that's invoked by Secrets Manager to rotate and expire the secret either automatically per the schedule or manually by a call to RotateSecret.
    */
  var RotationLambdaARN: js.UndefOr[RotationLambdaARNType] = js.native
  /**
    * A structure that defines the rotation configuration for the secret.
    */
  var RotationRules: js.UndefOr[RotationRulesType] = js.native
  /**
    * A list of all of the currently assigned SecretVersionStage staging labels and the SecretVersionId that each is attached to. Staging labels are used to keep track of the different versions during the rotation process.  A version that does not have any SecretVersionStage is considered deprecated and subject to deletion. Such versions are not included in this list. 
    */
  var SecretVersionsToStages: js.UndefOr[SecretVersionsToStagesMapType] = js.native
  /**
    * The list of user-defined tags that are associated with the secret. To add tags to a secret, use TagResource. To remove tags, use UntagResource.
    */
  var Tags: js.UndefOr[TagListType] = js.native
}

object SecretListEntry {
  @scala.inline
  def apply(
    ARN: SecretARNType = null,
    DeletedDate: DeletedDateType = null,
    Description: DescriptionType = null,
    KmsKeyId: KmsKeyIdType = null,
    LastAccessedDate: LastAccessedDateType = null,
    LastChangedDate: LastChangedDateType = null,
    LastRotatedDate: LastRotatedDateType = null,
    Name: SecretNameType = null,
    OwningService: OwningServiceType = null,
    RotationEnabled: js.UndefOr[Boolean] = js.undefined,
    RotationLambdaARN: RotationLambdaARNType = null,
    RotationRules: RotationRulesType = null,
    SecretVersionsToStages: SecretVersionsToStagesMapType = null,
    Tags: TagListType = null
  ): SecretListEntry = {
    val __obj = js.Dynamic.literal()
    if (ARN != null) __obj.updateDynamic("ARN")(ARN.asInstanceOf[js.Any])
    if (DeletedDate != null) __obj.updateDynamic("DeletedDate")(DeletedDate.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    if (LastAccessedDate != null) __obj.updateDynamic("LastAccessedDate")(LastAccessedDate.asInstanceOf[js.Any])
    if (LastChangedDate != null) __obj.updateDynamic("LastChangedDate")(LastChangedDate.asInstanceOf[js.Any])
    if (LastRotatedDate != null) __obj.updateDynamic("LastRotatedDate")(LastRotatedDate.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (OwningService != null) __obj.updateDynamic("OwningService")(OwningService.asInstanceOf[js.Any])
    if (!js.isUndefined(RotationEnabled)) __obj.updateDynamic("RotationEnabled")(RotationEnabled.asInstanceOf[js.Any])
    if (RotationLambdaARN != null) __obj.updateDynamic("RotationLambdaARN")(RotationLambdaARN.asInstanceOf[js.Any])
    if (RotationRules != null) __obj.updateDynamic("RotationRules")(RotationRules.asInstanceOf[js.Any])
    if (SecretVersionsToStages != null) __obj.updateDynamic("SecretVersionsToStages")(SecretVersionsToStages.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretListEntry]
  }
}

