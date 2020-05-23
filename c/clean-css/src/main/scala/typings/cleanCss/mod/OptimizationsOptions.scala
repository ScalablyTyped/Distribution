package typings.cleanCss.mod

import typings.cleanCss.anon.All
import typings.cleanCss.anon.MergeAdjacentRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fine grained options for configuring optimizations
  */
trait OptimizationsOptions extends js.Object {
  var `1`: js.UndefOr[All] = js.undefined
  var `2`: js.UndefOr[MergeAdjacentRules] = js.undefined
}

object OptimizationsOptions {
  @scala.inline
  def apply(`1`: All = null, `2`: MergeAdjacentRules = null): OptimizationsOptions = {
    val __obj = js.Dynamic.literal()
    if (`1` != null) __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    if (`2` != null) __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimizationsOptions]
  }
}

