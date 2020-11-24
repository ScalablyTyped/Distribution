package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResourceComplianceSummariesResult extends js.Object {
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  
  /**
    * A summary count for specified or targeted managed instances. Summary count includes information about compliant and non-compliant State Manager associations, patch status, or custom items according to the filter criteria that you specify. 
    */
  var ResourceComplianceSummaryItems: js.UndefOr[ResourceComplianceSummaryItemList] = js.native
}
object ListResourceComplianceSummariesResult {
  
  @scala.inline
  def apply(): ListResourceComplianceSummariesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourceComplianceSummariesResult]
  }
  
  @scala.inline
  implicit class ListResourceComplianceSummariesResultOps[Self <: ListResourceComplianceSummariesResult] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setResourceComplianceSummaryItemsVarargs(value: ResourceComplianceSummaryItem*): Self = this.set("ResourceComplianceSummaryItems", js.Array(value :_*))
    
    @scala.inline
    def setResourceComplianceSummaryItems(value: ResourceComplianceSummaryItemList): Self = this.set("ResourceComplianceSummaryItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceComplianceSummaryItems: Self = this.set("ResourceComplianceSummaryItems", js.undefined)
  }
}
