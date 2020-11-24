package typings.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGraphsResponse extends js.Object {
  
  /**
    * A list of behavior graphs that the account is a master for.
    */
  var GraphList: js.UndefOr[typings.awsSdk.detectiveMod.GraphList] = js.native
  
  /**
    * If there are more behavior graphs remaining in the results, then this is the pagination token to use to request the next page of behavior graphs.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object ListGraphsResponse {
  
  @scala.inline
  def apply(): ListGraphsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGraphsResponse]
  }
  
  @scala.inline
  implicit class ListGraphsResponseOps[Self <: ListGraphsResponse] (val x: Self) extends AnyVal {
    
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
    def setGraphListVarargs(value: Graph*): Self = this.set("GraphList", js.Array(value :_*))
    
    @scala.inline
    def setGraphList(value: GraphList): Self = this.set("GraphList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGraphList: Self = this.set("GraphList", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
