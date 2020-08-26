package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportFilter extends js.Object {
  /**
    *  The status used to filter reports. You can filter using one status only. 
    */
  var status: js.UndefOr[ReportStatusType] = js.native
}

object ReportFilter {
  @scala.inline
  def apply(): ReportFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportFilter]
  }
  @scala.inline
  implicit class ReportFilterOps[Self <: ReportFilter] (val x: Self) extends AnyVal {
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
    def setStatus(value: ReportStatusType): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

