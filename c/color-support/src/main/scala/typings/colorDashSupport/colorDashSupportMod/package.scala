package typings.colorDashSupport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object colorDashSupportMod {
  import typings.colorDashSupport.colorDashSupportBooleans.`false`

  type ColorSupport = js.Function2[
    /* options */ js.UndefOr[ColorSupportOptions], 
    /* obj */ js.UndefOr[ColorSupportResult], 
    `false` | ColorSupportResult
  ]
}
