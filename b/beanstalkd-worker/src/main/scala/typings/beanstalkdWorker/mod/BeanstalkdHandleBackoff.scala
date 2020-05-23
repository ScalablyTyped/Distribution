package typings.beanstalkdWorker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeanstalkdHandleBackoff extends js.Object {
  /** Multiple backoff by N each try. */
  var exponential: js.UndefOr[Double] = js.undefined
  /** Initial time to wait (in milliseconds). */
  var initial: js.UndefOr[Double] = js.undefined
}

object BeanstalkdHandleBackoff {
  @scala.inline
  def apply(exponential: js.UndefOr[Double] = js.undefined, initial: js.UndefOr[Double] = js.undefined): BeanstalkdHandleBackoff = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exponential)) __obj.updateDynamic("exponential")(exponential.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initial)) __obj.updateDynamic("initial")(initial.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeanstalkdHandleBackoff]
  }
}

