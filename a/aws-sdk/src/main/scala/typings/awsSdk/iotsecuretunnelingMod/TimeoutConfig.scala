package typings.awsSdk.iotsecuretunnelingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeoutConfig extends js.Object {
  /**
    * The maximum amount of time (in minutes) a tunnel can remain open. If not specified, maxLifetimeTimeoutMinutes defaults to 720 minutes. Valid values are from 1 minute to 12 hours (720 minutes) 
    */
  var maxLifetimeTimeoutMinutes: js.UndefOr[TimeoutInMin] = js.native
}

object TimeoutConfig {
  @scala.inline
  def apply(): TimeoutConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeoutConfig]
  }
  @scala.inline
  implicit class TimeoutConfigOps[Self <: TimeoutConfig] (val x: Self) extends AnyVal {
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
    def setMaxLifetimeTimeoutMinutes(value: TimeoutInMin): Self = this.set("maxLifetimeTimeoutMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLifetimeTimeoutMinutes: Self = this.set("maxLifetimeTimeoutMinutes", js.undefined)
  }
  
}

