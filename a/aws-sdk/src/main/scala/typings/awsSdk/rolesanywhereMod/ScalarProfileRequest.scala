package typings.awsSdk.rolesanywhereMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScalarProfileRequest extends StObject {
  
  /**
    * The unique identifier of the profile.
    */
  var profileId: Uuid
}
object ScalarProfileRequest {
  
  inline def apply(profileId: Uuid): ScalarProfileRequest = {
    val __obj = js.Dynamic.literal(profileId = profileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalarProfileRequest]
  }
  
  extension [Self <: ScalarProfileRequest](x: Self) {
    
    inline def setProfileId(value: Uuid): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
  }
}
