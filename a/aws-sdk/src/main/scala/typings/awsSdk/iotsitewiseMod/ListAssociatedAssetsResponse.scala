package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAssociatedAssetsResponse extends js.Object {
  /**
    * A list that summarizes the associated assets.
    */
  var assetSummaries: AssociatedAssetsSummaries = js.native
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListAssociatedAssetsResponse {
  @scala.inline
  def apply(assetSummaries: AssociatedAssetsSummaries): ListAssociatedAssetsResponse = {
    val __obj = js.Dynamic.literal(assetSummaries = assetSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssociatedAssetsResponse]
  }
  @scala.inline
  implicit class ListAssociatedAssetsResponseOps[Self <: ListAssociatedAssetsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssetSummariesVarargs(value: AssociatedAssetsSummary*): Self = this.set("assetSummaries", js.Array(value :_*))
    @scala.inline
    def setAssetSummaries(value: AssociatedAssetsSummaries): Self = this.set("assetSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

