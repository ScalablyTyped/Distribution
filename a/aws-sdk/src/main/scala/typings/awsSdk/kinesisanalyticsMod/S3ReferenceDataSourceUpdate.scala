package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3ReferenceDataSourceUpdate extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the S3 bucket.
    */
  var BucketARNUpdate: js.UndefOr[BucketARN] = js.native
  /**
    * Object key name.
    */
  var FileKeyUpdate: js.UndefOr[FileKey] = js.native
  /**
    * ARN of the IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object and populate the in-application.
    */
  var ReferenceRoleARNUpdate: js.UndefOr[RoleARN] = js.native
}

object S3ReferenceDataSourceUpdate {
  @scala.inline
  def apply(): S3ReferenceDataSourceUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3ReferenceDataSourceUpdate]
  }
  @scala.inline
  implicit class S3ReferenceDataSourceUpdateOps[Self <: S3ReferenceDataSourceUpdate] (val x: Self) extends AnyVal {
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
    def setBucketARNUpdate(value: BucketARN): Self = this.set("BucketARNUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketARNUpdate: Self = this.set("BucketARNUpdate", js.undefined)
    @scala.inline
    def setFileKeyUpdate(value: FileKey): Self = this.set("FileKeyUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileKeyUpdate: Self = this.set("FileKeyUpdate", js.undefined)
    @scala.inline
    def setReferenceRoleARNUpdate(value: RoleARN): Self = this.set("ReferenceRoleARNUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceRoleARNUpdate: Self = this.set("ReferenceRoleARNUpdate", js.undefined)
  }
  
}

