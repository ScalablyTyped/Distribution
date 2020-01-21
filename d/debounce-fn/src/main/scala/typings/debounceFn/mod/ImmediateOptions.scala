package typings.debounceFn.mod

import typings.debounceFn.debounceFnBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImmediateOptions extends Options {
  @JSName("immediate")
  val immediate_ImmediateOptions: `true`
}

object ImmediateOptions {
  @scala.inline
  def apply(immediate: `true`, wait: Int | Double = null): ImmediateOptions = {
    val __obj = js.Dynamic.literal(immediate = immediate.asInstanceOf[js.Any])
    if (wait != null) __obj.updateDynamic("wait")(wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImmediateOptions]
  }
}

