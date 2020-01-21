package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelSigningProfileRequest extends js.Object {
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
}

