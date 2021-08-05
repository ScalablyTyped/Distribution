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
    * The AWS KMS key ID for an encrypted cluster snapshot. The AWS KMS key ID is the Amazon Resource Name (ARN), AWS KMS key identifier, or the AWS KMS key alias for the AWS KMS encryption key.  If you copy an encrypted cluster snapshot from your AWS account, you can specify a value for KmsKeyId to encrypt the copy with a new AWS KMS encryption key. If you don't specify a value for KmsKeyId, then the copy of the cluster snapshot is encrypted with the same AWS KMS key as the source cluster snapshot.  If you copy an encrypted cluster snapshot that is shared from another AWS account, then you must specify a value for KmsKeyId. To copy an encrypted cluster snapshot to another AWS Region, set KmsKeyId to the AWS KMS key ID that you want to use to encrypt the copy of the cluster snapshot in the destination Region. AWS KMS encryption keys are specific to the AWS Region that they are created in, and you can't use encryption keys from one AWS Region in another AWS Region. If you copy an unencrypted cluster snapshot and specify a value for the KmsKeyId parameter, an error is returned.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The URL that contains a Signature Version 4 signed request for the CopyDBClusterSnapshot API action in the AWS Region that contains the source cluster snapshot to copy. You must use the PreSignedUrl parameter when copying a cluster snapshot from another AWS Region. If you are using an AWS SDK tool or the AWS CLI, you can specify SourceRegion (or --source-region for the AWS CLI) instead of specifying PreSignedUrl manually. Specifying SourceRegion autogenerates a pre-signed URL that is a valid request for the operation that can be executed in the source AWS Region. The presigned URL must be a valid request for the CopyDBClusterSnapshot API action that can be executed in the source AWS Region that contains the cluster snapshot to be copied. The presigned URL request must contain the following parameter values:    SourceRegion - The ID of the region that contains the snapshot to be copied.    SourceDBClusterSnapshotIdentifier - The identifier for the the encrypted cluster snapshot to be copied. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region. For example, if you are copying an encrypted cluster snapshot from the us-east-1 AWS Region, then your SourceDBClusterSnapshotIdentifier looks something like the following: arn:aws:rds:us-east-1:12345678012:sample-cluster:sample-cluster-snapshot.    TargetDBClusterSnapshotIdentifier - The identifier for the new cluster snapshot to be created. This parameter isn't case sensitive.  
    */
  var PreSignedUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the cluster snapshot to copy. This parameter is not case sensitive. Constraints:   Must specify a valid system snapshot in the available state.   If the source snapshot is in the same AWS Region as the copy, specify a valid snapshot identifier.   If the source snapshot is in a different AWS Region than the copy, specify a valid cluster snapshot ARN.   Example: my-cluster-snapshot1 
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
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    inline def setTargetDBClusterSnapshotIdentifier(value: String): Self = StObject.set(x, "TargetDBClusterSnapshotIdentifier", value.asInstanceOf[js.Any])
  }
}
