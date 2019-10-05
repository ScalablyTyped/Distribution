package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKmlScreenOverlayOptions extends js.Object {
  /** A boolean indicating if the screen overlay can be displayed above or beow the navigaiton bar. Default: false */
  var belowNavigationBar: js.UndefOr[Boolean] = js.undefined
  /** The visibility of the screen overlay. Default: true */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object IKmlScreenOverlayOptions {
  @scala.inline
  def apply(
    belowNavigationBar: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): IKmlScreenOverlayOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(belowNavigationBar)) __obj.updateDynamic("belowNavigationBar")(belowNavigationBar)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[IKmlScreenOverlayOptions]
  }
}

