package typings.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateNodeResponse extends js.Object {
  /**
    * Contains a token which can be passed to the DescribeNodeAssociationStatus API call to get the status of the disassociation request. 
    */
  var NodeAssociationStatusToken: js.UndefOr[typings.awsSdk.opsworkscmMod.NodeAssociationStatusToken] = js.native
}

object DisassociateNodeResponse {
  @scala.inline
  def apply(NodeAssociationStatusToken: NodeAssociationStatusToken = null): DisassociateNodeResponse = {
    val __obj = js.Dynamic.literal()
    if (NodeAssociationStatusToken != null) __obj.updateDynamic("NodeAssociationStatusToken")(NodeAssociationStatusToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateNodeResponse]
  }
}

