package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConfigResponse extends js.Object {
  /**
    * The certificate file containing the server.pem files of the HSMs.
    */
  var ConfigCred: js.UndefOr[String] = js.native
  /**
    * The chrystoki.conf configuration file.
    */
  var ConfigFile: js.UndefOr[String] = js.native
  /**
    * The type of credentials.
    */
  var ConfigType: js.UndefOr[String] = js.native
}

object GetConfigResponse {
  @scala.inline
  def apply(): GetConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConfigResponse]
  }
  @scala.inline
  implicit class GetConfigResponseOps[Self <: GetConfigResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfigCred(value: String): Self = this.set("ConfigCred", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigCred: Self = this.set("ConfigCred", js.undefined)
    @scala.inline
    def setConfigFile(value: String): Self = this.set("ConfigFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigFile: Self = this.set("ConfigFile", js.undefined)
    @scala.inline
    def setConfigType(value: String): Self = this.set("ConfigType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigType: Self = this.set("ConfigType", js.undefined)
  }
  
}

