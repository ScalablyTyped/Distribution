package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOpsSummaryRequest extends js.Object {
  
  /**
    * Optional aggregators that return counts of OpsItems based on one or more expressions.
    */
  var Aggregators: js.UndefOr[OpsAggregatorList] = js.native
  
  /**
    * Optional filters used to scope down the returned OpsItems. 
    */
  var Filters: js.UndefOr[OpsFilterList] = js.native
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ssmMod.MaxResults] = js.native
  
  /**
    * A token to start the list. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  
  /**
    * The OpsItem data type to return.
    */
  var ResultAttributes: js.UndefOr[OpsResultAttributeList] = js.native
  
  /**
    * Specify the name of a resource data sync to get.
    */
  var SyncName: js.UndefOr[ResourceDataSyncName] = js.native
}
object GetOpsSummaryRequest {
  
  @scala.inline
  def apply(): GetOpsSummaryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOpsSummaryRequest]
  }
  
  @scala.inline
  implicit class GetOpsSummaryRequestOps[Self <: GetOpsSummaryRequest] (val x: Self) extends AnyVal {
    
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
    def setAggregatorsVarargs(value: OpsAggregator*): Self = this.set("Aggregators", js.Array(value :_*))
    
    @scala.inline
    def setAggregators(value: OpsAggregatorList): Self = this.set("Aggregators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregators: Self = this.set("Aggregators", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: OpsFilter*): Self = this.set("Filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: OpsFilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    
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
    def setResultAttributesVarargs(value: OpsResultAttribute*): Self = this.set("ResultAttributes", js.Array(value :_*))
    
    @scala.inline
    def setResultAttributes(value: OpsResultAttributeList): Self = this.set("ResultAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultAttributes: Self = this.set("ResultAttributes", js.undefined)
    
    @scala.inline
    def setSyncName(value: ResourceDataSyncName): Self = this.set("SyncName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncName: Self = this.set("SyncName", js.undefined)
  }
}
