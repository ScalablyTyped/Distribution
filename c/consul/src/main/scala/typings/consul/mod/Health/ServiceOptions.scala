package typings.consul.mod.Health

import typings.consul.mod.CommonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceOptions extends CommonOptions {
  var near: js.UndefOr[String] = js.native
  var passing: js.UndefOr[Boolean] = js.native
  var service: String = js.native
  var tag: js.UndefOr[String] = js.native
}

object ServiceOptions {
  @scala.inline
  def apply(service: String): ServiceOptions = {
    val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceOptions]
  }
  @scala.inline
  implicit class ServiceOptionsOps[Self <: ServiceOptions] (val x: Self) extends AnyVal {
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
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def setNear(value: String): Self = this.set("near", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNear: Self = this.set("near", js.undefined)
    @scala.inline
    def setPassing(value: Boolean): Self = this.set("passing", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassing: Self = this.set("passing", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}

