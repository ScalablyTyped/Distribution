package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalysisSchemeStatus extends js.Object {
  var Options: AnalysisScheme = js.native
  var Status: OptionStatus = js.native
}

object AnalysisSchemeStatus {
  @scala.inline
  def apply(Options: AnalysisScheme, Status: OptionStatus): AnalysisSchemeStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalysisSchemeStatus]
  }
  @scala.inline
  implicit class AnalysisSchemeStatusOps[Self <: AnalysisSchemeStatus] (val x: Self) extends AnyVal {
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
    def setOptions(value: AnalysisScheme): Self = this.set("Options", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: OptionStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
  }
  
}

