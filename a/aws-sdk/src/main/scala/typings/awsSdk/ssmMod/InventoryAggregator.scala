package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryAggregator extends js.Object {
  /**
    * Nested aggregators to further refine aggregation for an inventory type.
    */
  var Aggregators: js.UndefOr[InventoryAggregatorList] = js.native
  /**
    * The inventory type and attribute name for aggregation.
    */
  var Expression: js.UndefOr[InventoryAggregatorExpression] = js.native
  /**
    * A user-defined set of one or more filters on which to aggregate inventory data. Groups return a count of resources that match and don't match the specified criteria.
    */
  var Groups: js.UndefOr[InventoryGroupList] = js.native
}

object InventoryAggregator {
  @scala.inline
  def apply(): InventoryAggregator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryAggregator]
  }
  @scala.inline
  implicit class InventoryAggregatorOps[Self <: InventoryAggregator] (val x: Self) extends AnyVal {
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
    def setExpression(value: InventoryAggregatorExpression): Self = this.set("Expression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpression: Self = this.set("Expression", js.undefined)
    @scala.inline
    def setGroupsVarargs(value: InventoryGroup*): Self = this.set("Groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: InventoryGroupList): Self = this.set("Groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("Groups", js.undefined)
  }
  
}

