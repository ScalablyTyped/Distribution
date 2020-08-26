package typings.awsSdkClientGlacierNode.typesPolicyEnforcedExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyEnforcedExceptionDetails extends js.Object {
  /**
    * <p>PolicyEnforcedException</p>
    */
  var code: js.UndefOr[String] = js.native
  /**
    * <p>InitiateJob request denied by current data retrieval policy.</p>
    */
  var message: js.UndefOr[String] = js.native
  /**
    * <p>Client</p>
    */
  var `type`: js.UndefOr[String] = js.native
}

object PolicyEnforcedExceptionDetails {
  @scala.inline
  def apply(): PolicyEnforcedExceptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyEnforcedExceptionDetails]
  }
  @scala.inline
  implicit class PolicyEnforcedExceptionDetailsOps[Self <: PolicyEnforcedExceptionDetails] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

