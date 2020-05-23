package typings.baidumapWebSdk.BMap

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
    maxZoom: js.UndefOr[Double] = js.undefined,
    minZoom: js.UndefOr[Double] = js.undefined,
    textColor: js.UndefOr[Double] = js.undefined,
    tips: String = null
  ): MapTypeOptions = {
    val __obj = js.Dynamic.literal()
    if (errorImageUrl != null) __obj.updateDynamic("errorImageUrl")(errorImageUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoom)) __obj.updateDynamic("minZoom")(minZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(textColor)) __obj.updateDynamic("textColor")(textColor.get.asInstanceOf[js.Any])
    if (tips != null) __obj.updateDynamic("tips")(tips.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapTypeOptions]
  }
}

