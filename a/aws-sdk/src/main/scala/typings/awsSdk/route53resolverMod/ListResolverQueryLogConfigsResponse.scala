package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResolverQueryLogConfigsResponse extends js.Object {
  
  /**
    * If there are more than MaxResults query logging configurations, you can submit another ListResolverQueryLogConfigs request to get the next group of configurations. In the next request, specify the value of NextToken from the previous response. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.route53resolverMod.NextToken] = js.native
  
  /**
    * A list that contains one ResolverQueryLogConfig element for each query logging configuration that matches the values that you specified for Filter.
    */
  var ResolverQueryLogConfigs: js.UndefOr[ResolverQueryLogConfigList] = js.native
  
  /**
    * The total number of query logging configurations that were created by the current account in the specified Region. This count can differ from the number of query logging configurations that are returned in a ListResolverQueryLogConfigs response, depending on the values that you specify in the request.
    */
  var TotalCount: js.UndefOr[Count] = js.native
  
  /**
    * The total number of query logging configurations that were created by the current account in the specified Region and that match the filters that were specified in the ListResolverQueryLogConfigs request. For the total number of query logging configurations that were created by the current account in the specified Region, see TotalCount.
    */
  var TotalFilteredCount: js.UndefOr[Count] = js.native
}
object ListResolverQueryLogConfigsResponse {
  
  @scala.inline
  def apply(): ListResolverQueryLogConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResolverQueryLogConfigsResponse]
  }
  
  @scala.inline
  implicit class ListResolverQueryLogConfigsResponseOps[Self <: ListResolverQueryLogConfigsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setResolverQueryLogConfigsVarargs(value: ResolverQueryLogConfig*): Self = this.set("ResolverQueryLogConfigs", js.Array(value :_*))
    
    @scala.inline
    def setResolverQueryLogConfigs(value: ResolverQueryLogConfigList): Self = this.set("ResolverQueryLogConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolverQueryLogConfigs: Self = this.set("ResolverQueryLogConfigs", js.undefined)
    
    @scala.inline
    def setTotalCount(value: Count): Self = this.set("TotalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalCount: Self = this.set("TotalCount", js.undefined)
    
    @scala.inline
    def setTotalFilteredCount(value: Count): Self = this.set("TotalFilteredCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalFilteredCount: Self = this.set("TotalFilteredCount", js.undefined)
  }
}
