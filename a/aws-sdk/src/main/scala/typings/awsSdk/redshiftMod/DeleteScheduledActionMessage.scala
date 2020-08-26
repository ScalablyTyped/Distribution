package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteScheduledActionMessage extends js.Object {
  /**
    * The name of the scheduled action to delete. 
    */
  var ScheduledActionName: String = js.native
}

object DeleteScheduledActionMessage {
  @scala.inline
  def apply(ScheduledActionName: String): DeleteScheduledActionMessage = {
    val __obj = js.Dynamic.literal(ScheduledActionName = ScheduledActionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteScheduledActionMessage]
  }
  @scala.inline
  implicit class DeleteScheduledActionMessageOps[Self <: DeleteScheduledActionMessage] (val x: Self) extends AnyVal {
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
    def setScheduledActionName(value: String): Self = this.set("ScheduledActionName", value.asInstanceOf[js.Any])
  }
  
}

