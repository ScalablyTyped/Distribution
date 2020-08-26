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
  @scala.inline
  implicit class GetIdentityVerificationAttributesResponseOps[Self <: GetIdentityVerificationAttributesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setVerificationAttributes(value: VerificationAttributes): Self = this.set("VerificationAttributes", value.asInstanceOf[js.Any])
  }
  
}

