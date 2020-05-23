package typings.braintreeWeb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: js.Any
  var endpoint: String
  var method: String
  var timeout: js.UndefOr[Double] = js.undefined
}

object Data {
  @scala.inline
  def apply(data: js.Any, endpoint: String, method: String, timeout: js.UndefOr[Double] = js.undefined): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

