package typings.cfenv.mod

import typings.cfenv.anon.Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAppEnvOptions extends js.Object {
  var name: js.UndefOr[String] = js.native
  var protocol: js.UndefOr[String] = js.native
  var vcap: js.UndefOr[Application] = js.native
  var vcapFile: js.UndefOr[String] = js.native
}

object GetAppEnvOptions {
  @scala.inline
  def apply(): GetAppEnvOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAppEnvOptions]
  }
  @scala.inline
  implicit class GetAppEnvOptionsOps[Self <: GetAppEnvOptions] (val x: Self) extends AnyVal {
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
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setVcap(value: Application): Self = this.set("vcap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVcap: Self = this.set("vcap", js.undefined)
    @scala.inline
    def setVcapFile(value: String): Self = this.set("vcapFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVcapFile: Self = this.set("vcapFile", js.undefined)
  }
  
}

