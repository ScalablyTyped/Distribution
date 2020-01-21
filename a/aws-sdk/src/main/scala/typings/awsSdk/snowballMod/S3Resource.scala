package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Resource extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of an Amazon S3 bucket.
    */
  var BucketArn: js.UndefOr[ResourceARN] = js.native
  /**
    * For export jobs, you can provide an optional KeyRange within a specific Amazon S3 bucket. The length of the range is defined at job creation, and has either an inclusive BeginMarker, an inclusive EndMarker, or both. Ranges are UTF-8 binary sorted.
    */
  var KeyRange: js.UndefOr[typings.awsSdk.snowballMod.KeyRange] = js.native
}

object S3Resource {
  @scala.inline
  def apply(BucketArn: ResourceARN = null, KeyRange: KeyRange = null): S3Resource = {
    val __obj = js.Dynamic.literal()
    if (BucketArn != null) __obj.updateDynamic("BucketArn")(BucketArn.asInstanceOf[js.Any])
    if (KeyRange != null) __obj.updateDynamic("KeyRange")(KeyRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Resource]
  }
}

