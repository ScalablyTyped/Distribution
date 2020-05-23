package typings.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alt extends js.Object {
  var alt: String
  var rounded: js.UndefOr[Boolean] = js.undefined
  var src: String
  var theme: js.UndefOr[ColorsObject] = js.undefined
}

object Alt {
  @scala.inline
  def apply(alt: String, src: String, rounded: js.UndefOr[Boolean] = js.undefined, theme: ColorsObject = null): Alt = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    if (!js.isUndefined(rounded)) __obj.updateDynamic("rounded")(rounded.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alt]
  }
}

