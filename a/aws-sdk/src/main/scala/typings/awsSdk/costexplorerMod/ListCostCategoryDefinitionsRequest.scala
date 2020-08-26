package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCostCategoryDefinitionsRequest extends js.Object {
  /**
    *  The date when the Cost Category was effective. 
    */
  var EffectiveOn: js.UndefOr[ZonedDateTime] = js.native
  /**
    *  The number of entries a paginated response contains. 
    */
  var MaxResults: js.UndefOr[CostCategoryMaxResults] = js.native
  /**
    *  The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size. 
    */
  var NextToken: js.UndefOr[NextPageToken] = js.native
}

object ListCostCategoryDefinitionsRequest {
  @scala.inline
  def apply(): ListCostCategoryDefinitionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCostCategoryDefinitionsRequest]
  }
  @scala.inline
  implicit class ListCostCategoryDefinitionsRequestOps[Self <: ListCostCategoryDefinitionsRequest] (val x: Self) extends AnyVal {
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
    def setEffectiveOn(value: ZonedDateTime): Self = this.set("EffectiveOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffectiveOn: Self = this.set("EffectiveOn", js.undefined)
    @scala.inline
    def setMaxResults(value: CostCategoryMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextPageToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

