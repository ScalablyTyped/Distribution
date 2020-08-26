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
  def apply(): DescribePatchGroupsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePatchGroupsResult]
  }
  @scala.inline
  implicit class DescribePatchGroupsResultOps[Self <: DescribePatchGroupsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMappingsVarargs(value: PatchGroupPatchBaselineMapping*): Self = this.set("Mappings", js.Array(value :_*))
    @scala.inline
    def setMappings(value: PatchGroupPatchBaselineMappingList): Self = this.set("Mappings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMappings: Self = this.set("Mappings", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

