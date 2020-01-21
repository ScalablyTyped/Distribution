package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateRouteTableResult extends js.Object {
  /**
    * The route table association ID. This ID is required for disassociating the route table.
    */
  var AssociationId: js.UndefOr[String] = js.native
  /**
    * The state of the association.
    */
  var AssociationState: js.UndefOr[RouteTableAssociationState] = js.native
}

object AssociateRouteTableResult {
  @scala.inline
  def apply(AssociationId: String = null, AssociationState: RouteTableAssociationState = null): AssociateRouteTableResult = {
    val __obj = js.Dynamic.literal()
    if (AssociationId != null) __obj.updateDynamic("AssociationId")(AssociationId.asInstanceOf[js.Any])
    if (AssociationState != null) __obj.updateDynamic("AssociationState")(AssociationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateRouteTableResult]
  }
}

