package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStandardsControlsResponse extends js.Object {
  /**
    * A list of compliance standards controls.
    */
  var Controls: js.UndefOr[StandardsControls] = js.native
  /**
    * If there are more compliance standards control remaining in the results, then this is the pagination token to use to request the next page of compliance standard controls.
    */
  var NextToken: js.UndefOr[typings.awsSdk.securityhubMod.NextToken] = js.native
}

object DescribeStandardsControlsResponse {
  @scala.inline
  def apply(Controls: StandardsControls = null, NextToken: NextToken = null): DescribeStandardsControlsResponse = {
    val __obj = js.Dynamic.literal()
    if (Controls != null) __obj.updateDynamic("Controls")(Controls.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStandardsControlsResponse]
  }
}

