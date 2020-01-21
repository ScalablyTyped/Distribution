package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Configuration extends js.Object {
  /**
    * ARN of the S3 bucket that contains the data.
    */
  var BucketARN: typings.awsSdk.kinesisanalyticsMod.BucketARN = js.native
  /**
    * The name of the object that contains the data.
    */
  var FileKey: typings.awsSdk.kinesisanalyticsMod.FileKey = js.native
  /**
    * IAM ARN of the role used to access the data.
    */
  var RoleARN: typings.awsSdk.kinesisanalyticsMod.RoleARN = js.native
}

object S3Configuration {
  @scala.inline
  def apply(BucketARN: BucketARN, FileKey: FileKey, RoleARN: RoleARN): S3Configuration = {
    val __obj = js.Dynamic.literal(BucketARN = BucketARN.asInstanceOf[js.Any], FileKey = FileKey.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[S3Configuration]
  }
}

