package typings.browserDashReport

import typings.std.ErrorEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  def browserReport(result: js.Function2[/* error */ ErrorEvent, /* report */ ReportResult, _]): Unit
  def browserReportSync(): ReportResult
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
}

