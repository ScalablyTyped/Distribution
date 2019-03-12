package typings
package bounceDotJsLib.bounceDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationOptions extends js.Object {
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  var onComplete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var remove: js.UndefOr[scala.Boolean] = js.undefined
}

object AnimationOptions {
  @scala.inline
  def apply(
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    onComplete: () => scala.Unit = null,
    remove: js.UndefOr[scala.Boolean] = js.undefined
  ): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction0(onComplete))
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove)
    __obj.asInstanceOf[AnimationOptions]
  }
}

