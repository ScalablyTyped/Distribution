package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifySoftwareTokenResponse extends js.Object {
  /**
    * The session which should be passed both ways in challenge-response calls to the service.
    */
  var Session: js.UndefOr[SessionType] = js.native
  /**
    * The status of the verify software token.
    */
  var Status: js.UndefOr[VerifySoftwareTokenResponseType] = js.native
}

object VerifySoftwareTokenResponse {
  @scala.inline
  def apply(): VerifySoftwareTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifySoftwareTokenResponse]
  }
  @scala.inline
  implicit class VerifySoftwareTokenResponseOps[Self <: VerifySoftwareTokenResponse] (val x: Self) extends AnyVal {
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
    def setSession(value: SessionType): Self = this.set("Session", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession: Self = this.set("Session", js.undefined)
    @scala.inline
    def setStatus(value: VerifySoftwareTokenResponseType): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

