package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNpapi extends js.Object {
  var npapi: js.UndefOr[Boolean] = js.undefined
}

object AnonNpapi {
  @scala.inline
  def apply(npapi: js.UndefOr[Boolean] = js.undefined): AnonNpapi = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(npapi)) __obj.updateDynamic("npapi")(npapi.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNpapi]
  }
}

