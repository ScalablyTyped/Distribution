package typings.beanstalkdWorker.mod

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
  def apply(
    delay: js.UndefOr[Double] = js.undefined,
    priority: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): BeanstalkdSpawnOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeanstalkdSpawnOptions]
  }
}

