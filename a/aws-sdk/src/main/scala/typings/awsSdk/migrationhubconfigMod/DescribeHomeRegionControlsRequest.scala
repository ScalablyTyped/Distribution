package typings.awsSdk.migrationhubconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeHomeRegionControlsRequest extends js.Object {
  
  /**
    * The ControlID is a unique identifier string of your HomeRegionControl object.
    */
  var ControlId: js.UndefOr[typings.awsSdk.migrationhubconfigMod.ControlId] = js.native
  
  /**
    * The name of the home region you'd like to view.
    */
  var HomeRegion: js.UndefOr[typings.awsSdk.migrationhubconfigMod.HomeRegion] = js.native
  
  /**
    * The maximum number of filtering results to display per page. 
    */
  var MaxResults: js.UndefOr[DescribeHomeRegionControlsMaxResults] = js.native
  
  /**
    * If a NextToken was returned by a previous call, more results are available. To retrieve the next page of results, make the call again using the returned token in NextToken.
    */
  var NextToken: js.UndefOr[Token] = js.native
  
  /**
    * The target parameter specifies the identifier to which the home region is applied, which is always of type ACCOUNT. It applies the home region to the current ACCOUNT.
    */
  var Target: js.UndefOr[typings.awsSdk.migrationhubconfigMod.Target] = js.native
}
object DescribeHomeRegionControlsRequest {
  
  @scala.inline
  def apply(): DescribeHomeRegionControlsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHomeRegionControlsRequest]
  }
  
  @scala.inline
  implicit class DescribeHomeRegionControlsRequestOps[Self <: DescribeHomeRegionControlsRequest] (val x: Self) extends AnyVal {
    
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
    def setControlId(value: ControlId): Self = this.set("ControlId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControlId: Self = this.set("ControlId", js.undefined)
    
    @scala.inline
    def setHomeRegion(value: HomeRegion): Self = this.set("HomeRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomeRegion: Self = this.set("HomeRegion", js.undefined)
    
    @scala.inline
    def setMaxResults(value: DescribeHomeRegionControlsMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setTarget(value: Target): Self = this.set("Target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("Target", js.undefined)
  }
}
