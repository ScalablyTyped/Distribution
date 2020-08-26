package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3ReferenceDataSource extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the S3 bucket.
    */
  var BucketARN: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.BucketARN] = js.native
  /**
    * The object key name containing the reference data.
    */
  var FileKey: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.FileKey] = js.native
}

object S3ReferenceDataSource {
  @scala.inline
  def apply(): S3ReferenceDataSource = {
    val __obj = js.Dynamic.literal()
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
    def deleteBucketARN: Self = this.set("BucketARN", js.undefined)
    @scala.inline
    def setFileKey(value: FileKey): Self = this.set("FileKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileKey: Self = this.set("FileKey", js.undefined)
  }
  
}

