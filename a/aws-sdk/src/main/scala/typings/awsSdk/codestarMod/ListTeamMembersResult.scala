package typings.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTeamMembersResult extends StObject {
  
  /**
    * The continuation token to use when requesting the next set of results, if there are more results to be returned.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * A list of team member objects for the project.
    */
  var teamMembers: TeamMemberResult
}
object ListTeamMembersResult {
  
  inline def apply(teamMembers: TeamMemberResult): ListTeamMembersResult = {
    val __obj = js.Dynamic.literal(teamMembers = teamMembers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTeamMembersResult]
  }
  
  extension [Self <: ListTeamMembersResult](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTeamMembers(value: TeamMemberResult): Self = StObject.set(x, "teamMembers", value.asInstanceOf[js.Any])
    
    inline def setTeamMembersVarargs(value: TeamMember*): Self = StObject.set(x, "teamMembers", js.Array(value*))
  }
}
