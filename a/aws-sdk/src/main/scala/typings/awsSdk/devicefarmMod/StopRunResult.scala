package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopRunResult extends js.Object {
  /**
    * The run that was stopped.
    */
  var run: js.UndefOr[Run] = js.native
}

object StopRunResult {
  @scala.inline
  def apply(): StopRunResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopRunResult]
  }
  @scala.inline
  implicit class StopRunResultOps[Self <: StopRunResult] (val x: Self) extends AnyVal {
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
    def setRun(value: Run): Self = this.set("run", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRun: Self = this.set("run", js.undefined)
  }
  
}

