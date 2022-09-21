package typings.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSigningProfileRequest extends StObject {
  
  /**
    * The name of the target signing profile.
    */
  var profileName: ProfileName
  
  /**
    * The AWS account ID of the profile owner.
    */
  var profileOwner: js.UndefOr[AccountId] = js.undefined
}
object GetSigningProfileRequest {
  
  inline def apply(profileName: ProfileName): GetSigningProfileRequest = {
    val __obj = js.Dynamic.literal(profileName = profileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSigningProfileRequest]
  }
  
  extension [Self <: GetSigningProfileRequest](x: Self) {
    
    inline def setProfileName(value: ProfileName): Self = StObject.set(x, "profileName", value.asInstanceOf[js.Any])
    
    inline def setProfileOwner(value: AccountId): Self = StObject.set(x, "profileOwner", value.asInstanceOf[js.Any])
    
    inline def setProfileOwnerUndefined: Self = StObject.set(x, "profileOwner", js.undefined)
  }
}
