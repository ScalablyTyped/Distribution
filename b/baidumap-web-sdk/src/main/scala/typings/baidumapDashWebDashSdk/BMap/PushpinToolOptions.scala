package typings.baidumapDashWebDashSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushpinToolOptions extends js.Object {
  var cursor: js.UndefOr[String] = js.undefined
  var followText: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[Icon] = js.undefined
}

object PushpinToolOptions {
  @scala.inline
  def apply(cursor: String = null, followText: String = null, icon: Icon = null): PushpinToolOptions = {
    val __obj = js.Dynamic.literal()
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (followText != null) __obj.updateDynamic("followText")(followText.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushpinToolOptions]
  }
}

