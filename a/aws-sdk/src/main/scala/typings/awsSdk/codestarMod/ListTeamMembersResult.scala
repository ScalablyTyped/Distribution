package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTeamMembersResult extends js.Object {
  
  /**
    * The continuation token to use when requesting the next set of results, if there are more results to be returned.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * A list of team member objects for the project.
    */
  var teamMembers: TeamMemberResult = js.native
}
object ListTeamMembersResult {
  
  @scala.inline
  def apply(teamMembers: TeamMemberResult): ListTeamMembersResult = {
    val __obj = js.Dynamic.literal(teamMembers = teamMembers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTeamMembersResult]
  }
  
  @scala.inline
  implicit class ListTeamMembersResultOps[Self <: ListTeamMembersResult] (val x: Self) extends AnyVal {
    
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
    def setTeamMembersVarargs(value: TeamMember*): Self = this.set("teamMembers", js.Array(value :_*))
    
    @scala.inline
    def setTeamMembers(value: TeamMemberResult): Self = this.set("teamMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
