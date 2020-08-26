package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelImportTaskResult extends js.Object {
  /**
    * The ID of the task being canceled.
    */
  var ImportTaskId: js.UndefOr[String] = js.native
  /**
    * The current state of the task being canceled.
    */
  var PreviousState: js.UndefOr[String] = js.native
  /**
    * The current state of the task being canceled.
    */
  var State: js.UndefOr[String] = js.native
}

object CancelImportTaskResult {
  @scala.inline
  def apply(): CancelImportTaskResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelImportTaskResult]
  }
  @scala.inline
  implicit class CancelImportTaskResultOps[Self <: CancelImportTaskResult] (val x: Self) extends AnyVal {
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
    def setImportTaskId(value: String): Self = this.set("ImportTaskId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportTaskId: Self = this.set("ImportTaskId", js.undefined)
    @scala.inline
    def setPreviousState(value: String): Self = this.set("PreviousState", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousState: Self = this.set("PreviousState", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
  
}

