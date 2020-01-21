package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachSecurityProfileRequest extends js.Object {
  /**
    * The security profile that is attached.
    */
  var securityProfileName: SecurityProfileName = js.native
  /**
    * The ARN of the target (thing group) to which the security profile is attached.
    */
  var securityProfileTargetArn: SecurityProfileTargetArn = js.native
}

object AttachSecurityProfileRequest {
  @scala.inline
  def apply(securityProfileName: SecurityProfileName, securityProfileTargetArn: SecurityProfileTargetArn): AttachSecurityProfileRequest = {
    val __obj = js.Dynamic.literal(securityProfileName = securityProfileName.asInstanceOf[js.Any], securityProfileTargetArn = securityProfileTargetArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AttachSecurityProfileRequest]
  }
}

