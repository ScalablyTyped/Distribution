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
}

