package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePatchBaselinesResult extends js.Object {
  /**
    * An array of PatchBaselineIdentity elements.
    */
  var BaselineIdentities: js.UndefOr[PatchBaselineIdentityList] = js.native
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}

object DescribePatchBaselinesResult {
  @scala.inline
  def apply(BaselineIdentities: PatchBaselineIdentityList = null, NextToken: NextToken = null): DescribePatchBaselinesResult = {
    val __obj = js.Dynamic.literal()
    if (BaselineIdentities != null) __obj.updateDynamic("BaselineIdentities")(BaselineIdentities.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePatchBaselinesResult]
  }
}

