package typings.browserDashSync.browserDashSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GhostOptions extends js.Object {
  var clicks: js.UndefOr[Boolean] = js.undefined
  var forms: js.UndefOr[FormsOptions | Boolean] = js.undefined
  var scroll: js.UndefOr[Boolean] = js.undefined
}

object GhostOptions {
  @scala.inline
  def apply(
    clicks: js.UndefOr[Boolean] = js.undefined,
    forms: FormsOptions | Boolean = null,
    scroll: js.UndefOr[Boolean] = js.undefined
  ): GhostOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clicks)) __obj.updateDynamic("clicks")(clicks.asInstanceOf[js.Any])
    if (forms != null) __obj.updateDynamic("forms")(forms.asInstanceOf[js.Any])
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[GhostOptions]
  }
}

