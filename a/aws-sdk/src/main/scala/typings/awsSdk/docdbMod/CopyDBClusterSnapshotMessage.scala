package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyDBClusterSnapshotMessage extends StObject {
  
  /**
    * Set to true to copy all tags from the source cluster snapshot to the target cluster snapshot, and otherwise false. The default is false.
    */
  var CopyTags: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The KMS key ID for an encrypted cluster snapshot. The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier, or the KMS key alias for the KMS encryption key.  If you copy an encrypted cluster snapshot from your Amazon Web Services account, you can specify a value for KmsKeyId to encrypt the copy with a new KMS encryption key. If you don't specify a value for KmsKeyId, then the copy of the cluster snapshot is encrypted with the same KMS key as the source cluster snapshot. If you copy an encrypted cluster snapshot that is shared from another Amazon Web Services account, then you must specify a value for KmsKeyId. To copy an encrypted cluster snapshot to another Amazon Web Services Region, set KmsKeyId to the KMS key ID that you want to use to encrypt the copy of the cluster snapshot in the destination Region. KMS encryption keys are specific to the Amazon Web Services Region that they are created in, and you can't use encryption keys from one Amazon Web Services Region in another Amazon Web Services Region. If you copy an unencrypted cluster snapshot and specify a value for the KmsKeyId parameter, an error is returned.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The URL that contains a Signature Version 4 signed request for theCopyDBClusterSnapshot API action in the Amazon Web Services Region that contains the source cluster snapshot to copy. You must use the PreSignedUrl parameter when copying a cluster snapshot from another Amazon Web Services Region. If you are using an Amazon Web Services SDK tool or the CLI, you can specify SourceRegion (or --source-region for the CLI) instead of specifying PreSignedUrl manually. Specifying SourceRegion autogenerates a pre-signed URL that is a valid request for the operation that can be executed in the source Amazon Web Services Region. The presigned URL must be a valid request for the CopyDBClusterSnapshot API action that can be executed in the source Amazon Web Services Region that contains the cluster snapshot to be copied. The presigned URL request must contain the following parameter values:    SourceRegion - The ID of the region that contains the snapshot to be copied.    SourceDBClusterSnapshotIdentifier - The identifier for the the encrypted cluster snapshot to be copied. This identifier must be in the Amazon Resource Name (ARN) format for the source Amazon Web Services Region. For example, if you are copying an encrypted cluster snapshot from the us-east-1 Amazon Web Services Region, then your SourceDBClusterSnapshotIdentifier looks something like the following: arn:aws:rds:us-east-1:12345678012:sample-cluster:sample-cluster-snapshot.    TargetDBClusterSnapshotIdentifier - The identifier for the new cluster snapshot to be created. This parameter isn't case sensitive.  
    */
  var PreSignedUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the cluster snapshot to copy. This parameter is not case sensitive. Constraints:   Must specify a valid system snapshot in the available state.   If the source snapshot is in the same Amazon Web Services Region as the copy, specify a valid snapshot identifier.   If the source snapshot is in a different Amazon Web Services Region than the copy, specify a valid cluster snapshot ARN.   Example: my-cluster-snapshot1 
    */
  var SourceDBClusterSnapshotIdentifier: String
  
  /**
    * The tags to be assigned to the cluster snapshot.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The identifier of the new cluster snapshot to create from the source cluster snapshot. This parameter is not case sensitive. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.    The first character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.    Example: my-cluster-snapshot2 
    */
  var TargetDBClusterSnapshotIdentifier: String
}
object CopyDBClusterSnapshotMessage {
  
  inline def apply(SourceDBClusterSnapshotIdentifier: String, TargetDBClusterSnapshotIdentifier: String): CopyDBClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal(SourceDBClusterSnapshotIdentifier = SourceDBClusterSnapshotIdentifier.asInstanceOf[js.Any], TargetDBClusterSnapshotIdentifier = TargetDBClusterSnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyDBClusterSnapshotMessage]
  }
  
  extension [Self <: CopyDBClusterSnapshotMessage](x: Self) {
    
    inline def setCopyTags(value: BooleanOptional): Self = StObject.set(x, "CopyTags", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsUndefined: Self = StObject.set(x, "CopyTags", js.undefined)
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setPreSignedUrl(value: String): Self = StObject.set(x, "PreSignedUrl", value.asInstanceOf[js.Any])
    
    inline def setPreSignedUrlUndefined: Self = StObject.set(x, "PreSignedUrl", js.undefined)
    
    inline def setSourceDBClusterSnapshotIdentifier(value: String): Self = StObject.set(x, "SourceDBClusterSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTargetDBClusterSnapshotIdentifier(value: String): Self = StObject.set(x, "TargetDBClusterSnapshotIdentifier", value.asInstanceOf[js.Any])
  }
}
