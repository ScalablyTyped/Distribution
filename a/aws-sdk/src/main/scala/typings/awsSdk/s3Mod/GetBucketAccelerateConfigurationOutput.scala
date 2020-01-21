package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketAccelerateConfigurationOutput extends js.Object {
  /**
    * The accelerate configuration of the bucket.
    */
  var Status: js.UndefOr[BucketAccelerateStatus] = js.native
}

object GetBucketAccelerateConfigurationOutput {
  @scala.inline
  def apply(Status: BucketAccelerateStatus = null): GetBucketAccelerateConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketAccelerateConfigurationOutput]
  }
}

