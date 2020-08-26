package typings.consul.mod.Catalog.Service

import typings.consul.mod.CommonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodesOptions extends CommonOptions {
  var service: String = js.native
  var tag: js.UndefOr[String] = js.native
}

object NodesOptions {
  @scala.inline
  def apply(service: String): NodesOptions = {
    val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesOptions]
  }
  @scala.inline
  implicit class NodesOptionsOps[Self <: NodesOptions] (val x: Self) extends AnyVal {
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
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}

