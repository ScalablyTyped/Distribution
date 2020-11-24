package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAppsListsResponse extends js.Object {
  
  /**
    * An array of AppsListDataSummary objects.
    */
  var AppsLists: js.UndefOr[AppsListsData] = js.native
  
  /**
    * If you specify a value for MaxResults in your list request, and you have more objects than the maximum, AWS Firewall Manager returns this token in the response. You can use this token in subsequent requests to retrieve the next batch of objects.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object ListAppsListsResponse {
  
  @scala.inline
  def apply(): ListAppsListsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAppsListsResponse]
  }
  
  @scala.inline
  implicit class ListAppsListsResponseOps[Self <: ListAppsListsResponse] (val x: Self) extends AnyVal {
    
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
    def setAppsListsVarargs(value: AppsListDataSummary*): Self = this.set("AppsLists", js.Array(value :_*))
    
    @scala.inline
    def setAppsLists(value: AppsListsData): Self = this.set("AppsLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppsLists: Self = this.set("AppsLists", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
