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
    draw: () => scala.Unit = null,
    hide: () => scala.Unit = null,
    initialize: /* map */ Map => stdLib.HTMLElement = null,
    isVisible: () => scala.Boolean = null,
    show: () => scala.Unit = null
  ): Overlay = {
    val __obj = js.Dynamic.literal()
    if (draw != null) __obj.updateDynamic("draw")(js.Any.fromFunction0(draw))
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction0(hide))
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction1(initialize))
    if (isVisible != null) __obj.updateDynamic("isVisible")(js.Any.fromFunction0(isVisible))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction0(show))
    __obj.asInstanceOf[Overlay]
  }
}

