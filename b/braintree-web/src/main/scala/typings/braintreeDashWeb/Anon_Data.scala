package typings.braintreeDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.Any
  var endpoint: String
  var method: String
  var timeout: js.UndefOr[Double] = js.undefined
}

object Anon_Data {
  @scala.inline
  def apply(data: js.Any, endpoint: String, method: String, timeout: Int | Double = null): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Data]
  }
}

