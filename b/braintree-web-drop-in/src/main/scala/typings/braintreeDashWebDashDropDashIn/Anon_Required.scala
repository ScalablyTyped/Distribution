package typings.braintreeDashWebDashDropDashIn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Required extends js.Object {
  var required: js.UndefOr[Boolean] = js.undefined
}

object Anon_Required {
  @scala.inline
  def apply(required: js.UndefOr[Boolean] = js.undefined): Anon_Required = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Required]
  }
}

