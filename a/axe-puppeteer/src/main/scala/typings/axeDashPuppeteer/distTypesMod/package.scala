package typings.axeDashPuppeteer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  import typings.axeDashCore.axeDashCoreMod.AxeResults
  import typings.std.Error

  type AnalyzeCB = js.Function2[/* err */ Error | Null, /* result */ js.UndefOr[AxeResults], Unit]
}
