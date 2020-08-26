package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Configuration extends js.Object {
  /**
    * The ARN of the S3 bucket that contains the data.
    */
  var BucketARN: typings.awsSdk.kinesisanalyticsv2Mod.BucketARN = js.native
  /**
    * The name of the object that contains the data.
    */
  var FileKey: typings.awsSdk.kinesisanalyticsv2Mod.FileKey = js.native
}

object S3Configuration {
  @scala.inline
  def apply(BucketARN: BucketARN, FileKey: FileKey): S3Configuration = {
    val __obj = js.Dynamic.literal(BucketARN = BucketARN.asInstanceOf[js.Any], FileKey = FileKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Configuration]
  }
  @scala.inline
  implicit class S3ConfigurationOps[Self <: S3Configuration] (val x: Self) extends AnyVal {
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
  }
  
}

