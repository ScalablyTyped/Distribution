package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectStackSetDriftInput extends js.Object {
  /**
    *  The ID of the stack set operation. 
    */
  var OperationId: js.UndefOr[ClientRequestToken] = js.native
  var OperationPreferences: js.UndefOr[StackSetOperationPreferences] = js.native
  /**
    * The name of the stack set on which to perform the drift detection operation.
    */
  var StackSetName: StackSetNameOrId = js.native
}

object DetectStackSetDriftInput {
  @scala.inline
  def apply(
    StackSetName: StackSetNameOrId,
    OperationId: ClientRequestToken = null,
    OperationPreferences: StackSetOperationPreferences = null
  ): DetectStackSetDriftInput = {
    val __obj = js.Dynamic.literal(StackSetName = StackSetName.asInstanceOf[js.Any])
    if (OperationId != null) __obj.updateDynamic("OperationId")(OperationId.asInstanceOf[js.Any])
    if (OperationPreferences != null) __obj.updateDynamic("OperationPreferences")(OperationPreferences.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectStackSetDriftInput]
  }
}

