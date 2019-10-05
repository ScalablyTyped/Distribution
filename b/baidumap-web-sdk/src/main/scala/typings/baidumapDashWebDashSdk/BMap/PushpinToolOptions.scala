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
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (followText != null) __obj.updateDynamic("followText")(followText)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    __obj.asInstanceOf[PushpinToolOptions]
  }
}

