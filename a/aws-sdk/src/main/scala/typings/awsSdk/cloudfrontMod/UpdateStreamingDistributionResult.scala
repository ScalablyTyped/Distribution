package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateStreamingDistributionResult extends js.Object {
  /**
    * The current version of the configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * The streaming distribution's information.
    */
  var StreamingDistribution: js.UndefOr[typings.awsSdk.cloudfrontMod.StreamingDistribution] = js.native
}

object UpdateStreamingDistributionResult {
  @scala.inline
  def apply(ETag: String = null, StreamingDistribution: StreamingDistribution = null): UpdateStreamingDistributionResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (StreamingDistribution != null) __obj.updateDynamic("StreamingDistribution")(StreamingDistribution.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStreamingDistributionResult]
  }
}

