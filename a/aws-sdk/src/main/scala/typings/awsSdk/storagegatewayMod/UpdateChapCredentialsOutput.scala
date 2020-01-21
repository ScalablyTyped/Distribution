package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateChapCredentialsOutput extends js.Object {
  /**
    * The iSCSI initiator that connects to the target. This is the same initiator name specified in the request.
    */
  var InitiatorName: js.UndefOr[IqnName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the target. This is the same target specified in the request.
    */
  var TargetARN: js.UndefOr[typings.awsSdk.storagegatewayMod.TargetARN] = js.native
}

object UpdateChapCredentialsOutput {
  @scala.inline
  def apply(InitiatorName: IqnName = null, TargetARN: TargetARN = null): UpdateChapCredentialsOutput = {
    val __obj = js.Dynamic.literal()
    if (InitiatorName != null) __obj.updateDynamic("InitiatorName")(InitiatorName.asInstanceOf[js.Any])
    if (TargetARN != null) __obj.updateDynamic("TargetARN")(TargetARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateChapCredentialsOutput]
  }
}

