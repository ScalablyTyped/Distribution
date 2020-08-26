package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSecurityProfileResponse extends js.Object {
  /**
    * The ARN of the security profile.
    */
  var securityProfileArn: js.UndefOr[SecurityProfileArn] = js.native
  /**
    * The name you gave to the security profile.
    */
  var securityProfileName: js.UndefOr[SecurityProfileName] = js.native
}

object CreateSecurityProfileResponse {
  @scala.inline
  def apply(): CreateSecurityProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSecurityProfileResponse]
  }
  @scala.inline
  implicit class CreateSecurityProfileResponseOps[Self <: CreateSecurityProfileResponse] (val x: Self) extends AnyVal {
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
    def setSecurityProfileArn(value: SecurityProfileArn): Self = this.set("securityProfileArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityProfileArn: Self = this.set("securityProfileArn", js.undefined)
    @scala.inline
    def setSecurityProfileName(value: SecurityProfileName): Self = this.set("securityProfileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityProfileName: Self = this.set("securityProfileName", js.undefined)
  }
  
}

