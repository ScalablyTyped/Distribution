package typings.awsSdk.ioteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectorStateSummary extends js.Object {
  /**
    * The name of the state.
    */
  var stateName: js.UndefOr[StateName] = js.native
}

object DetectorStateSummary {
  @scala.inline
  def apply(stateName: StateName = null): DetectorStateSummary = {
    val __obj = js.Dynamic.literal()
    if (stateName != null) __obj.updateDynamic("stateName")(stateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectorStateSummary]
  }
}

