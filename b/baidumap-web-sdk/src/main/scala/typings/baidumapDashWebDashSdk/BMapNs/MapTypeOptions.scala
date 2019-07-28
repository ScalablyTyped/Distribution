package typings.baidumapDashWebDashSdk.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapTypeOptions extends js.Object {
  var errorImageUrl: js.UndefOr[String] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var textColor: js.UndefOr[Double] = js.undefined
  var tips: js.UndefOr[String] = js.undefined
}

object MapTypeOptions {
  @scala.inline
  def apply(
    errorImageUrl: String = null,
    maxZoom: Int | Double = null,
    minZoom: Int | Double = null,
    textColor: Int | Double = null,
    tips: String = null
  ): MapTypeOptions = {
    val __obj = js.Dynamic.literal()
    if (errorImageUrl != null) __obj.updateDynamic("errorImageUrl")(errorImageUrl)
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (tips != null) __obj.updateDynamic("tips")(tips)
    __obj.asInstanceOf[MapTypeOptions]
  }
}

