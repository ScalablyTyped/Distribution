package typings.dateFns.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inclusive extends js.Object {
  var inclusive: js.UndefOr[Boolean] = js.undefined
}

object Inclusive {
  @scala.inline
  def apply(inclusive: js.UndefOr[Boolean] = js.undefined): Inclusive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inclusive)) __obj.updateDynamic("inclusive")(inclusive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inclusive]
  }
}

