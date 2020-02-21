package typings.cathoQuantum.hamburguerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HamburguerProps extends js.Object {
  var ariaLabelDescription: js.UndefOr[String] = js.undefined
  var inverted: js.UndefOr[Boolean] = js.undefined
  var isOpened: js.UndefOr[Boolean] = js.undefined
  var showNotification: js.UndefOr[Boolean] = js.undefined
}

object HamburguerProps {
  @scala.inline
  def apply(
    ariaLabelDescription: String = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    isOpened: js.UndefOr[Boolean] = js.undefined,
    showNotification: js.UndefOr[Boolean] = js.undefined
  ): HamburguerProps = {
    val __obj = js.Dynamic.literal()
    if (ariaLabelDescription != null) __obj.updateDynamic("ariaLabelDescription")(ariaLabelDescription.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpened)) __obj.updateDynamic("isOpened")(isOpened.asInstanceOf[js.Any])
    if (!js.isUndefined(showNotification)) __obj.updateDynamic("showNotification")(showNotification.asInstanceOf[js.Any])
    __obj.asInstanceOf[HamburguerProps]
  }
}

