package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachSecurityProfileRequest extends js.Object {
  /**
    * The security profile that is detached.
    */
  var securityProfileName: SecurityProfileName = js.native
  /**
    * The ARN of the thing group from which the security profile is detached.
    */
  var securityProfileTargetArn: SecurityProfileTargetArn = js.native
}

object DetachSecurityProfileRequest {
  @scala.inline
  def apply(securityProfileName: SecurityProfileName, securityProfileTargetArn: SecurityProfileTargetArn): DetachSecurityProfileRequest = {
    val __obj = js.Dynamic.literal(securityProfileName = securityProfileName.asInstanceOf[js.Any], securityProfileTargetArn = securityProfileTargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachSecurityProfileRequest]
  }
  @scala.inline
  implicit class DetachSecurityProfileRequestOps[Self <: DetachSecurityProfileRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSecurityProfileName(value: SecurityProfileName): Self = this.set("securityProfileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityProfileTargetArn(value: SecurityProfileTargetArn): Self = this.set("securityProfileTargetArn", value.asInstanceOf[js.Any])
  }
  
}

