package typings.bugsnagJs.reportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bugsnag-js/types/report", JSImport.Default)
@js.native
class default protected () extends Report {
  def this(errorClass: String, errorMessage: String) = this()
  def this(errorClass: String, errorMessage: String, stacktrace: js.Array[_]) = this()
  def this(errorClass: String, errorMessage: String, stacktrace: js.Array[_], handledState: IHandledState) = this()
}

/* static members */
@JSImport("bugsnag-js/types/report", JSImport.Default)
@js.native
object default extends js.Object {
  def ensureReport(reportOrError: js.Any): Report = js.native
  def ensureReport(reportOrError: js.Any, errorFramesToSkip: Double): Report = js.native
  def ensureReport(reportOrError: js.Any, errorFramesToSkip: Double, generatedFramesToSkip: Double): Report = js.native
  def getStacktrace(error: js.Any): js.Array[IStackframe] = js.native
  def getStacktrace(error: js.Any, errorFramesToSkip: Double): js.Array[IStackframe] = js.native
  def getStacktrace(error: js.Any, errorFramesToSkip: Double, generatedFramesToSkip: Double): js.Array[IStackframe] = js.native
}

