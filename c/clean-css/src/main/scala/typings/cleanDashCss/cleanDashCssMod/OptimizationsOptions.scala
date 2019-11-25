package typings.cleanDashCss.cleanDashCssMod

import typings.cleanDashCss.Anon_All
import typings.cleanDashCss.Anon_AllMergeAdjacentRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fine grained options for configuring optimizations
  */
trait OptimizationsOptions extends js.Object {
  var `1`: js.UndefOr[Anon_All] = js.undefined
  var `2`: js.UndefOr[Anon_AllMergeAdjacentRules] = js.undefined
}

object OptimizationsOptions {
  @scala.inline
  def apply(`1`: Anon_All = null, `2`: Anon_AllMergeAdjacentRules = null): OptimizationsOptions = {
    val __obj = js.Dynamic.literal()
    if (`1` != null) __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    if (`2` != null) __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimizationsOptions]
  }
}

