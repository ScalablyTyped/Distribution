package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListComplianceItemsRequest extends js.Object {
  /**
    * One or more compliance filters. Use a filter to return a more specific list of results.
    */
  var Filters: js.UndefOr[ComplianceStringFilterList] = js.native
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ssmMod.MaxResults] = js.native
  /**
    * A token to start the list. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  /**
    * The ID for the resources from which to get compliance information. Currently, you can only specify one resource ID.
    */
  var ResourceIds: js.UndefOr[ComplianceResourceIdList] = js.native
  /**
    * The type of resource from which to get compliance information. Currently, the only supported resource type is ManagedInstance.
    */
  var ResourceTypes: js.UndefOr[ComplianceResourceTypeList] = js.native
}

object ListComplianceItemsRequest {
  @scala.inline
  def apply(): ListComplianceItemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListComplianceItemsRequest]
  }
  @scala.inline
  implicit class ListComplianceItemsRequestOps[Self <: ListComplianceItemsRequest] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: ComplianceStringFilter*): Self = this.set("Filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: ComplianceStringFilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
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
    def setResourceIdsVarargs(value: ComplianceResourceId*): Self = this.set("ResourceIds", js.Array(value :_*))
    @scala.inline
    def setResourceIds(value: ComplianceResourceIdList): Self = this.set("ResourceIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceIds: Self = this.set("ResourceIds", js.undefined)
    @scala.inline
    def setResourceTypesVarargs(value: ComplianceResourceType*): Self = this.set("ResourceTypes", js.Array(value :_*))
    @scala.inline
    def setResourceTypes(value: ComplianceResourceTypeList): Self = this.set("ResourceTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceTypes: Self = this.set("ResourceTypes", js.undefined)
  }
  
}

