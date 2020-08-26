package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTrustedAdvisorCheckSummariesRequest extends js.Object {
  /**
    * The IDs of the Trusted Advisor checks.
    */
  var checkIds: StringList = js.native
}

object DescribeTrustedAdvisorCheckSummariesRequest {
  @scala.inline
  def apply(checkIds: StringList): DescribeTrustedAdvisorCheckSummariesRequest = {
    val __obj = js.Dynamic.literal(checkIds = checkIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrustedAdvisorCheckSummariesRequest]
  }
  @scala.inline
  implicit class DescribeTrustedAdvisorCheckSummariesRequestOps[Self <: DescribeTrustedAdvisorCheckSummariesRequest] (val x: Self) extends AnyVal {
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
    def setCheckIdsVarargs(value: String*): Self = this.set("checkIds", js.Array(value :_*))
    @scala.inline
    def setCheckIds(value: StringList): Self = this.set("checkIds", value.asInstanceOf[js.Any])
  }
  
}

