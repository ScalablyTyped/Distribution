package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FixedModeScheduleActionStartSettings extends js.Object {
  /**
    * Start time for the action to start in the channel. (Not the time for the action to be added to the schedule: actions are always added to the schedule immediately.) UTC format: yyyy-mm-ddThh:mm:ss.nnnZ. All the letters are digits (for example, mm might be 01) except for the two constants "T" for time and "Z" for "UTC format".
    */
  var Time: string = js.native
}

object FixedModeScheduleActionStartSettings {
  @scala.inline
  def apply(Time: string): FixedModeScheduleActionStartSettings = {
    val __obj = js.Dynamic.literal(Time = Time.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedModeScheduleActionStartSettings]
  }
  @scala.inline
  implicit class FixedModeScheduleActionStartSettingsOps[Self <: FixedModeScheduleActionStartSettings] (val x: Self) extends AnyVal {
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
    def setTime(value: string): Self = this.set("Time", value.asInstanceOf[js.Any])
  }
  
}

