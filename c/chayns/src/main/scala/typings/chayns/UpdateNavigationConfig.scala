package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.updateNavigation()
trait UpdateNavigationConfig extends js.Object {
  var stateOnly: js.UndefOr[Boolean] = js.undefined
  var updateTapp: js.UndefOr[Boolean] = js.undefined
}

object UpdateNavigationConfig {
  @scala.inline
  def apply(stateOnly: js.UndefOr[Boolean] = js.undefined, updateTapp: js.UndefOr[Boolean] = js.undefined): UpdateNavigationConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stateOnly)) __obj.updateDynamic("stateOnly")(stateOnly)
    if (!js.isUndefined(updateTapp)) __obj.updateDynamic("updateTapp")(updateTapp)
    __obj.asInstanceOf[UpdateNavigationConfig]
  }
}

