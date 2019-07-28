package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.setSubTapp()
trait SubTappConfig extends js.Object {
  var boldText: js.UndefOr[Boolean] = js.undefined
  var buttonName: String
  var callbackURL: js.UndefOr[js.Function1[/* result */ js.Any, _]] = js.undefined
  var color: String
  var colorText: js.UndefOr[String] = js.undefined
  var icon: String
  var isExclusiveView: js.UndefOr[Boolean] = js.undefined
  var name: String
  var replaceParent: js.UndefOr[Boolean] = js.undefined
  var sortID: Double
  var tappID: Double
  var url: String
}

object SubTappConfig {
  @scala.inline
  def apply(
    buttonName: String,
    color: String,
    icon: String,
    name: String,
    sortID: Double,
    tappID: Double,
    url: String,
    boldText: js.UndefOr[Boolean] = js.undefined,
    callbackURL: /* result */ js.Any => _ = null,
    colorText: String = null,
    isExclusiveView: js.UndefOr[Boolean] = js.undefined,
    replaceParent: js.UndefOr[Boolean] = js.undefined
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

