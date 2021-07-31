package typings.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSigningProfileRequest extends StObject {
  
  /**
    * The name of the target signing profile.
    */
  var profileName: ProfileName
}
object GetSigningProfileRequest {
  
  @scala.inline
  def apply(profileName: ProfileName): GetSigningProfileRequest = {
    val __obj = js.Dynamic.literal(profileName = profileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSigningProfileRequest]
  }
  
  @scala.inline
  implicit class GetSigningProfileRequestMutableBuilder[Self <: GetSigningProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProfileName(value: ProfileName): Self = StObject.set(x, "profileName", value.asInstanceOf[js.Any])
  }
}
