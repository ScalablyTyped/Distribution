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
  @scala.inline
  implicit class DescribeInputSecurityGroupRequestOps[Self <: DescribeInputSecurityGroupRequest] (val x: Self) extends AnyVal {
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
    def setInputSecurityGroupId(value: string): Self = this.set("InputSecurityGroupId", value.asInstanceOf[js.Any])
  }
  
}

