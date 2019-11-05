package typings.beanstalkdDashWorker.beanstalkdDashWorkerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeanstalkdSpawnOptions extends js.Object {
  /** The delay before making the new Job visible (in milliseconds). */
  var delay: js.UndefOr[Double] = js.undefined
  /** The priority for the new Job. */
  var priority: js.UndefOr[Double] = js.undefined
  /** The timeout for the new Job (in milliseconds). */
  var timeout: js.UndefOr[Double] = js.undefined
}

object BeanstalkdSpawnOptions {
  @scala.inline
  def apply(delay: Int | Double = null, priority: Int | Double = null, timeout: Int | Double = null): BeanstalkdSpawnOptions = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeanstalkdSpawnOptions]
  }
}

