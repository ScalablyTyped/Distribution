package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetTrigger extends js.Object {
  /**
    * The data set whose content creation triggers the creation of this data set's contents.
    */
  var dataset: js.UndefOr[TriggeringDataset] = js.native
  /**
    * The "Schedule" when the trigger is initiated.
    */
  var schedule: js.UndefOr[Schedule] = js.native
}

object DatasetTrigger {
  @scala.inline
  def apply(): DatasetTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetTrigger]
  }
  @scala.inline
  implicit class DatasetTriggerOps[Self <: DatasetTrigger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataset(value: TriggeringDataset): Self = this.set("dataset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataset: Self = this.set("dataset", js.undefined)
    @scala.inline
    def setSchedule(value: Schedule): Self = this.set("schedule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
  }
  
}

