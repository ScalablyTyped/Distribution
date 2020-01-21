package typings.cspHtmlWebpackPlugin

import typings.cspHtmlWebpackPlugin.mod.Policy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPolicy extends js.Object {
  var policy: js.UndefOr[Policy] = js.undefined
}

object AnonPolicy {
  @scala.inline
  def apply(policy: Policy = null): AnonPolicy = {
    val __obj = js.Dynamic.literal()
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPolicy]
  }
}

