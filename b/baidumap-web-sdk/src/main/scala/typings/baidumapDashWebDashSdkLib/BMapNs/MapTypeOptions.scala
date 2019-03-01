package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapTypeOptions extends js.Object {
  var errorImageUrl: js.UndefOr[java.lang.String] = js.undefined
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  var textColor: js.UndefOr[scala.Double] = js.undefined
  var tips: js.UndefOr[java.lang.String] = js.undefined
}

object MapTypeOptions {
  @scala.inline
  def apply(
    errorImageUrl: java.lang.String = null,
    maxZoom: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    textColor: scala.Int | scala.Double = null,
    tips: java.lang.String = null
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

