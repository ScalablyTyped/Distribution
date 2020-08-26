package typings.browserReport

import typings.std.ErrorEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  def browserReport(result: js.Function2[/* error */ ErrorEvent, /* report */ ReportResult, _]): Unit = js.native
  def browserReportSync(): ReportResult = js.native
}

object Window {
  @scala.inline
  def apply(
    browserReport: js.Function2[/* error */ ErrorEvent, /* report */ ReportResult, _] => Unit,
    browserReportSync: () => ReportResult
  ): Window = {
    val __obj = js.Dynamic.literal(browserReport = js.Any.fromFunction1(browserReport), browserReportSync = js.Any.fromFunction0(browserReportSync))
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
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
    def setBrowserReport(value: js.Function2[/* error */ ErrorEvent, /* report */ ReportResult, _] => Unit): Self = this.set("browserReport", js.Any.fromFunction1(value))
    @scala.inline
    def setBrowserReportSync(value: () => ReportResult): Self = this.set("browserReportSync", js.Any.fromFunction0(value))
  }
  
}

