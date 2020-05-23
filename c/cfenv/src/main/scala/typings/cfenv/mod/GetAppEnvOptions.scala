package typings.cfenv.mod

import typings.cfenv.anon.Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAppEnvOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var vcap: js.UndefOr[Application] = js.undefined
  var vcapFile: js.UndefOr[String] = js.undefined
}

object GetAppEnvOptions {
  @scala.inline
  def apply(name: String = null, protocol: String = null, vcap: Application = null, vcapFile: String = null): GetAppEnvOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (vcap != null) __obj.updateDynamic("vcap")(vcap.asInstanceOf[js.Any])
    if (vcapFile != null) __obj.updateDynamic("vcapFile")(vcapFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppEnvOptions]
  }
}

