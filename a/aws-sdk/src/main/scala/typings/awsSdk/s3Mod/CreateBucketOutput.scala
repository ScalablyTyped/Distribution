package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBucketOutput extends js.Object {
  /**
    * Specifies the Region where the bucket will be created. If you are creating a bucket on the US East (N. Virginia) Region (us-east-1), you do not need to specify the location.
    */
  var Location: js.UndefOr[typings.awsSdk.s3Mod.Location] = js.native
}

object CreateBucketOutput {
  @scala.inline
  def apply(Location: Location = null): CreateBucketOutput = {
    val __obj = js.Dynamic.literal()
    if (Location != null) __obj.updateDynamic("Location")(Location.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBucketOutput]
  }
}

