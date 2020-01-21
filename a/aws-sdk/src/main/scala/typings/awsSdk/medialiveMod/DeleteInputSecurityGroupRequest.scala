package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInputSecurityGroupRequest extends js.Object {
  /**
    * The Input Security Group to delete
    */
  var InputSecurityGroupId: string = js.native
}

object DeleteInputSecurityGroupRequest {
  @scala.inline
  def apply(InputSecurityGroupId: string): DeleteInputSecurityGroupRequest = {
    val __obj = js.Dynamic.literal(InputSecurityGroupId = InputSecurityGroupId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteInputSecurityGroupRequest]
  }
}

