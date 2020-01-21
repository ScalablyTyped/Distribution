package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInputSecurityGroupRequest extends js.Object {
  /**
    * The id of the Input Security Group to describe
    */
  var InputSecurityGroupId: string = js.native
}

object DescribeInputSecurityGroupRequest {
  @scala.inline
  def apply(InputSecurityGroupId: string): DescribeInputSecurityGroupRequest = {
    val __obj = js.Dynamic.literal(InputSecurityGroupId = InputSecurityGroupId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeInputSecurityGroupRequest]
  }
}

