package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Front extends js.Object {
  var front: js.UndefOr[Boolean] = js.undefined
}

object Front {
  @scala.inline
  def apply(front: js.UndefOr[Boolean] = js.undefined): Front = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(front)) __obj.updateDynamic("front")(front.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Front]
  }
}

