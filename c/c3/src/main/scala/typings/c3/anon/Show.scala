package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Show extends js.Object {
  var show: js.UndefOr[Boolean] = js.undefined
}

object Show {
  @scala.inline
  def apply(show: js.UndefOr[Boolean] = js.undefined): Show = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Show]
  }
}

