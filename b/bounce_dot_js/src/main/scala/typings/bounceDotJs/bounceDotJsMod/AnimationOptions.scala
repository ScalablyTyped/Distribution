package typings.bounceDotJs.bounceDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationOptions extends js.Object {
  var loop: js.UndefOr[Boolean] = js.undefined
  var onComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var remove: js.UndefOr[Boolean] = js.undefined
}

object AnimationOptions {
  @scala.inline
  def apply(
    loop: js.UndefOr[Boolean] = js.undefined,
    onComplete: () => Unit = null,
    remove: js.UndefOr[Boolean] = js.undefined
  ): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction0(onComplete))
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove)
    __obj.asInstanceOf[AnimationOptions]
  }
}

