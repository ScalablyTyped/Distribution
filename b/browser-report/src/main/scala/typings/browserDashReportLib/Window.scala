package typings
package browserDashReportLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  def browserReport(result: js.Function2[/* error */ stdLib.ErrorEvent, /* report */ ReportResult, _]): scala.Unit
  def browserReportSync(): ReportResult
}

