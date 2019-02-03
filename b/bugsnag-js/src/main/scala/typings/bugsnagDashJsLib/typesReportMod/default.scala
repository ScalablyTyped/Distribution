package typings
package bugsnagDashJsLib.typesReportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bugsnag-js/types/report", JSImport.Default)
@js.native
class default protected () extends Report {
  def this(errorClass: java.lang.String, errorMessage: java.lang.String) = this()
  def this(errorClass: java.lang.String, errorMessage: java.lang.String, stacktrace: js.Array[_]) = this()
  def this(errorClass: java.lang.String, errorMessage: java.lang.String, stacktrace: js.Array[_], handledState: IHandledState) = this()
}

/* static members */
@JSImport("bugsnag-js/types/report", JSImport.Default)
@js.native
object default extends js.Object {
  def ensureReport(reportOrError: js.Any): bugsnagDashJsLib.typesReportMod.Report = js.native
  def ensureReport(reportOrError: js.Any, errorFramesToSkip: scala.Double): bugsnagDashJsLib.typesReportMod.Report = js.native
  def ensureReport(reportOrError: js.Any, errorFramesToSkip: scala.Double, generatedFramesToSkip: scala.Double): bugsnagDashJsLib.typesReportMod.Report = js.native
  def getStacktrace(error: js.Any): js.Array[bugsnagDashJsLib.typesReportMod.IStackframe] = js.native
  def getStacktrace(error: js.Any, errorFramesToSkip: scala.Double): js.Array[bugsnagDashJsLib.typesReportMod.IStackframe] = js.native
  def getStacktrace(error: js.Any, errorFramesToSkip: scala.Double, generatedFramesToSkip: scala.Double): js.Array[bugsnagDashJsLib.typesReportMod.IStackframe] = js.native
}

