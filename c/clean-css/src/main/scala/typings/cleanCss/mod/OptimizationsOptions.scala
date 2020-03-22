package typings.cleanCss.mod

import typings.cleanCss.AnonAll
import typings.cleanCss.AnonMergeAdjacentRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fine grained options for configuring optimizations
  */
trait OptimizationsOptions extends js.Object {
  var `1`: js.UndefOr[AnonAll] = js.undefined
  var `2`: js.UndefOr[AnonMergeAdjacentRules] = js.undefined
}

object OptimizationsOptions {
  @scala.inline
  def apply(`1`: AnonAll = null, `2`: AnonMergeAdjacentRules = null): OptimizationsOptions = {
    val __obj = js.Dynamic.literal()
    if (`1` != null) __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    if (`2` != null) __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimizationsOptions]
  }
}

