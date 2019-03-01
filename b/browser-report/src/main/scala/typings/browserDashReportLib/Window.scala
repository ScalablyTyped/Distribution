package typings
package browserDashReportLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  def browserReport(result: js.Function2[/* error */ stdLib.ErrorEvent, /* report */ ReportResult, _]): scala.Unit
  def browserReportSync(): ReportResult
}

object Window {
  @scala.inline
  def apply(
    browserReport: js.Function1[
      js.Function2[/* error */ stdLib.ErrorEvent, /* report */ ReportResult, _], 
      scala.Unit
    ],
    browserReportSync: js.Function0[ReportResult]
  ): Window = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("browserReport")(browserReport)
    __obj.updateDynamic("browserReportSync")(browserReportSync)
    __obj.asInstanceOf[Window]
  }
}

