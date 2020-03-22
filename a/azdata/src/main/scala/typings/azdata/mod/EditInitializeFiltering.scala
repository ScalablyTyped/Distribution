package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditInitializeFiltering extends js.Object {
  var LimitResults: js.UndefOr[Double] = js.undefined
}

object EditInitializeFiltering {
  @scala.inline
  def apply(LimitResults: Int | Double = null): EditInitializeFiltering = {
    val __obj = js.Dynamic.literal()
    if (LimitResults != null) __obj.updateDynamic("LimitResults")(LimitResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditInitializeFiltering]
  }
}

