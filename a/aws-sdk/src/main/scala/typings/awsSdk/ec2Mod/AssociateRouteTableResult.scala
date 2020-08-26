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
  def apply(): AssociateRouteTableResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateRouteTableResult]
  }
  @scala.inline
  implicit class AssociateRouteTableResultOps[Self <: AssociateRouteTableResult] (val x: Self) extends AnyVal {
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
    def setAssociationId(value: String): Self = this.set("AssociationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociationId: Self = this.set("AssociationId", js.undefined)
    @scala.inline
    def setAssociationState(value: RouteTableAssociationState): Self = this.set("AssociationState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociationState: Self = this.set("AssociationState", js.undefined)
  }
  
}

