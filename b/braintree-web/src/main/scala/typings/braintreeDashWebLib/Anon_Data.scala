package typings
package braintreeDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.Any
  var endpoint: java.lang.String
  var method: java.lang.String
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Data {
  @scala.inline
  def apply(
    data: js.Any,
    endpoint: java.lang.String,
    method: java.lang.String,
    timeout: scala.Int | scala.Double = null
  ): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data, endpoint = endpoint, method = method)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Data]
  }
}

