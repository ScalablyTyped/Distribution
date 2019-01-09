package typings
package bugsnagDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EnsureReport
  extends org.scalablytyped.runtime.Instantiable2[
      /* errorClass */ java.lang.String, 
      /* errorMessage */ java.lang.String, 
      bugsnagDashJsLib.typesReportMod.default
    ]
     with org.scalablytyped.runtime.Instantiable3[
      /* errorClass */ java.lang.String, 
      /* errorMessage */ java.lang.String, 
      /* stacktrace */ js.Array[js.Any], 
      bugsnagDashJsLib.typesReportMod.default
    ]
     with org.scalablytyped.runtime.Instantiable4[
      /* errorClass */ java.lang.String, 
      /* errorMessage */ java.lang.String, 
      /* stacktrace */ js.Array[js.Any], 
      /* handledState */ bugsnagDashJsLib.typesReportMod.IHandledState, 
      bugsnagDashJsLib.typesReportMod.default
    ] {
  def ensureReport(reportOrError: js.Any): bugsnagDashJsLib.typesReportMod.Report = js.native
  def ensureReport(reportOrError: js.Any, errorFramesToSkip: scala.Double): bugsnagDashJsLib.typesReportMod.Report = js.native
  def ensureReport(reportOrError: js.Any, errorFramesToSkip: scala.Double, generatedFramesToSkip: scala.Double): bugsnagDashJsLib.typesReportMod.Report = js.native
  def getStacktrace(error: js.Any): js.Array[bugsnagDashJsLib.typesReportMod.IStackframe] = js.native
  def getStacktrace(error: js.Any, errorFramesToSkip: scala.Double): js.Array[bugsnagDashJsLib.typesReportMod.IStackframe] = js.native
  def getStacktrace(error: js.Any, errorFramesToSkip: scala.Double, generatedFramesToSkip: scala.Double): js.Array[bugsnagDashJsLib.typesReportMod.IStackframe] = js.native
}

