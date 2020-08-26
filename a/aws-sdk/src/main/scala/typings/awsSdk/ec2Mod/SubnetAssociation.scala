package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubnetAssociation extends js.Object {
  /**
    * The state of the subnet association.
    */
  var State: js.UndefOr[TransitGatewayMulitcastDomainAssociationState] = js.native
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[String] = js.native
}

object SubnetAssociation {
  @scala.inline
  def apply(): SubnetAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubnetAssociation]
  }
  @scala.inline
  implicit class SubnetAssociationOps[Self <: SubnetAssociation] (val x: Self) extends AnyVal {
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
    def setState(value: TransitGatewayMulitcastDomainAssociationState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setSubnetId(value: String): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetId: Self = this.set("SubnetId", js.undefined)
  }
  
}

