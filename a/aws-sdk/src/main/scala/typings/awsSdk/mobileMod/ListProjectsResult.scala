package typings.awsSdk.mobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProjectsResult extends js.Object {
  
  var nextToken: js.UndefOr[NextToken] = js.native
  
  var projects: js.UndefOr[ProjectSummaries] = js.native
}
object ListProjectsResult {
  
  @scala.inline
  def apply(): ListProjectsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProjectsResult]
  }
  
  @scala.inline
  implicit class ListProjectsResultOps[Self <: ListProjectsResult] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setProjectsVarargs(value: ProjectSummary*): Self = this.set("projects", js.Array(value :_*))
    
    @scala.inline
    def setProjects(value: ProjectSummaries): Self = this.set("projects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjects: Self = this.set("projects", js.undefined)
  }
}
