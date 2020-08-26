package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceRouteTableAssociationResult extends js.Object {
  /**
    * The state of the association.
    */
  var AssociationState: js.UndefOr[RouteTableAssociationState] = js.native
  /**
    * The ID of the new association.
    */
  var NewAssociationId: js.UndefOr[String] = js.native
}

object ReplaceRouteTableAssociationResult {
  @scala.inline
  def apply(): ReplaceRouteTableAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceRouteTableAssociationResult]
  }
  @scala.inline
  implicit class ReplaceRouteTableAssociationResultOps[Self <: ReplaceRouteTableAssociationResult] (val x: Self) extends AnyVal {
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
    def setAssociationState(value: RouteTableAssociationState): Self = this.set("AssociationState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociationState: Self = this.set("AssociationState", js.undefined)
    @scala.inline
    def setNewAssociationId(value: String): Self = this.set("NewAssociationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewAssociationId: Self = this.set("NewAssociationId", js.undefined)
  }
  
}

