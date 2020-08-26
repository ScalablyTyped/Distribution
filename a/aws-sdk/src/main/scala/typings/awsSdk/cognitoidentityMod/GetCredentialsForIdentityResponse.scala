package typings.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCredentialsForIdentityResponse extends js.Object {
  /**
    * Credentials for the provided identity ID.
    */
  var Credentials: js.UndefOr[typings.awsSdk.cognitoidentityMod.Credentials] = js.native
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: js.UndefOr[typings.awsSdk.cognitoidentityMod.IdentityId] = js.native
}

object GetCredentialsForIdentityResponse {
  @scala.inline
  def apply(): GetCredentialsForIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCredentialsForIdentityResponse]
  }
  @scala.inline
  implicit class GetCredentialsForIdentityResponseOps[Self <: GetCredentialsForIdentityResponse] (val x: Self) extends AnyVal {
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
    def setCredentials(value: Credentials): Self = this.set("Credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentials: Self = this.set("Credentials", js.undefined)
    @scala.inline
    def setIdentityId(value: IdentityId): Self = this.set("IdentityId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityId: Self = this.set("IdentityId", js.undefined)
  }
  
}

