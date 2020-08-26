package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInventoryRequest extends js.Object {
  /**
    * Returns counts of inventory types based on one or more expressions. For example, if you aggregate by using an expression that uses the AWS:InstanceInformation.PlatformType type, you can see a count of how many Windows and Linux instances exist in your inventoried fleet.
    */
  var Aggregators: js.UndefOr[InventoryAggregatorList] = js.native
  /**
    * One or more filters. Use a filter to return a more specific list of results.
    */
  var Filters: js.UndefOr[InventoryFilterList] = js.native
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ssmMod.MaxResults] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  /**
    * The list of inventory item types to return.
    */
  var ResultAttributes: js.UndefOr[ResultAttributeList] = js.native
}

object GetInventoryRequest {
  @scala.inline
  def apply(): GetInventoryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInventoryRequest]
  }
  @scala.inline
  implicit class GetInventoryRequestOps[Self <: GetInventoryRequest] (val x: Self) extends AnyVal {
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
    def setAggregatorsVarargs(value: InventoryAggregator*): Self = this.set("Aggregators", js.Array(value :_*))
    @scala.inline
    def setAggregators(value: InventoryAggregatorList): Self = this.set("Aggregators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregators: Self = this.set("Aggregators", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: InventoryFilter*): Self = this.set("Filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: InventoryFilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setResultAttributesVarargs(value: ResultAttribute*): Self = this.set("ResultAttributes", js.Array(value :_*))
    @scala.inline
    def setResultAttributes(value: ResultAttributeList): Self = this.set("ResultAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultAttributes: Self = this.set("ResultAttributes", js.undefined)
  }
  
}

