package typings.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelSigningProfileRequest extends StObject {
  
  /**
    * The name of the signing profile to be canceled.
    */
  var profileName: ProfileName = js.native
}
object CancelSigningProfileRequest {
  
  @scala.inline
  def apply(profileName: ProfileName): CancelSigningProfileRequest = {
    val __obj = js.Dynamic.literal(profileName = profileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelSigningProfileRequest]
  }
  
  @scala.inline
  implicit class CancelSigningProfileRequestMutableBuilder[Self <: CancelSigningProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProfileName(value: ProfileName): Self = StObject.set(x, "profileName", value.asInstanceOf[js.Any])
  }
}
