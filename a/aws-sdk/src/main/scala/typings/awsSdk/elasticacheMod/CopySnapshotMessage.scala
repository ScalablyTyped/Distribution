package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopySnapshotMessage extends StObject {
  
  /**
    * The ID of the KMS key used to encrypt the target snapshot.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  
  /**
    * The name of an existing snapshot from which to make a copy.
    */
  var SourceSnapshotName: String = js.native
  
  /**
    * The Amazon S3 bucket to which the snapshot is exported. This parameter is used only when exporting a snapshot for external access. When using this parameter to export a snapshot, be sure Amazon ElastiCache has the needed permissions to this S3 bucket. For more information, see Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket in the Amazon ElastiCache User Guide. For more information, see Exporting a Snapshot in the Amazon ElastiCache User Guide.
    */
  var TargetBucket: js.UndefOr[String] = js.native
  
  /**
    * A name for the snapshot copy. ElastiCache does not permit overwriting a snapshot, therefore this name must be unique within its context - ElastiCache or an Amazon S3 bucket if exporting.
    */
  var TargetSnapshotName: String = js.native
}
object CopySnapshotMessage {
  
  @scala.inline
  def apply(SourceSnapshotName: String, TargetSnapshotName: String): CopySnapshotMessage = {
    val __obj = js.Dynamic.literal(SourceSnapshotName = SourceSnapshotName.asInstanceOf[js.Any], TargetSnapshotName = TargetSnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopySnapshotMessage]
  }
  
  @scala.inline
  implicit class CopySnapshotMessageMutableBuilder[Self <: CopySnapshotMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setSourceSnapshotName(value: String): Self = StObject.set(x, "SourceSnapshotName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetBucket(value: String): Self = StObject.set(x, "TargetBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetBucketUndefined: Self = StObject.set(x, "TargetBucket", js.undefined)
    
    @scala.inline
    def setTargetSnapshotName(value: String): Self = StObject.set(x, "TargetSnapshotName", value.asInstanceOf[js.Any])
  }
}
