package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3ReferenceDataSource extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the S3 bucket.
    */
  var BucketARN: typings.awsSdk.kinesisanalyticsMod.BucketARN = js.native
  /**
    * Object key name containing reference data.
    */
  var FileKey: typings.awsSdk.kinesisanalyticsMod.FileKey = js.native
  /**
    * ARN of the IAM role that the service can assume to read data on your behalf. This role must have permission for the s3:GetObject action on the object and trust policy that allows Amazon Kinesis Analytics service principal to assume this role.
    */
  var ReferenceRoleARN: RoleARN = js.native
}

object S3ReferenceDataSource {
  @scala.inline
  def apply(BucketARN: BucketARN, FileKey: FileKey, ReferenceRoleARN: RoleARN): S3ReferenceDataSource = {
    val __obj = js.Dynamic.literal(BucketARN = BucketARN.asInstanceOf[js.Any], FileKey = FileKey.asInstanceOf[js.Any], ReferenceRoleARN = ReferenceRoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ReferenceDataSource]
  }
  @scala.inline
  implicit class S3ReferenceDataSourceOps[Self <: S3ReferenceDataSource] (val x: Self) extends AnyVal {
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
    def setBucketARN(value: BucketARN): Self = this.set("BucketARN", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileKey(value: FileKey): Self = this.set("FileKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferenceRoleARN(value: RoleARN): Self = this.set("ReferenceRoleARN", value.asInstanceOf[js.Any])
  }
  
}

