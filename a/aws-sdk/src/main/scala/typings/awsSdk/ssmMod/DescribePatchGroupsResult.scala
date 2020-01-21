package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePatchGroupsResult extends js.Object {
  /**
    * Each entry in the array contains: PatchGroup: string (between 1 and 256 characters, Regex: ^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$) PatchBaselineIdentity: A PatchBaselineIdentity element. 
    */
  var Mappings: js.UndefOr[PatchGroupPatchBaselineMappingList] = js.native
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}

object DescribePatchGroupsResult {
  @scala.inline
  def apply(Mappings: PatchGroupPatchBaselineMappingList = null, NextToken: NextToken = null): DescribePatchGroupsResult = {
    val __obj = js.Dynamic.literal()
    if (Mappings != null) __obj.updateDynamic("Mappings")(Mappings.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePatchGroupsResult]
  }
}

