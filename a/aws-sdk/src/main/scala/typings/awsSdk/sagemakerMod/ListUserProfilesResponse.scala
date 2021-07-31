package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUserProfilesResponse extends StObject {
  
  /**
    * If the previous response was truncated, you will receive this token. Use it in your next request to receive the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
  
  /**
    * The list of user profiles.
    */
  var UserProfiles: js.UndefOr[UserProfileList] = js.undefined
}
object ListUserProfilesResponse {
  
  @scala.inline
  def apply(): ListUserProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserProfilesResponse]
  }
  
  @scala.inline
  implicit class ListUserProfilesResponseMutableBuilder[Self <: ListUserProfilesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setUserProfiles(value: UserProfileList): Self = StObject.set(x, "UserProfiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProfilesUndefined: Self = StObject.set(x, "UserProfiles", js.undefined)
    
    @scala.inline
    def setUserProfilesVarargs(value: UserProfileDetails*): Self = StObject.set(x, "UserProfiles", js.Array(value :_*))
  }
}
