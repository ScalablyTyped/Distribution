package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceFleetTimeline extends js.Object {
  /**
    * The time and date the instance fleet was created.
    */
  var CreationDateTime: js.UndefOr[Date] = js.native
  /**
    * The time and date the instance fleet terminated.
    */
  var EndDateTime: js.UndefOr[Date] = js.native
  /**
    * The time and date the instance fleet was ready to run jobs.
    */
  var ReadyDateTime: js.UndefOr[Date] = js.native
}

object InstanceFleetTimeline {
  @scala.inline
  def apply(CreationDateTime: Date = null, EndDateTime: Date = null, ReadyDateTime: Date = null): InstanceFleetTimeline = {
    val __obj = js.Dynamic.literal()
    if (CreationDateTime != null) __obj.updateDynamic("CreationDateTime")(CreationDateTime.asInstanceOf[js.Any])
    if (EndDateTime != null) __obj.updateDynamic("EndDateTime")(EndDateTime.asInstanceOf[js.Any])
    if (ReadyDateTime != null) __obj.updateDynamic("ReadyDateTime")(ReadyDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceFleetTimeline]
  }
}

