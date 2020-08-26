package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProjectsResult extends js.Object {
  /**
    * The continuation token to use when requesting the next set of results, if there are more results to be returned.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * A list of projects.
    */
  var projects: ProjectsList = js.native
}

object ListProjectsResult {
  @scala.inline
  def apply(projects: ProjectsList): ListProjectsResult = {
    val __obj = js.Dynamic.literal(projects = projects.asInstanceOf[js.Any])
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
    def setProjectsVarargs(value: ProjectSummary*): Self = this.set("projects", js.Array(value :_*))
    @scala.inline
    def setProjects(value: ProjectsList): Self = this.set("projects", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

