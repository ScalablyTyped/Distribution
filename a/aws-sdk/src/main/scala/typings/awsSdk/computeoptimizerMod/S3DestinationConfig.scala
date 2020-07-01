package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3DestinationConfig extends js.Object {
  /**
    * The name of the Amazon S3 bucket to use as the destination for an export job.
    */
  var bucket: js.UndefOr[DestinationBucket] = js.native
  /**
    * The Amazon S3 bucket prefix for an export job.
    */
  var keyPrefix: js.UndefOr[DestinationKeyPrefix] = js.native
}

object S3DestinationConfig {
  @scala.inline
  def apply(bucket: DestinationBucket = null, keyPrefix: DestinationKeyPrefix = null): S3DestinationConfig = {
    val __obj = js.Dynamic.literal()
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (keyPrefix != null) __obj.updateDynamic("keyPrefix")(keyPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3DestinationConfig]
  }
}

