package typings.bonjour.mod

import typings.bonjour.bonjourStrings.tcp
import typings.bonjour.bonjourStrings.udp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceOptions extends js.Object {
  var host: js.UndefOr[String] = js.native
  var name: String = js.native
  var port: Double = js.native
  var probe: js.UndefOr[Boolean] = js.native
  var protocol: js.UndefOr[udp | tcp] = js.native
  var subtypes: js.UndefOr[js.Array[String]] = js.native
  var txt: js.UndefOr[js.Object] = js.native
  var `type`: String = js.native
}

object ServiceOptions {
  @scala.inline
  def apply(name: String, port: Double, `type`: String): ServiceOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setProbe(value: Boolean): Self = this.set("probe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProbe: Self = this.set("probe", js.undefined)
    @scala.inline
    def setProtocol(value: udp | tcp): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setSubtypesVarargs(value: String*): Self = this.set("subtypes", js.Array(value :_*))
    @scala.inline
    def setSubtypes(value: js.Array[String]): Self = this.set("subtypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtypes: Self = this.set("subtypes", js.undefined)
    @scala.inline
    def setTxt(value: js.Object): Self = this.set("txt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTxt: Self = this.set("txt", js.undefined)
  }
  
}

