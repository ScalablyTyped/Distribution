package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRulesOutput extends js.Object {
  /**
    * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
    */
  var NextMarker: js.UndefOr[Marker] = js.native
  /**
    * Information about the rules.
    */
  var Rules: js.UndefOr[typings.awsSdk.elbv2Mod.Rules] = js.native
}

object DescribeRulesOutput {
  @scala.inline
  def apply(NextMarker: Marker = null, Rules: Rules = null): DescribeRulesOutput = {
    val __obj = js.Dynamic.literal()
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    if (Rules != null) __obj.updateDynamic("Rules")(Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRulesOutput]
  }
}

