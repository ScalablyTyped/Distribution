package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpcPeeringAuthorizationsOutput extends js.Object {
  /**
    * A collection of objects that describe all valid VPC peering operations for the current AWS account.
    */
  var VpcPeeringAuthorizations: js.UndefOr[VpcPeeringAuthorizationList] = js.native
}

object DescribeVpcPeeringAuthorizationsOutput {
  @scala.inline
  def apply(): DescribeVpcPeeringAuthorizationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcPeeringAuthorizationsOutput]
  }
  @scala.inline
  implicit class DescribeVpcPeeringAuthorizationsOutputOps[Self <: DescribeVpcPeeringAuthorizationsOutput] (val x: Self) extends AnyVal {
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
    def setVpcPeeringAuthorizationsVarargs(value: VpcPeeringAuthorization*): Self = this.set("VpcPeeringAuthorizations", js.Array(value :_*))
    @scala.inline
    def setVpcPeeringAuthorizations(value: VpcPeeringAuthorizationList): Self = this.set("VpcPeeringAuthorizations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcPeeringAuthorizations: Self = this.set("VpcPeeringAuthorizations", js.undefined)
  }
  
}

