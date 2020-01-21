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
}

