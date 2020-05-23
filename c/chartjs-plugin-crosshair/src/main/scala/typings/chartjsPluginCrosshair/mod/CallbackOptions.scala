package typings.chartjsPluginCrosshair.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbackOptions extends js.Object {
  var afterZoom: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, Unit]] = js.undefined
  var beforeZoom: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, Boolean]] = js.undefined
}

object CallbackOptions {
  @scala.inline
  def apply(
    afterZoom: (/* start */ Double, /* end */ Double) => Unit = null,
    beforeZoom: (/* start */ Double, /* end */ Double) => Boolean = null
  ): CallbackOptions = {
    val __obj = js.Dynamic.literal()
    if (afterZoom != null) __obj.updateDynamic("afterZoom")(js.Any.fromFunction2(afterZoom))
    if (beforeZoom != null) __obj.updateDynamic("beforeZoom")(js.Any.fromFunction2(beforeZoom))
    __obj.asInstanceOf[CallbackOptions]
  }
}

