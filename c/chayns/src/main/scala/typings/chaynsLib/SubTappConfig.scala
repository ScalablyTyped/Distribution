package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.setSubTapp()
trait SubTappConfig extends js.Object {
  var boldText: js.UndefOr[scala.Boolean] = js.undefined
  var buttonName: java.lang.String
  var callbackURL: js.UndefOr[js.Function1[/* result */ js.Any, _]] = js.undefined
  var color: java.lang.String
  var colorText: js.UndefOr[java.lang.String] = js.undefined
  var icon: java.lang.String
  var isExclusiveView: js.UndefOr[scala.Boolean] = js.undefined
  var name: java.lang.String
  var replaceParent: js.UndefOr[scala.Boolean] = js.undefined
  var sortID: scala.Double
  var tappID: scala.Double
  var url: java.lang.String
}

object SubTappConfig {
  @scala.inline
  def apply(
    buttonName: java.lang.String,
    color: java.lang.String,
    icon: java.lang.String,
    name: java.lang.String,
    sortID: scala.Double,
    tappID: scala.Double,
    url: java.lang.String,
    boldText: js.UndefOr[scala.Boolean] = js.undefined,
    callbackURL: /* result */ js.Any => _ = null,
    colorText: java.lang.String = null,
    isExclusiveView: js.UndefOr[scala.Boolean] = js.undefined,
    replaceParent: js.UndefOr[scala.Boolean] = js.undefined
  ): SubTappConfig = {
    val __obj = js.Dynamic.literal(buttonName = buttonName, color = color, icon = icon, name = name, sortID = sortID, tappID = tappID, url = url)
    if (!js.isUndefined(boldText)) __obj.updateDynamic("boldText")(boldText)
    if (callbackURL != null) __obj.updateDynamic("callbackURL")(js.Any.fromFunction1(callbackURL))
    if (colorText != null) __obj.updateDynamic("colorText")(colorText)
    if (!js.isUndefined(isExclusiveView)) __obj.updateDynamic("isExclusiveView")(isExclusiveView)
    if (!js.isUndefined(replaceParent)) __obj.updateDynamic("replaceParent")(replaceParent)
    __obj.asInstanceOf[SubTappConfig]
  }
}

