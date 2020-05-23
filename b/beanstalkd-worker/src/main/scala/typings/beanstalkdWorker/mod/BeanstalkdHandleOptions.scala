package typings.beanstalkdWorker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeanstalkdHandleOptions extends js.Object {
  /** Backoff handling options */
  var backoff: js.UndefOr[BeanstalkdHandleBackoff] = js.undefined
  /** Total amount of tries including the first one. */
  var tries: js.UndefOr[Double] = js.undefined
  /** Total number of watcher handling this Tube simultaneously. */
  var width: js.UndefOr[Double] = js.undefined
}

object BeanstalkdHandleOptions {
  @scala.inline
  def apply(
    backoff: BeanstalkdHandleBackoff = null,
    tries: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): BeanstalkdHandleOptions = {
    val __obj = js.Dynamic.literal()
    if (backoff != null) __obj.updateDynamic("backoff")(backoff.asInstanceOf[js.Any])
    if (!js.isUndefined(tries)) __obj.updateDynamic("tries")(tries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeanstalkdHandleOptions]
  }
}

