package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditInitializeFiltering extends js.Object {
  var LimitResults: js.UndefOr[Double] = js.undefined
}

object EditInitializeFiltering {
  @scala.inline
  def apply(LimitResults: js.UndefOr[Double] = js.undefined): EditInitializeFiltering = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(LimitResults)) __obj.updateDynamic("LimitResults")(LimitResults.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditInitializeFiltering]
  }
}

