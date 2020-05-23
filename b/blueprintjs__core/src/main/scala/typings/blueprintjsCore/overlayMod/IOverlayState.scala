package typings.blueprintjsCore.overlayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOverlayState extends js.Object {
  var hasEverOpened: js.UndefOr[Boolean] = js.undefined
}

object IOverlayState {
  @scala.inline
  def apply(hasEverOpened: js.UndefOr[Boolean] = js.undefined): IOverlayState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasEverOpened)) __obj.updateDynamic("hasEverOpened")(hasEverOpened.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOverlayState]
  }
}

