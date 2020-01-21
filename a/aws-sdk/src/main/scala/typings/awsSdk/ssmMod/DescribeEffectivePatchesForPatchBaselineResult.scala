package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEffectivePatchesForPatchBaselineResult extends js.Object {
  /**
    * An array of patches and patch status.
    */
  var EffectivePatches: js.UndefOr[EffectivePatchList] = js.native
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}

object DescribeEffectivePatchesForPatchBaselineResult {
  @scala.inline
  def apply(EffectivePatches: EffectivePatchList = null, NextToken: NextToken = null): DescribeEffectivePatchesForPatchBaselineResult = {
    val __obj = js.Dynamic.literal()
    if (EffectivePatches != null) __obj.updateDynamic("EffectivePatches")(EffectivePatches.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEffectivePatchesForPatchBaselineResult]
  }
}

