package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3ApplicationCodeLocationDescription extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the S3 bucket containing the application code.
    */
  var BucketARN: typings.awsSdk.kinesisanalyticsv2Mod.BucketARN = js.native
  /**
    * The file key for the object containing the application code.
    */
  var FileKey: typings.awsSdk.kinesisanalyticsv2Mod.FileKey = js.native
  /**
    * The version of the object containing the application code.
    */
  var ObjectVersion: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ObjectVersion] = js.native
}

object S3ApplicationCodeLocationDescription {
  @scala.inline
  def apply(BucketARN: BucketARN, FileKey: FileKey, ObjectVersion: ObjectVersion = null): S3ApplicationCodeLocationDescription = {
    val __obj = js.Dynamic.literal(BucketARN = BucketARN.asInstanceOf[js.Any], FileKey = FileKey.asInstanceOf[js.Any])
    if (ObjectVersion != null) __obj.updateDynamic("ObjectVersion")(ObjectVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ApplicationCodeLocationDescription]
  }
}

