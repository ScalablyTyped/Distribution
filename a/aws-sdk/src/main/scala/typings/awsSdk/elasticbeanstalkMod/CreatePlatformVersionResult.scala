package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePlatformVersionResult extends js.Object {
  /**
    * The builder used to create the custom platform.
    */
  var Builder: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Builder] = js.native
  /**
    * Detailed information about the new version of the custom platform.
    */
  var PlatformSummary: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformSummary] = js.native
}

object CreatePlatformVersionResult {
  @scala.inline
  def apply(Builder: Builder = null, PlatformSummary: PlatformSummary = null): CreatePlatformVersionResult = {
    val __obj = js.Dynamic.literal()
    if (Builder != null) __obj.updateDynamic("Builder")(Builder.asInstanceOf[js.Any])
    if (PlatformSummary != null) __obj.updateDynamic("PlatformSummary")(PlatformSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePlatformVersionResult]
  }
}

