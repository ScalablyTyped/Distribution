package typings.beanstalkdDashWorker.beanstalkdDashWorkerMod

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
  def apply(backoff: BeanstalkdHandleBackoff = null, tries: Int | Double = null, width: Int | Double = null): BeanstalkdHandleOptions = {
    val __obj = js.Dynamic.literal()
    if (backoff != null) __obj.updateDynamic("backoff")(backoff.asInstanceOf[js.Any])
    if (tries != null) __obj.updateDynamic("tries")(tries.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeanstalkdHandleOptions]
  }
}

