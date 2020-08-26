package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateSubnetCidrBlockRequest extends js.Object {
  /**
    * The association ID for the CIDR block.
    */
  var AssociationId: SubnetCidrAssociationId = js.native
}

object DisassociateSubnetCidrBlockRequest {
  @scala.inline
  def apply(AssociationId: SubnetCidrAssociationId): DisassociateSubnetCidrBlockRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateSubnetCidrBlockRequest]
  }
  @scala.inline
  implicit class DisassociateSubnetCidrBlockRequestOps[Self <: DisassociateSubnetCidrBlockRequest] (val x: Self) extends AnyVal {
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
    def setAssociationId(value: SubnetCidrAssociationId): Self = this.set("AssociationId", value.asInstanceOf[js.Any])
  }
  
}

