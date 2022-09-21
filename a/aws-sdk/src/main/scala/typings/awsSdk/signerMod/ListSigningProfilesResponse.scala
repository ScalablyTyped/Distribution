package typings.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSigningProfilesResponse extends StObject {
  
  /**
    * Value for specifying the next set of paginated results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A list of profiles that are available in the AWS account. This includes profiles with the status of CANCELED if the includeCanceled parameter is set to true.
    */
  var profiles: js.UndefOr[SigningProfiles] = js.undefined
}
object ListSigningProfilesResponse {
  
  inline def apply(): ListSigningProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSigningProfilesResponse]
  }
  
  extension [Self <: ListSigningProfilesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setProfiles(value: SigningProfiles): Self = StObject.set(x, "profiles", value.asInstanceOf[js.Any])
    
    inline def setProfilesUndefined: Self = StObject.set(x, "profiles", js.undefined)
    
    inline def setProfilesVarargs(value: SigningProfile*): Self = StObject.set(x, "profiles", js.Array(value*))
  }
}
