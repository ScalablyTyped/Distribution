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
  def apply(ConfigCred: String = null, ConfigFile: String = null, ConfigType: String = null): GetConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (ConfigCred != null) __obj.updateDynamic("ConfigCred")(ConfigCred.asInstanceOf[js.Any])
    if (ConfigFile != null) __obj.updateDynamic("ConfigFile")(ConfigFile.asInstanceOf[js.Any])
    if (ConfigType != null) __obj.updateDynamic("ConfigType")(ConfigType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConfigResponse]
  }
}

