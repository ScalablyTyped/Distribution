package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProfileRequest extends StObject {
  
  /**
    * An array of identifiers for the imported certificates. You use this identifier for working with profiles and partner profiles.
    */
  var CertificateIds: js.UndefOr[typings.awsSdk.transferMod.CertificateIds] = js.undefined
  
  /**
    * The identifier of the profile object that you are updating.
    */
  var ProfileId: typings.awsSdk.transferMod.ProfileId
}
object UpdateProfileRequest {
  
  inline def apply(ProfileId: ProfileId): UpdateProfileRequest = {
    val __obj = js.Dynamic.literal(ProfileId = ProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProfileRequest]
  }
  
  extension [Self <: UpdateProfileRequest](x: Self) {
    
    inline def setCertificateIds(value: CertificateIds): Self = StObject.set(x, "CertificateIds", value.asInstanceOf[js.Any])
    
    inline def setCertificateIdsUndefined: Self = StObject.set(x, "CertificateIds", js.undefined)
    
    inline def setCertificateIdsVarargs(value: CertificateId*): Self = StObject.set(x, "CertificateIds", js.Array(value*))
    
    inline def setProfileId(value: ProfileId): Self = StObject.set(x, "ProfileId", value.asInstanceOf[js.Any])
  }
}
