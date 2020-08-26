package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSecurityProfileRequest extends js.Object {
  /**
    * The expected version of the security profile. A new version is generated whenever the security profile is updated. If you specify a value that is different from the actual version, a VersionConflictException is thrown.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.native
  /**
    * The name of the security profile to be deleted.
    */
  var securityProfileName: SecurityProfileName = js.native
}

object DeleteSecurityProfileRequest {
  @scala.inline
  def apply(securityProfileName: SecurityProfileName): DeleteSecurityProfileRequest = {
    val __obj = js.Dynamic.literal(securityProfileName = securityProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSecurityProfileRequest]
  }
  @scala.inline
  implicit class DeleteSecurityProfileRequestOps[Self <: DeleteSecurityProfileRequest] (val x: Self) extends AnyVal {
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
    def setExpectedVersion(value: OptionalVersion): Self = this.set("expectedVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpectedVersion: Self = this.set("expectedVersion", js.undefined)
  }
  
}

