package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogFacebookOptions extends js.Object {
  var button: js.UndefOr[js.Array[DialogFacebookButton]] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var multiselect: js.UndefOr[scala.Double] = js.undefined
  var preSelected: js.Array[scala.Double]
  var quickfind: js.UndefOr[scala.Double] = js.undefined
  var title: java.lang.String
}

object DialogFacebookOptions {
  @scala.inline
  def apply(
    preSelected: js.Array[scala.Double],
    title: java.lang.String,
    button: js.Array[DialogFacebookButton] = null,
    message: java.lang.String = null,
    multiselect: scala.Int | scala.Double = null,
    quickfind: scala.Int | scala.Double = null
  ): DialogFacebookOptions = {
    val __obj = js.Dynamic.literal(preSelected = preSelected, title = title)
    if (button != null) __obj.updateDynamic("button")(button)
    if (message != null) __obj.updateDynamic("message")(message)
    if (multiselect != null) __obj.updateDynamic("multiselect")(multiselect.asInstanceOf[js.Any])
    if (quickfind != null) __obj.updateDynamic("quickfind")(quickfind.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogFacebookOptions]
  }
}

