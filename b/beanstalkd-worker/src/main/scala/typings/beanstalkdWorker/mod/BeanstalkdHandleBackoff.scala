package typings.beanstalkdWorker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeanstalkdHandleBackoff extends js.Object {
  /** Multiple backoff by N each try. */
  var exponential: js.UndefOr[Double] = js.native
  /** Initial time to wait (in milliseconds). */
  var initial: js.UndefOr[Double] = js.native
}

object BeanstalkdHandleBackoff {
  @scala.inline
  def apply(): BeanstalkdHandleBackoff = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeanstalkdHandleBackoff]
  }
  @scala.inline
  implicit class BeanstalkdHandleBackoffOps[Self <: BeanstalkdHandleBackoff] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExponential(value: Double): Self = this.set("exponential", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExponential: Self = this.set("exponential", js.undefined)
    @scala.inline
    def setInitial(value: Double): Self = this.set("initial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitial: Self = this.set("initial", js.undefined)
  }
  
}

