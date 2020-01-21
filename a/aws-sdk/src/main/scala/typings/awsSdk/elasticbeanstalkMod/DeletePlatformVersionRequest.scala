package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePlatformVersionRequest extends js.Object {
  /**
    * The ARN of the version of the custom platform.
    */
  var PlatformArn: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformArn] = js.native
}

object DeletePlatformVersionRequest {
  @scala.inline
  def apply(PlatformArn: PlatformArn = null): DeletePlatformVersionRequest = {
    val __obj = js.Dynamic.literal()
    if (PlatformArn != null) __obj.updateDynamic("PlatformArn")(PlatformArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePlatformVersionRequest]
  }
}

