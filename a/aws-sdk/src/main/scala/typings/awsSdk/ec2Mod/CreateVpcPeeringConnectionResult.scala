package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVpcPeeringConnectionResult extends js.Object {
  /**
    * Information about the VPC peering connection.
    */
  var VpcPeeringConnection: js.UndefOr[typings.awsSdk.ec2Mod.VpcPeeringConnection] = js.native
}

object CreateVpcPeeringConnectionResult {
  @scala.inline
  def apply(): CreateVpcPeeringConnectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVpcPeeringConnectionResult]
  }
  @scala.inline
  implicit class CreateVpcPeeringConnectionResultOps[Self <: CreateVpcPeeringConnectionResult] (val x: Self) extends AnyVal {
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
    def setVpcPeeringConnection(value: VpcPeeringConnection): Self = this.set("VpcPeeringConnection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcPeeringConnection: Self = this.set("VpcPeeringConnection", js.undefined)
  }
  
}

