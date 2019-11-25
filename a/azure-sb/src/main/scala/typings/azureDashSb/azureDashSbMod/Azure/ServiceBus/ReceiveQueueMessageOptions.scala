package typings.azureDashSb.azureDashSbMod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiveQueueMessageOptions extends js.Object {
  var isPeekLock: js.UndefOr[Boolean] = js.undefined
  var timeoutIntervalInS: js.UndefOr[Double] = js.undefined
}

object ReceiveQueueMessageOptions {
  @scala.inline
  def apply(isPeekLock: js.UndefOr[Boolean] = js.undefined, timeoutIntervalInS: Int | Double = null): ReceiveQueueMessageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isPeekLock)) __obj.updateDynamic("isPeekLock")(isPeekLock.asInstanceOf[js.Any])
    if (timeoutIntervalInS != null) __obj.updateDynamic("timeoutIntervalInS")(timeoutIntervalInS.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiveQueueMessageOptions]
  }
}

