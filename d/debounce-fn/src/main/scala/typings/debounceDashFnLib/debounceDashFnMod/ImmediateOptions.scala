package typings
package debounceDashFnLib.debounceDashFnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImmediateOptions extends Options {
  @JSName("immediate")
  val immediate_ImmediateOptions: debounceDashFnLib.debounceDashFnLibNumbers.`true`
}

object ImmediateOptions {
  @scala.inline
  def apply(
    immediate: debounceDashFnLib.debounceDashFnLibNumbers.`true`,
    wait: scala.Int | scala.Double = null
  ): ImmediateOptions = {
    val __obj = js.Dynamic.literal(immediate = immediate)
    if (wait != null) __obj.updateDynamic("wait")(wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImmediateOptions]
  }
}

