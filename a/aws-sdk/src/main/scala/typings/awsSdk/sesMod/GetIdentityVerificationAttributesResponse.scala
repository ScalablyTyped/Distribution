package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIdentityVerificationAttributesResponse extends js.Object {
  /**
    * A map of Identities to IdentityVerificationAttributes objects.
    */
  var VerificationAttributes: typings.awsSdk.sesMod.VerificationAttributes = js.native
}

object GetIdentityVerificationAttributesResponse {
  @scala.inline
  def apply(VerificationAttributes: VerificationAttributes): GetIdentityVerificationAttributesResponse = {
    val __obj = js.Dynamic.literal(VerificationAttributes = VerificationAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityVerificationAttributesResponse]
  }
}

