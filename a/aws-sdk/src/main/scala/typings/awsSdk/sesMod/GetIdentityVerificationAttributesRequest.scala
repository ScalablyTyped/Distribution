package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIdentityVerificationAttributesRequest extends js.Object {
  /**
    * A list of identities.
    */
  var Identities: IdentityList = js.native
}

object GetIdentityVerificationAttributesRequest {
  @scala.inline
  def apply(Identities: IdentityList): GetIdentityVerificationAttributesRequest = {
    val __obj = js.Dynamic.literal(Identities = Identities.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityVerificationAttributesRequest]
  }
}

