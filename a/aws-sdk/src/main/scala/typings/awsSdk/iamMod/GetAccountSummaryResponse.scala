package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccountSummaryResponse extends js.Object {
  /**
    * A set of key–value pairs containing information about IAM entity usage and IAM quotas.
    */
  var SummaryMap: js.UndefOr[summaryMapType] = js.native
}

object GetAccountSummaryResponse {
  @scala.inline
  def apply(): GetAccountSummaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountSummaryResponse]
  }
  @scala.inline
  implicit class GetAccountSummaryResponseOps[Self <: GetAccountSummaryResponse] (val x: Self) extends AnyVal {
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
    def setSummaryMap(value: summaryMapType): Self = this.set("SummaryMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummaryMap: Self = this.set("SummaryMap", js.undefined)
  }
  
}

