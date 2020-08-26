package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInventoryEntriesRequest extends js.Object {
  /**
    * One or more filters. Use a filter to return a more specific list of results.
    */
  var Filters: js.UndefOr[InventoryFilterList] = js.native
  /**
    * The instance ID for which you want inventory information.
    */
  var InstanceId: typings.awsSdk.ssmMod.InstanceId = js.native
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ssmMod.MaxResults] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  /**
    * The type of inventory item for which you want information.
    */
  var TypeName: InventoryItemTypeName = js.native
}

object ListInventoryEntriesRequest {
  @scala.inline
  def apply(InstanceId: InstanceId, TypeName: InventoryItemTypeName): ListInventoryEntriesRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], TypeName = TypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInventoryEntriesRequest]
  }
  @scala.inline
  implicit class ListInventoryEntriesRequestOps[Self <: ListInventoryEntriesRequest] (val x: Self) extends AnyVal {
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
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeName(value: InventoryItemTypeName): Self = this.set("TypeName", value.asInstanceOf[js.Any])
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
  }
  
}

