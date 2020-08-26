package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBlacklistReportsResponse extends js.Object {
  /**
    * An object that contains information about a blacklist that one of your dedicated IP addresses appears on.
    */
  var BlacklistReport: typings.awsSdk.sesv2Mod.BlacklistReport = js.native
}

object GetBlacklistReportsResponse {
  @scala.inline
  def apply(BlacklistReport: BlacklistReport): GetBlacklistReportsResponse = {
    val __obj = js.Dynamic.literal(BlacklistReport = BlacklistReport.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBlacklistReportsResponse]
  }
  @scala.inline
  implicit class GetBlacklistReportsResponseOps[Self <: GetBlacklistReportsResponse] (val x: Self) extends AnyVal {
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
    def setBlacklistReport(value: BlacklistReport): Self = this.set("BlacklistReport", value.asInstanceOf[js.Any])
  }
  
}

