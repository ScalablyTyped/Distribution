package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifySnapshotScheduleMessage extends js.Object {
  /**
    * An updated list of schedule definitions. A schedule definition is made up of schedule expressions, for example, "cron(30 12 *)" or "rate(12 hours)".
    */
  var ScheduleDefinitions: ScheduleDefinitionList = js.native
  /**
    * A unique alphanumeric identifier of the schedule to modify.
    */
  var ScheduleIdentifier: String = js.native
}

object ModifySnapshotScheduleMessage {
  @scala.inline
  def apply(ScheduleDefinitions: ScheduleDefinitionList, ScheduleIdentifier: String): ModifySnapshotScheduleMessage = {
    val __obj = js.Dynamic.literal(ScheduleDefinitions = ScheduleDefinitions.asInstanceOf[js.Any], ScheduleIdentifier = ScheduleIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifySnapshotScheduleMessage]
  }
  @scala.inline
  implicit class ModifySnapshotScheduleMessageOps[Self <: ModifySnapshotScheduleMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setScheduleDefinitionsVarargs(value: String*): Self = this.set("ScheduleDefinitions", js.Array(value :_*))
    @scala.inline
    def setScheduleDefinitions(value: ScheduleDefinitionList): Self = this.set("ScheduleDefinitions", value.asInstanceOf[js.Any])
    @scala.inline
    def setScheduleIdentifier(value: String): Self = this.set("ScheduleIdentifier", value.asInstanceOf[js.Any])
  }
  
}

