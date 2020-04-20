package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSecurityProfileRequest extends js.Object {
  /**
    * The name of the security profile whose information you want to get.
    */
  var securityProfileName: SecurityProfileName = js.native
}

object DescribeSecurityProfileRequest {
  @scala.inline
  def apply(securityProfileName: SecurityProfileName): DescribeSecurityProfileRequest = {
    val __obj = js.Dynamic.literal(securityProfileName = securityProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSecurityProfileRequest]
  }
}

