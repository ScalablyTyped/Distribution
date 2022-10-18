package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProfileResponse extends StObject {
  
  /**
    * The unique identifier for the AS2 profile, returned after the API call succeeds.
    */
  var ProfileId: typings.awsSdk.clientsTransferMod.ProfileId
}
object CreateProfileResponse {
  
  inline def apply(ProfileId: ProfileId): CreateProfileResponse = {
    val __obj = js.Dynamic.literal(ProfileId = ProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProfileResponse]
  }
  
  extension [Self <: CreateProfileResponse](x: Self) {
    
    inline def setProfileId(value: ProfileId): Self = StObject.set(x, "ProfileId", value.asInstanceOf[js.Any])
  }
}
