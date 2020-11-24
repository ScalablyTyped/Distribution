package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResolverQueryLogConfigAssociationsResponse extends js.Object {
  
  /**
    * If there are more than MaxResults query logging associations, you can submit another ListResolverQueryLogConfigAssociations request to get the next group of associations. In the next request, specify the value of NextToken from the previous response. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.route53resolverMod.NextToken] = js.native
  
  /**
    * A list that contains one ResolverQueryLogConfigAssociations element for each query logging association that matches the values that you specified for Filter.
    */
  var ResolverQueryLogConfigAssociations: js.UndefOr[ResolverQueryLogConfigAssociationList] = js.native
  
  /**
    * The total number of query logging associations that were created by the current account in the specified Region. This count can differ from the number of associations that are returned in a ListResolverQueryLogConfigAssociations response, depending on the values that you specify in the request.
    */
  var TotalCount: js.UndefOr[Count] = js.native
  
  /**
    * The total number of query logging associations that were created by the current account in the specified Region and that match the filters that were specified in the ListResolverQueryLogConfigAssociations request. For the total number of associations that were created by the current account in the specified Region, see TotalCount.
    */
  var TotalFilteredCount: js.UndefOr[Count] = js.native
}
object ListResolverQueryLogConfigAssociationsResponse {
  
  @scala.inline
  def apply(): ListResolverQueryLogConfigAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResolverQueryLogConfigAssociationsResponse]
  }
  
  @scala.inline
  implicit class ListResolverQueryLogConfigAssociationsResponseOps[Self <: ListResolverQueryLogConfigAssociationsResponse] (val x: Self) extends AnyVal {
    
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
    def setResolverQueryLogConfigAssociationsVarargs(value: ResolverQueryLogConfigAssociation*): Self = this.set("ResolverQueryLogConfigAssociations", js.Array(value :_*))
    
    @scala.inline
    def setResolverQueryLogConfigAssociations(value: ResolverQueryLogConfigAssociationList): Self = this.set("ResolverQueryLogConfigAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolverQueryLogConfigAssociations: Self = this.set("ResolverQueryLogConfigAssociations", js.undefined)
    
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
