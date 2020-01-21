package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAccountLimitsOutput extends js.Object {
  /**
    * Information about the limits.
    */
  var Limits: js.UndefOr[typings.awsSdk.elbMod.Limits] = js.native
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
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

