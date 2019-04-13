package typings
package cleanDashCssLib.cleanDashCssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fine grained options for configuring optimizations
  */
trait OptimizationsOptions extends js.Object {
  var `1`: js.UndefOr[cleanDashCssLib.Anon_All] = js.undefined
  var `2`: js.UndefOr[cleanDashCssLib.Anon_AllMergeAdjacentRules] = js.undefined
}

object OptimizationsOptions {
  @scala.inline
  def apply(`1`: cleanDashCssLib.Anon_All = null, `2`: cleanDashCssLib.Anon_AllMergeAdjacentRules = null): OptimizationsOptions = {
    val __obj = js.Dynamic.literal()
    if (`1` != null) __obj.updateDynamic("1")(`1`)
    if (`2` != null) __obj.updateDynamic("2")(`2`)
    __obj.asInstanceOf[OptimizationsOptions]
  }
}

