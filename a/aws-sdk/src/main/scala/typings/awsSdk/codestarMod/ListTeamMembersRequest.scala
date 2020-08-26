package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTeamMembersRequest extends js.Object {
  /**
    * The maximum number of team members you want returned in a response.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The continuation token for the next set of results, if the results cannot be returned in one response.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The ID of the project for which you want to list team members.
    */
  var projectId: ProjectId = js.native
}

object ListTeamMembersRequest {
  @scala.inline
  def apply(projectId: ProjectId): ListTeamMembersRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTeamMembersRequest]
  }
  @scala.inline
  implicit class ListTeamMembersRequestOps[Self <: ListTeamMembersRequest] (val x: Self) extends AnyVal {
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
    def setProjectId(value: ProjectId): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

