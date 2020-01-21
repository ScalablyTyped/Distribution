package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDistributionResult extends js.Object {
  /**
    * The distribution's information.
    */
  var Distribution: js.UndefOr[typings.awsSdk.cloudfrontMod.Distribution] = js.native
  /**
    * The current version of the configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
}

object UpdateDistributionResult {
  @scala.inline
  def apply(Distribution: Distribution = null, ETag: String = null): UpdateDistributionResult = {
    val __obj = js.Dynamic.literal()
    if (Distribution != null) __obj.updateDynamic("Distribution")(Distribution.asInstanceOf[js.Any])
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDistributionResult]
  }
}

