package typings.beanstalkdWorker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeanstalkdSpawnOptions extends js.Object {
  /** The delay before making the new Job visible (in milliseconds). */
  var delay: js.UndefOr[Double] = js.native
  /** The priority for the new Job. */
  var priority: js.UndefOr[Double] = js.native
  /** The timeout for the new Job (in milliseconds). */
  var timeout: js.UndefOr[Double] = js.native
}

object BeanstalkdSpawnOptions {
  @scala.inline
  def apply(): BeanstalkdSpawnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeanstalkdSpawnOptions]
  }
  @scala.inline
  implicit class BeanstalkdSpawnOptionsOps[Self <: BeanstalkdSpawnOptions] (val x: Self) extends AnyVal {
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

