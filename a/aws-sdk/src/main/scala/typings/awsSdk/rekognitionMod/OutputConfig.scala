package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputConfig extends js.Object {
  /**
    * The S3 bucket where training output is placed.
    */
  var S3Bucket: js.UndefOr[typings.awsSdk.rekognitionMod.S3Bucket] = js.native
  /**
    * The prefix applied to the training output files. 
    */
  var S3KeyPrefix: js.UndefOr[typings.awsSdk.rekognitionMod.S3KeyPrefix] = js.native
}

object OutputConfig {
  @scala.inline
  def apply(S3Bucket: S3Bucket = null, S3KeyPrefix: S3KeyPrefix = null): OutputConfig = {
    val __obj = js.Dynamic.literal()
    if (S3Bucket != null) __obj.updateDynamic("S3Bucket")(S3Bucket.asInstanceOf[js.Any])
    if (S3KeyPrefix != null) __obj.updateDynamic("S3KeyPrefix")(S3KeyPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputConfig]
  }
}

