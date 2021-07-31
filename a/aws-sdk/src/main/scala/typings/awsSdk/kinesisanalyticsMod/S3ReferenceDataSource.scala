package typings.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ReferenceDataSource extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the S3 bucket.
    */
  var BucketARN: typings.awsSdk.kinesisanalyticsMod.BucketARN
  
  /**
    * Object key name containing reference data.
    */
  var FileKey: typings.awsSdk.kinesisanalyticsMod.FileKey
  
  /**
    * ARN of the IAM role that the service can assume to read data on your behalf. This role must have permission for the s3:GetObject action on the object and trust policy that allows Amazon Kinesis Analytics service principal to assume this role.
    */
  var ReferenceRoleARN: RoleARN
}
object S3ReferenceDataSource {
  
  @scala.inline
  def apply(BucketARN: BucketARN, FileKey: FileKey, ReferenceRoleARN: RoleARN): S3ReferenceDataSource = {
    val __obj = js.Dynamic.literal(BucketARN = BucketARN.asInstanceOf[js.Any], FileKey = FileKey.asInstanceOf[js.Any], ReferenceRoleARN = ReferenceRoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ReferenceDataSource]
  }
  
  @scala.inline
  implicit class S3ReferenceDataSourceMutableBuilder[Self <: S3ReferenceDataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketARN(value: BucketARN): Self = StObject.set(x, "BucketARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileKey(value: FileKey): Self = StObject.set(x, "FileKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceRoleARN(value: RoleARN): Self = StObject.set(x, "ReferenceRoleARN", value.asInstanceOf[js.Any])
  }
}
