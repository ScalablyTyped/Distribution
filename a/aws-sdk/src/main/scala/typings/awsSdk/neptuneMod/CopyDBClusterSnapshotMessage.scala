package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyDBClusterSnapshotMessage extends js.Object {
  /**
    * True to copy all tags from the source DB cluster snapshot to the target DB cluster snapshot, and otherwise false. The default is false.
    */
  var CopyTags: js.UndefOr[BooleanOptional] = js.native
  /**
    * The AWS AWS KMS key ID for an encrypted DB cluster snapshot. The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier, or the KMS key alias for the KMS encryption key. If you copy an encrypted DB cluster snapshot from your AWS account, you can specify a value for KmsKeyId to encrypt the copy with a new KMS encryption key. If you don't specify a value for KmsKeyId, then the copy of the DB cluster snapshot is encrypted with the same KMS key as the source DB cluster snapshot. If you copy an encrypted DB cluster snapshot that is shared from another AWS account, then you must specify a value for KmsKeyId.  KMS encryption keys are specific to the AWS Region that they are created in, and you can't use encryption keys from one AWS Region in another AWS Region. You cannot encrypt an unencrypted DB cluster snapshot when you copy it. If you try to copy an unencrypted DB cluster snapshot and specify a value for the KmsKeyId parameter, an error is returned.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * Not currently supported.
    */
  var PreSignedUrl: js.UndefOr[String] = js.native
  /**
    * The identifier of the DB cluster snapshot to copy. This parameter is not case-sensitive. You can't copy from one AWS Region to another. Constraints:   Must specify a valid system snapshot in the "available" state.   Specify a valid DB snapshot identifier.   Example: my-cluster-snapshot1 
    */
  var SourceDBClusterSnapshotIdentifier: String = js.native
  /**
    * The tags to assign to the new DB cluster snapshot copy.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The identifier of the new DB cluster snapshot to create from the source DB cluster snapshot. This parameter is not case-sensitive. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: my-cluster-snapshot2 
    */
  var TargetDBClusterSnapshotIdentifier: String = js.native
}

object CopyDBClusterSnapshotMessage {
  @scala.inline
  def apply(
    SourceDBClusterSnapshotIdentifier: String,
    TargetDBClusterSnapshotIdentifier: String,
    CopyTags: js.UndefOr[BooleanOptional] = js.undefined,
    KmsKeyId: String = null,
    PreSignedUrl: String = null,
    Tags: TagList = null
  ): CopyDBClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal(SourceDBClusterSnapshotIdentifier = SourceDBClusterSnapshotIdentifier.asInstanceOf[js.Any], TargetDBClusterSnapshotIdentifier = TargetDBClusterSnapshotIdentifier.asInstanceOf[js.Any])
    if (!js.isUndefined(CopyTags)) __obj.updateDynamic("CopyTags")(CopyTags.get.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    if (PreSignedUrl != null) __obj.updateDynamic("PreSignedUrl")(PreSignedUrl.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyDBClusterSnapshotMessage]
  }
}

