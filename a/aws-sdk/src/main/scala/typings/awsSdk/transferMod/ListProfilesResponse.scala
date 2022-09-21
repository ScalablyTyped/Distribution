package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProfilesResponse extends StObject {
  
  /**
    * Returns a token that you can use to call ListProfiles again and receive additional results, if there are any.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transferMod.NextToken] = js.undefined
  
  /**
    * Returns an array, where each item contains the details of a profile.
    */
  var Profiles: ListedProfiles
}
object ListProfilesResponse {
  
  inline def apply(Profiles: ListedProfiles): ListProfilesResponse = {
    val __obj = js.Dynamic.literal(Profiles = Profiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProfilesResponse]
  }
  
  extension [Self <: ListProfilesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProfiles(value: ListedProfiles): Self = StObject.set(x, "Profiles", value.asInstanceOf[js.Any])
    
    inline def setProfilesVarargs(value: ListedProfile*): Self = StObject.set(x, "Profiles", js.Array(value*))
  }
}
