package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAvailablePatchesResult extends js.Object {
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  /**
    * An array of patches. Each entry in the array is a patch structure.
    */
  var Patches: js.UndefOr[PatchList] = js.native
}

object DescribeAvailablePatchesResult {
  @scala.inline
  def apply(NextToken: NextToken = null, Patches: PatchList = null): DescribeAvailablePatchesResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Patches != null) __obj.updateDynamic("Patches")(Patches.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAvailablePatchesResult]
  }
}

