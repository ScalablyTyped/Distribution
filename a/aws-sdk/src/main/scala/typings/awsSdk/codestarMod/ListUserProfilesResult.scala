package typings.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUserProfilesResult extends StObject {
  
  /**
    * The continuation token to use when requesting the next set of results, if there are more results to be returned.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * All the user profiles configured in AWS CodeStar for an AWS account.
    */
  var userProfiles: UserProfilesList
}
object ListUserProfilesResult {
  
  @scala.inline
  def apply(userProfiles: UserProfilesList): ListUserProfilesResult = {
    val __obj = js.Dynamic.literal(userProfiles = userProfiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUserProfilesResult]
  }
  
  @scala.inline
  implicit class ListUserProfilesResultMutableBuilder[Self <: ListUserProfilesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setUserProfiles(value: UserProfilesList): Self = StObject.set(x, "userProfiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProfilesVarargs(value: UserProfileSummary*): Self = StObject.set(x, "userProfiles", js.Array(value :_*))
  }
}
