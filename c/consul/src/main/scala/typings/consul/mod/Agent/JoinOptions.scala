package typings.consul.mod.Agent

import typings.consul.mod.CommonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JoinOptions extends CommonOptions {
  var address: String = js.native
}

object JoinOptions {
  @scala.inline
  def apply(address: String): JoinOptions = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinOptions]
  }
  @scala.inline
  implicit class JoinOptionsOps[Self <: JoinOptions] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
  }
  
}

