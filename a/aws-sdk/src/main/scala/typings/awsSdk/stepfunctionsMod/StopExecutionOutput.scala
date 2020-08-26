package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopExecutionOutput extends js.Object {
  /**
    * The date the execution is stopped.
    */
  var stopDate: Timestamp = js.native
}

object StopExecutionOutput {
  @scala.inline
  def apply(stopDate: Timestamp): StopExecutionOutput = {
    val __obj = js.Dynamic.literal(stopDate = stopDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopExecutionOutput]
  }
  @scala.inline
  implicit class StopExecutionOutputOps[Self <: StopExecutionOutput] (val x: Self) extends AnyVal {
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
    def setStopDate(value: Timestamp): Self = this.set("stopDate", value.asInstanceOf[js.Any])
  }
  
}

