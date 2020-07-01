package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyDetails extends js.Object {
  /**
    * The action that occurred and produced the finding.
    */
  var action: js.UndefOr[FindingAction] = js.native
  /**
    * The entity that performed the action that produced the finding.
    */
  var actor: js.UndefOr[FindingActor] = js.native
}

object PolicyDetails {
  @scala.inline
  def apply(action: FindingAction = null, actor: FindingActor = null): PolicyDetails = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (actor != null) __obj.updateDynamic("actor")(actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyDetails]
  }
}

