package typings.awsSdk.rolesanywhereMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProfilesResponse extends StObject {
  
  /**
    * A token that indicates where the output should continue from, if a previous operation did not show all results. To get the next results, call the operation again with this value.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of profiles.
    */
  var profiles: js.UndefOr[ProfileDetails] = js.undefined
}
object ListProfilesResponse {
  
  inline def apply(): ListProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProfilesResponse]
  }
  
  extension [Self <: ListProfilesResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setProfiles(value: ProfileDetails): Self = StObject.set(x, "profiles", value.asInstanceOf[js.Any])
    
    inline def setProfilesUndefined: Self = StObject.set(x, "profiles", js.undefined)
    
    inline def setProfilesVarargs(value: ProfileDetail*): Self = StObject.set(x, "profiles", js.Array(value*))
  }
}
