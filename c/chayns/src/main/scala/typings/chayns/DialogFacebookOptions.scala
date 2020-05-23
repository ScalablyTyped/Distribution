package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogFacebookOptions extends js.Object {
  var button: js.UndefOr[js.Array[DialogFacebookButton]] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var multiselect: js.UndefOr[Double] = js.undefined
  var preSelected: js.Array[Double]
  var quickfind: js.UndefOr[Double] = js.undefined
  var title: String
}

object DialogFacebookOptions {
  @scala.inline
  def apply(
    preSelected: js.Array[Double],
    title: String,
    button: js.Array[DialogFacebookButton] = null,
    message: String = null,
    multiselect: js.UndefOr[Double] = js.undefined,
    quickfind: js.UndefOr[Double] = js.undefined
  ): DialogFacebookOptions = {
    val __obj = js.Dynamic.literal(preSelected = preSelected.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(multiselect)) __obj.updateDynamic("multiselect")(multiselect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quickfind)) __obj.updateDynamic("quickfind")(quickfind.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogFacebookOptions]
  }
}

