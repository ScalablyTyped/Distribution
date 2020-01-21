package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepTimeline extends js.Object {
  /**
    * The date and time when the cluster step was created.
    */
  var CreationDateTime: js.UndefOr[Date] = js.native
  /**
    * The date and time when the cluster step execution completed or failed.
    */
  var EndDateTime: js.UndefOr[Date] = js.native
  /**
    * The date and time when the cluster step execution started.
    */
  var StartDateTime: js.UndefOr[Date] = js.native
}

object StepTimeline {
  @scala.inline
  def apply(CreationDateTime: Date = null, EndDateTime: Date = null, StartDateTime: Date = null): StepTimeline = {
    val __obj = js.Dynamic.literal()
    if (CreationDateTime != null) __obj.updateDynamic("CreationDateTime")(CreationDateTime.asInstanceOf[js.Any])
    if (EndDateTime != null) __obj.updateDynamic("EndDateTime")(EndDateTime.asInstanceOf[js.Any])
    if (StartDateTime != null) __obj.updateDynamic("StartDateTime")(StartDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepTimeline]
  }
}

