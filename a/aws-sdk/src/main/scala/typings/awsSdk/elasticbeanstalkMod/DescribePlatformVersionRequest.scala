package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePlatformVersionRequest extends js.Object {
  /**
    * The ARN of the version of the platform.
    */
  var PlatformArn: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformArn] = js.native
}

object DescribePlatformVersionRequest {
  @scala.inline
  def apply(PlatformArn: PlatformArn = null): DescribePlatformVersionRequest = {
    val __obj = js.Dynamic.literal()
    if (PlatformArn != null) __obj.updateDynamic("PlatformArn")(PlatformArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePlatformVersionRequest]
  }
}

