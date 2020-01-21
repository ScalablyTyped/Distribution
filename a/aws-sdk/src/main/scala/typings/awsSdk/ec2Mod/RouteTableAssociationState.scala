package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteTableAssociationState extends js.Object {
  /**
    * The state of the association.
    */
  var State: js.UndefOr[RouteTableAssociationStateCode] = js.native
  /**
    * The status message, if applicable.
    */
  var StatusMessage: js.UndefOr[String] = js.native
}

object RouteTableAssociationState {
  @scala.inline
  def apply(State: RouteTableAssociationStateCode = null, StatusMessage: String = null): RouteTableAssociationState = {
    val __obj = js.Dynamic.literal()
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteTableAssociationState]
  }
}

