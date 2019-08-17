package typings.axeDashWebdriverjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object axeDashWebdriverjsMod {
  import typings.std.Error

  type AnalyzeCallback = js.Function2[/* err */ Error | Null, /* results */ AxeAnalysis, Unit]
  type DeprecatedAnalyzeCallback = js.Function1[/* results */ AxeAnalysis, Unit]
}
