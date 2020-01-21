package typings.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateNodeResponse extends js.Object {
  /**
    * Contains a token which can be passed to the DescribeNodeAssociationStatus API call to get the status of the association request. 
    */
  var NodeAssociationStatusToken: js.UndefOr[typings.awsSdk.opsworkscmMod.NodeAssociationStatusToken] = js.native
}

object AssociateNodeResponse {
  @scala.inline
  def apply(NodeAssociationStatusToken: NodeAssociationStatusToken = null): AssociateNodeResponse = {
    val __obj = js.Dynamic.literal()
    if (NodeAssociationStatusToken != null) __obj.updateDynamic("NodeAssociationStatusToken")(NodeAssociationStatusToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateNodeResponse]
  }
}

