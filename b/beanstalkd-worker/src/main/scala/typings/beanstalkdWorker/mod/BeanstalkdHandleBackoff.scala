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
  def apply(exponential: Int | Double = null, initial: Int | Double = null): BeanstalkdHandleBackoff = {
    val __obj = js.Dynamic.literal()
    if (exponential != null) __obj.updateDynamic("exponential")(exponential.asInstanceOf[js.Any])
    if (initial != null) __obj.updateDynamic("initial")(initial.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeanstalkdHandleBackoff]
  }
}

