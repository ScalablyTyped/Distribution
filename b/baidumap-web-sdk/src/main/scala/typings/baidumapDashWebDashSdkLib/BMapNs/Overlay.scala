package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Overlay extends js.Object {
  var draw: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var hide: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var initialize: js.UndefOr[js.Function1[/* map */ Map, stdLib.HTMLElement]] = js.undefined
  var isVisible: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  var show: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object Overlay {
  @scala.inline
  def apply(
    draw: js.Function0[scala.Unit] = null,
    hide: js.Function0[scala.Unit] = null,
    initialize: js.Function1[/* map */ Map, stdLib.HTMLElement] = null,
    isVisible: js.Function0[scala.Boolean] = null,
    show: js.Function0[scala.Unit] = null
  ): Overlay = {
    val __obj = js.Dynamic.literal()
    if (draw != null) __obj.updateDynamic("draw")(draw)
    if (hide != null) __obj.updateDynamic("hide")(hide)
    if (initialize != null) __obj.updateDynamic("initialize")(initialize)
    if (isVisible != null) __obj.updateDynamic("isVisible")(isVisible)
    if (show != null) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[Overlay]
  }
}

