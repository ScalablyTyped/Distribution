package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTestGridProjectsResult extends js.Object {
  
  /**
    * Used for pagination. Pass into ListTestGridProjects to get more results in a paginated request.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The list of TestGridProjects, based on a ListTestGridProjectsRequest.
    */
  var testGridProjects: js.UndefOr[TestGridProjects] = js.native
}
object ListTestGridProjectsResult {
  
  @scala.inline
  def apply(): ListTestGridProjectsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTestGridProjectsResult]
  }
  
  @scala.inline
  implicit class ListTestGridProjectsResultOps[Self <: ListTestGridProjectsResult] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setTestGridProjectsVarargs(value: TestGridProject*): Self = this.set("testGridProjects", js.Array(value :_*))
    
    @scala.inline
    def setTestGridProjects(value: TestGridProjects): Self = this.set("testGridProjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestGridProjects: Self = this.set("testGridProjects", js.undefined)
  }
}
