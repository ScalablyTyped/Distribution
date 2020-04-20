package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateVpcCidrBlockRequest extends js.Object {
  /**
    * The association ID for the CIDR block.
    */
  var AssociationId: VpcCidrAssociationId = js.native
}

object DisassociateVpcCidrBlockRequest {
  @scala.inline
  def apply(AssociationId: VpcCidrAssociationId): DisassociateVpcCidrBlockRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateVpcCidrBlockRequest]
  }
}

