package typings.braintreeWebDropIn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Required extends js.Object {
  var required: js.UndefOr[Boolean] = js.undefined
}

object Required {
  @scala.inline
  def apply(required: js.UndefOr[Boolean] = js.undefined): Required = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Required]
  }
}

