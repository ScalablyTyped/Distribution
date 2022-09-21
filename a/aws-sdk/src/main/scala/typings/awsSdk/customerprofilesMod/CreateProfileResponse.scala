package typings.awsSdk.customerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProfileResponse extends StObject {
  
  /**
    * The unique identifier of a customer profile.
    */
  var ProfileId: uuid
}
object CreateProfileResponse {
  
  inline def apply(ProfileId: uuid): CreateProfileResponse = {
    val __obj = js.Dynamic.literal(ProfileId = ProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProfileResponse]
  }
  
  extension [Self <: CreateProfileResponse](x: Self) {
    
    inline def setProfileId(value: uuid): Self = StObject.set(x, "ProfileId", value.asInstanceOf[js.Any])
  }
}
