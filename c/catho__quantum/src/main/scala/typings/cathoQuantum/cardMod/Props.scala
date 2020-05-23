package typings.cathoQuantum.cardMod

import typings.cathoQuantum.anon.ColorsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var theme: js.UndefOr[ColorsObject] = js.undefined
}

object Props {
  @scala.inline
  def apply(theme: ColorsObject = null): Props = {
    val __obj = js.Dynamic.literal()
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

