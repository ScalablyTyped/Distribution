package typings.bull.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EveryRepeatOptions extends RepeatOptions {
  /**
    * Repeat every millis (cron setting cannot be used together with this setting.)
    */
  var every: Double = js.native
}

object EveryRepeatOptions {
  @scala.inline
  def apply(every: Double): EveryRepeatOptions = {
    val __obj = js.Dynamic.literal(every = every.asInstanceOf[js.Any])
    __obj.asInstanceOf[EveryRepeatOptions]
  }
  @scala.inline
  implicit class EveryRepeatOptionsOps[Self <: EveryRepeatOptions] (val x: Self) extends AnyVal {
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
    def setEvery(value: Double): Self = this.set("every", value.asInstanceOf[js.Any])
  }
  
}

