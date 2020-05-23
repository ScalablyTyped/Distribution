package typings.awsSdk.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaiterConfiguration extends js.Object {
  /**
    * The number of seconds to wait between requests
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * The maximum number of requests to send while waiting
    */
  var maxAttempts: js.UndefOr[Double] = js.native
}

object WaiterConfiguration {
  @scala.inline
  def apply(delay: js.UndefOr[Double] = js.undefined, maxAttempts: js.UndefOr[Double] = js.undefined): WaiterConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAttempts)) __obj.updateDynamic("maxAttempts")(maxAttempts.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaiterConfiguration]
  }
}

