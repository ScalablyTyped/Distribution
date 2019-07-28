package typings.axeDashWebdriverjs

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object axeDashWebdriverjsMod {
  type AnalyzeCallback = js.Function2[/* err */ Error | Null, /* results */ AxeAnalysis, Unit]
  type DeprecatedAnalyzeCallback = js.Function1[/* results */ AxeAnalysis, Unit]
}
