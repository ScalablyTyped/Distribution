package typings.bugsnagJs.anon

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.bugsnagJs.reportMod.IHandledState
import typings.bugsnagJs.reportMod.IStackframe
import typings.bugsnagJs.reportMod.Report
import typings.bugsnagJs.reportMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instantiable
  extends Instantiable2[/* errorClass */ String, /* errorMessage */ String, default]
     with Instantiable3[
      /* errorClass */ String, 
      /* errorMessage */ String, 
      /* stacktrace */ js.Array[js.Any], 
      default
    ]
     with Instantiable4[
      /* errorClass */ String, 
      /* errorMessage */ String, 
      js.UndefOr[/* stacktrace */ js.Array[js.Any]], 
      /* handledState */ IHandledState, 
      default
    ] {
  def ensureReport(reportOrError: js.Any): Report = js.native
  def ensureReport(reportOrError: js.Any, errorFramesToSkip: js.UndefOr[scala.Nothing], generatedFramesToSkip: Double): Report = js.native
  def ensureReport(reportOrError: js.Any, errorFramesToSkip: Double): Report = js.native
  def ensureReport(reportOrError: js.Any, errorFramesToSkip: Double, generatedFramesToSkip: Double): Report = js.native
  def getStacktrace(error: js.Any): js.Array[IStackframe] = js.native
  def getStacktrace(error: js.Any, errorFramesToSkip: js.UndefOr[scala.Nothing], generatedFramesToSkip: Double): js.Array[IStackframe] = js.native
  def getStacktrace(error: js.Any, errorFramesToSkip: Double): js.Array[IStackframe] = js.native
  def getStacktrace(error: js.Any, errorFramesToSkip: Double, generatedFramesToSkip: Double): js.Array[IStackframe] = js.native
}

