package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotifyWorkersResponse extends js.Object {
  /**
    *  When MTurk sends notifications to the list of Workers, it returns back any failures it encounters in this list of NotifyWorkersFailureStatus objects. 
    */
  var NotifyWorkersFailureStatuses: js.UndefOr[NotifyWorkersFailureStatusList] = js.native
}

object NotifyWorkersResponse {
  @scala.inline
  def apply(): NotifyWorkersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifyWorkersResponse]
  }
  @scala.inline
  implicit class NotifyWorkersResponseOps[Self <: NotifyWorkersResponse] (val x: Self) extends AnyVal {
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
    def setNotifyWorkersFailureStatusesVarargs(value: NotifyWorkersFailureStatus*): Self = this.set("NotifyWorkersFailureStatuses", js.Array(value :_*))
    @scala.inline
    def setNotifyWorkersFailureStatuses(value: NotifyWorkersFailureStatusList): Self = this.set("NotifyWorkersFailureStatuses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotifyWorkersFailureStatuses: Self = this.set("NotifyWorkersFailureStatuses", js.undefined)
  }
  
}

