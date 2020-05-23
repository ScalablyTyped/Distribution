package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyDBSnapshotMessage extends js.Object {
  /**
    * A value that indicates whether to copy all tags from the source DB snapshot to the target DB snapshot. By default, tags are not copied.
    */
  var CopyTags: js.UndefOr[BooleanOptional] = js.native
  /**
    * The AWS KMS key ID for an encrypted DB snapshot. The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier, or the KMS key alias for the KMS encryption key.  If you copy an encrypted DB snapshot from your AWS account, you can specify a value for this parameter to encrypt the copy with a new KMS encryption key. If you don't specify a value for this parameter, then the copy of the DB snapshot is encrypted with the same KMS key as the source DB snapshot.  If you copy an encrypted DB snapshot that is shared from another AWS account, then you must specify a value for this parameter.  If you specify this parameter when you copy an unencrypted snapshot, the copy is encrypted.  If you copy an encrypted snapshot to a different AWS Region, then you must specify a KMS key for the destination AWS Region. KMS encryption keys are specific to the AWS Region that they are created in, and you can't use encryption keys from one AWS Region in another AWS Region. 
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * The name of an option group to associate with the copy of the snapshot. Specify this option if you are copying a snapshot from one AWS Region to another, and your DB instance uses a nondefault option group. If your source DB instance uses Transparent Data Encryption for Oracle or Microsoft SQL Server, you must specify this option when copying across AWS Regions. For more information, see Option Group Considerations in the Amazon RDS User Guide. 
    */
  var OptionGroupName: js.UndefOr[String] = js.native
  /**
    * The URL that contains a Signature Version 4 signed request for the CopyDBSnapshot API action in the source AWS Region that contains the source DB snapshot to copy.  You must specify this parameter when you copy an encrypted DB snapshot from another AWS Region by using the Amazon RDS API. Don't specify PreSignedUrl when you are copying an encrypted DB snapshot in the same AWS Region. The presigned URL must be a valid request for the CopyDBSnapshot API action that can be executed in the source AWS Region that contains the encrypted DB snapshot to be copied. The presigned URL request must contain the following parameter values:     DestinationRegion - The AWS Region that the encrypted DB snapshot is copied to. This AWS Region is the same one where the CopyDBSnapshot action is called that contains this presigned URL.  For example, if you copy an encrypted DB snapshot from the us-west-2 AWS Region to the us-east-1 AWS Region, then you call the CopyDBSnapshot action in the us-east-1 AWS Region and provide a presigned URL that contains a call to the CopyDBSnapshot action in the us-west-2 AWS Region. For this example, the DestinationRegion in the presigned URL must be set to the us-east-1 AWS Region.     KmsKeyId - The AWS KMS key identifier for the key to use to encrypt the copy of the DB snapshot in the destination AWS Region. This is the same identifier for both the CopyDBSnapshot action that is called in the destination AWS Region, and the action contained in the presigned URL.     SourceDBSnapshotIdentifier - The DB snapshot identifier for the encrypted snapshot to be copied. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region. For example, if you are copying an encrypted DB snapshot from the us-west-2 AWS Region, then your SourceDBSnapshotIdentifier looks like the following example: arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20161115.    To learn how to generate a Signature Version 4 signed request, see Authenticating Requests: Using Query Parameters (AWS Signature Version 4) and Signature Version 4 Signing Process.   If you are using an AWS SDK tool or the AWS CLI, you can specify SourceRegion (or --source-region for the AWS CLI) instead of specifying PreSignedUrl manually. Specifying SourceRegion autogenerates a pre-signed URL that is a valid request for the operation that can be executed in the source AWS Region. If you supply a value for this operation's SourceRegion parameter, a pre-signed URL will be calculated on your behalf.
    */
  var PreSignedUrl: js.UndefOr[String] = js.native
  /**
    * The identifier for the source DB snapshot. If the source snapshot is in the same AWS Region as the copy, specify a valid DB snapshot identifier. For example, you might specify rds:mysql-instance1-snapshot-20130805.  If the source snapshot is in a different AWS Region than the copy, specify a valid DB snapshot ARN. For example, you might specify arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20130805.  If you are copying from a shared manual DB snapshot, this parameter must be the Amazon Resource Name (ARN) of the shared DB snapshot.  If you are copying an encrypted snapshot this parameter must be in the ARN format for the source AWS Region, and must match the SourceDBSnapshotIdentifier in the PreSignedUrl parameter.  Constraints:   Must specify a valid system snapshot in the "available" state.   Example: rds:mydb-2012-04-02-00-01  Example: arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20130805 
    */
  var SourceDBSnapshotIdentifier: String = js.native
  /**
    * The ID of the region that contains the snapshot to be copied.
    */
  var SourceRegion: js.UndefOr[String] = js.native
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The identifier for the copy of the snapshot.  Constraints:   Can't be null, empty, or blank   Must contain from 1 to 255 letters, numbers, or hyphens   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: my-db-snapshot 
    */
  var TargetDBSnapshotIdentifier: String = js.native
}

object CopyDBSnapshotMessage {
  @scala.inline
  def apply(
    SourceDBSnapshotIdentifier: String,
    TargetDBSnapshotIdentifier: String,
    CopyTags: js.UndefOr[BooleanOptional] = js.undefined,
    KmsKeyId: String = null,
    OptionGroupName: String = null,
    PreSignedUrl: String = null,
    SourceRegion: String = null,
    Tags: TagList = null
  ): CopyDBSnapshotMessage = {
    val __obj = js.Dynamic.literal(SourceDBSnapshotIdentifier = SourceDBSnapshotIdentifier.asInstanceOf[js.Any], TargetDBSnapshotIdentifier = TargetDBSnapshotIdentifier.asInstanceOf[js.Any])
    if (!js.isUndefined(CopyTags)) __obj.updateDynamic("CopyTags")(CopyTags.get.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    if (OptionGroupName != null) __obj.updateDynamic("OptionGroupName")(OptionGroupName.asInstanceOf[js.Any])
    if (PreSignedUrl != null) __obj.updateDynamic("PreSignedUrl")(PreSignedUrl.asInstanceOf[js.Any])
    if (SourceRegion != null) __obj.updateDynamic("SourceRegion")(SourceRegion.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyDBSnapshotMessage]
  }
}

