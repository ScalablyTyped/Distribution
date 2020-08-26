package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSeverityLevelsResponse extends js.Object {
  /**
    * The available severity levels for the support case. Available severity levels are defined by your service level agreement with AWS.
    */
  var severityLevels: js.UndefOr[SeverityLevelsList] = js.native
}

object DescribeSeverityLevelsResponse {
  @scala.inline
  def apply(): DescribeSeverityLevelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSeverityLevelsResponse]
  }
  @scala.inline
  implicit class DescribeSeverityLevelsResponseOps[Self <: DescribeSeverityLevelsResponse] (val x: Self) extends AnyVal {
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
    def setSeverityLevelsVarargs(value: SeverityLevel*): Self = this.set("severityLevels", js.Array(value :_*))
    @scala.inline
    def setSeverityLevels(value: SeverityLevelsList): Self = this.set("severityLevels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeverityLevels: Self = this.set("severityLevels", js.undefined)
  }
  
}

