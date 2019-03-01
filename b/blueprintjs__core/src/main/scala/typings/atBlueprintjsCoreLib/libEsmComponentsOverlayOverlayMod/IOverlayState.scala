package typings
package atBlueprintjsCoreLib.libEsmComponentsOverlayOverlayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOverlayState extends js.Object {
  var hasEverOpened: js.UndefOr[scala.Boolean] = js.undefined
}

object IOverlayState {
  @scala.inline
  def apply(hasEverOpened: js.UndefOr[scala.Boolean] = js.undefined): IOverlayState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasEverOpened)) __obj.updateDynamic("hasEverOpened")(hasEverOpened)
    __obj.asInstanceOf[IOverlayState]
  }
}

