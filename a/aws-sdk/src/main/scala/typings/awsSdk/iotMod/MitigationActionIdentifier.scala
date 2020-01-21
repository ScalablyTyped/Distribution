package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MitigationActionIdentifier extends js.Object {
  /**
    * The IAM role ARN used to apply this mitigation action.
    */
  var actionArn: js.UndefOr[MitigationActionArn] = js.native
  /**
    * The friendly name of the mitigation action.
    */
  var actionName: js.UndefOr[MitigationActionName] = js.native
  /**
    * The date when this mitigation action was created.
    */
  var creationDate: js.UndefOr[Timestamp] = js.native
}

object MitigationActionIdentifier {
  @scala.inline
  def apply(
    actionArn: MitigationActionArn = null,
    actionName: MitigationActionName = null,
    creationDate: Timestamp = null
  ): MitigationActionIdentifier = {
    val __obj = js.Dynamic.literal()
    if (actionArn != null) __obj.updateDynamic("actionArn")(actionArn.asInstanceOf[js.Any])
    if (actionName != null) __obj.updateDynamic("actionName")(actionName.asInstanceOf[js.Any])
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MitigationActionIdentifier]
  }
}

