package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelStepsOutput extends js.Object {
  /**
    * A list of CancelStepsInfo, which shows the status of specified cancel requests for each StepID specified.
    */
  var CancelStepsInfoList: js.UndefOr[typings.awsSdk.emrMod.CancelStepsInfoList] = js.native
}

object CancelStepsOutput {
  @scala.inline
  def apply(): CancelStepsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelStepsOutput]
  }
  @scala.inline
  implicit class CancelStepsOutputOps[Self <: CancelStepsOutput] (val x: Self) extends AnyVal {
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
    def setCancelStepsInfoListVarargs(value: CancelStepsInfo*): Self = this.set("CancelStepsInfoList", js.Array(value :_*))
    @scala.inline
    def setCancelStepsInfoList(value: CancelStepsInfoList): Self = this.set("CancelStepsInfoList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelStepsInfoList: Self = this.set("CancelStepsInfoList", js.undefined)
  }
  
}

