package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyVpcPeeringConnectionOptionsResult extends js.Object {
  /**
    * Information about the VPC peering connection options for the accepter VPC.
    */
  var AccepterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptions] = js.native
  /**
    * Information about the VPC peering connection options for the requester VPC.
    */
  var RequesterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptions] = js.native
}

object ModifyVpcPeeringConnectionOptionsResult {
  @scala.inline
  def apply(): ModifyVpcPeeringConnectionOptionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyVpcPeeringConnectionOptionsResult]
  }
  @scala.inline
  implicit class ModifyVpcPeeringConnectionOptionsResultOps[Self <: ModifyVpcPeeringConnectionOptionsResult] (val x: Self) extends AnyVal {
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
    def setAccepterPeeringConnectionOptions(value: PeeringConnectionOptions): Self = this.set("AccepterPeeringConnectionOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccepterPeeringConnectionOptions: Self = this.set("AccepterPeeringConnectionOptions", js.undefined)
    @scala.inline
    def setRequesterPeeringConnectionOptions(value: PeeringConnectionOptions): Self = this.set("RequesterPeeringConnectionOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequesterPeeringConnectionOptions: Self = this.set("RequesterPeeringConnectionOptions", js.undefined)
  }
  
}

