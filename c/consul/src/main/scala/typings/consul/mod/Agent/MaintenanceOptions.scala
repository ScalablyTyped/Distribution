package typings.consul.mod.Agent

import typings.consul.mod.CommonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceOptions extends CommonOptions {
  var enable: Boolean = js.native
  var reason: js.UndefOr[String] = js.native
}

object MaintenanceOptions {
  @scala.inline
  def apply(enable: Boolean): MaintenanceOptions = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceOptions]
  }
  @scala.inline
  implicit class MaintenanceOptionsOps[Self <: MaintenanceOptions] (val x: Self) extends AnyVal {
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
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
  
}

