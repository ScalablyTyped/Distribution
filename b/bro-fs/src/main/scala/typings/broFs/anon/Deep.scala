package typings.broFs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deep extends js.Object {
  var deep: js.UndefOr[Boolean] = js.undefined
}

object Deep {
  @scala.inline
  def apply(deep: js.UndefOr[Boolean] = js.undefined): Deep = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deep]
  }
}

