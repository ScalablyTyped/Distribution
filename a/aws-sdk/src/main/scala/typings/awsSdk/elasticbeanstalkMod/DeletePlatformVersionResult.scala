package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePlatformVersionResult extends js.Object {
  /**
    * Detailed information about the version of the custom platform.
    */
  var PlatformSummary: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformSummary] = js.native
}

object DeletePlatformVersionResult {
  @scala.inline
  def apply(PlatformSummary: PlatformSummary = null): DeletePlatformVersionResult = {
    val __obj = js.Dynamic.literal()
    if (PlatformSummary != null) __obj.updateDynamic("PlatformSummary")(PlatformSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePlatformVersionResult]
  }
}

