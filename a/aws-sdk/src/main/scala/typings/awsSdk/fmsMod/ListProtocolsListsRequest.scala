package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProtocolsListsRequest extends js.Object {
  
  /**
    * Specifies whether the lists to retrieve are default lists owned by AWS Firewall Manager.
    */
  var DefaultLists: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum number of objects that you want AWS Firewall Manager to return for this request. If more objects are available, in the response, AWS Firewall Manager provides a NextToken value that you can use in a subsequent call to get the next batch of objects. If you don't specify this, AWS Firewall Manager returns all available objects.
    */
  var MaxResults: PaginationMaxResults = js.native
  
  /**
    * If you specify a value for MaxResults in your list request, and you have more objects than the maximum, AWS Firewall Manager returns this token in the response. For all but the first request, you provide the token returned by the prior request in the request parameters, to retrieve the next batch of objects.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object ListProtocolsListsRequest {
  
  @scala.inline
  def apply(MaxResults: PaginationMaxResults): ListProtocolsListsRequest = {
    val __obj = js.Dynamic.literal(MaxResults = MaxResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProtocolsListsRequest]
  }
  
  @scala.inline
  implicit class ListProtocolsListsRequestOps[Self <: ListProtocolsListsRequest] (val x: Self) extends AnyVal {
    
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
    def setMaxResults(value: PaginationMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLists(value: Boolean): Self = this.set("DefaultLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLists: Self = this.set("DefaultLists", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
