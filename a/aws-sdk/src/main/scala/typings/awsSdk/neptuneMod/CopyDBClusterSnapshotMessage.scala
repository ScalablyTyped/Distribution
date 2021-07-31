package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyDBClusterSnapshotMessage extends StObject {
  
  /**
    * True to copy all tags from the source DB cluster snapshot to the target DB cluster snapshot, and otherwise false. The default is false.
    */
  var CopyTags: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The AWS AWS KMS key ID for an encrypted DB cluster snapshot. The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier, or the KMS key alias for the KMS encryption key. If you copy an encrypted DB cluster snapshot from your AWS account, you can specify a value for KmsKeyId to encrypt the copy with a new KMS encryption key. If you don't specify a value for KmsKeyId, then the copy of the DB cluster snapshot is encrypted with the same KMS key as the source DB cluster snapshot. If you copy an encrypted DB cluster snapshot that is shared from another AWS account, then you must specify a value for KmsKeyId.  KMS encryption keys are specific to the AWS Region that they are created in, and you can't use encryption keys from one AWS Region in another AWS Region. You cannot encrypt an unencrypted DB cluster snapshot when you copy it. If you try to copy an unencrypted DB cluster snapshot and specify a value for the KmsKeyId parameter, an error is returned.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * Not currently supported.
    */
  var PreSignedUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the DB cluster snapshot to copy. This parameter is not case-sensitive. You can't copy from one AWS Region to another. Constraints:   Must specify a valid system snapshot in the "available" state.   Specify a valid DB snapshot identifier.   Example: my-cluster-snapshot1 
    */
  var SourceDBClusterSnapshotIdentifier: String
  
  /**
    * The tags to assign to the new DB cluster snapshot copy.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The identifier of the new DB cluster snapshot to create from the source DB cluster snapshot. This parameter is not case-sensitive. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: my-cluster-snapshot2 
    */
  var TargetDBClusterSnapshotIdentifier: String
}
object CopyDBClusterSnapshotMessage {
  
  @scala.inline
  def apply(SourceDBClusterSnapshotIdentifier: String, TargetDBClusterSnapshotIdentifier: String): CopyDBClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal(SourceDBClusterSnapshotIdentifier = SourceDBClusterSnapshotIdentifier.asInstanceOf[js.Any], TargetDBClusterSnapshotIdentifier = TargetDBClusterSnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyDBClusterSnapshotMessage]
  }
  
  @scala.inline
  implicit class CopyDBClusterSnapshotMessageMutableBuilder[Self <: CopyDBClusterSnapshotMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopyTags(value: BooleanOptional): Self = StObject.set(x, "CopyTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyTagsUndefined: Self = StObject.set(x, "CopyTags", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setPreSignedUrl(value: String): Self = StObject.set(x, "PreSignedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreSignedUrlUndefined: Self = StObject.set(x, "PreSignedUrl", js.undefined)
    
    @scala.inline
    def setSourceDBClusterSnapshotIdentifier(value: String): Self = StObject.set(x, "SourceDBClusterSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTargetDBClusterSnapshotIdentifier(value: String): Self = StObject.set(x, "TargetDBClusterSnapshotIdentifier", value.asInstanceOf[js.Any])
  }
}
