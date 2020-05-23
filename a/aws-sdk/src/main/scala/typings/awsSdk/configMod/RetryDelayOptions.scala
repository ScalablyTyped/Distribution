package typings.awsSdk.configMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryDelayOptions extends js.Object {
  /**
    * The base number of milliseconds to use in the exponential backoff for operation retries.
    * Defaults to 100 ms.
    */
  var base: js.UndefOr[Double] = js.native
  /**
    * A custom function that accepts a retry count and error and returns the amount of time to delay in milliseconds. If the result is a non-zero negative value, no further retry attempts will be made.
    * The base option will be ignored if this option is supplied.
    */
  var customBackoff: js.UndefOr[js.Function2[/* retryCount */ Double, /* err */ js.UndefOr[Error], Double]] = js.native
}

object RetryDelayOptions {
  @scala.inline
  def apply(
    base: js.UndefOr[Double] = js.undefined,
    customBackoff: (/* retryCount */ Double, /* err */ js.UndefOr[Error]) => Double = null
  ): RetryDelayOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(base)) __obj.updateDynamic("base")(base.get.asInstanceOf[js.Any])
    if (customBackoff != null) __obj.updateDynamic("customBackoff")(js.Any.fromFunction2(customBackoff))
    __obj.asInstanceOf[RetryDelayOptions]
  }
}

