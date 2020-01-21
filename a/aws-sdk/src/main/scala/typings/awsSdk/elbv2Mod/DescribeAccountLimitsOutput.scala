package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAccountLimitsOutput extends js.Object {
  /**
    * Information about the limits.
    */
  var Limits: js.UndefOr[typings.awsSdk.elbv2Mod.Limits] = js.native
  /**
    * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
    */
  var NextMarker: js.UndefOr[Marker] = js.native
}

object DescribeAccountLimitsOutput {
  @scala.inline
  def apply(Limits: Limits = null, NextMarker: Marker = null): DescribeAccountLimitsOutput = {
    val __obj = js.Dynamic.literal()
    if (Limits != null) __obj.updateDynamic("Limits")(Limits.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccountLimitsOutput]
  }
}

