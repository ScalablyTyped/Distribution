package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProfilesRequest extends StObject {
  
  /**
    * The maximum number of profiles to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsTransferMod.MaxResults] = js.undefined
  
  /**
    * When there are additional results that were not returned, a NextToken parameter is returned. You can use that value for a subsequent call to ListProfiles to continue listing results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsTransferMod.NextToken] = js.undefined
  
  /**
    * Indicates whether to list only LOCAL type profiles or only PARTNER type profiles. If not supplied in the request, the command lists all types of profiles.
    */
  var ProfileType: js.UndefOr[typings.awsSdk.clientsTransferMod.ProfileType] = js.undefined
}
object ListProfilesRequest {
  
  inline def apply(): ListProfilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProfilesRequest]
  }
  
  extension [Self <: ListProfilesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProfileType(value: ProfileType): Self = StObject.set(x, "ProfileType", value.asInstanceOf[js.Any])
    
    inline def setProfileTypeUndefined: Self = StObject.set(x, "ProfileType", js.undefined)
  }
}
