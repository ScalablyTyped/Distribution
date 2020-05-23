package typings.creditCardType.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object Name {
  @scala.inline
  def apply(name: String = null, size: js.UndefOr[Double] = js.undefined): Name = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

