package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccelerateConfiguration extends js.Object {
  /**
    * Specifies the transfer acceleration status of the bucket.
    */
  var Status: js.UndefOr[BucketAccelerateStatus] = js.native
}

object AccelerateConfiguration {
  @scala.inline
  def apply(Status: BucketAccelerateStatus = null): AccelerateConfiguration = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerateConfiguration]
  }
}

