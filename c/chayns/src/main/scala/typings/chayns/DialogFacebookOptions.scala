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
    multiselect: Int | Double = null,
    quickfind: Int | Double = null
  ): DialogFacebookOptions = {
    val __obj = js.Dynamic.literal(preSelected = preSelected, title = title)
    if (button != null) __obj.updateDynamic("button")(button)
    if (message != null) __obj.updateDynamic("message")(message)
    if (multiselect != null) __obj.updateDynamic("multiselect")(multiselect.asInstanceOf[js.Any])
    if (quickfind != null) __obj.updateDynamic("quickfind")(quickfind.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogFacebookOptions]
  }
}

