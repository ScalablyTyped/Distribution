package typings.cloudDashConfigDashClient.cloudDashConfigDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigData extends js.Object {
  var label: String
  var name: String
  var profiles: js.Array[String]
  var propertySources: js.Array[ConfigFile]
  var version: String
}

object ConfigData {
  @scala.inline
  def apply(
    label: String,
    name: String,
    profiles: js.Array[String],
    propertySources: js.Array[ConfigFile],
    version: String
  ): ConfigData = {
    val __obj = js.Dynamic.literal(label = label, name = name, profiles = profiles, propertySources = propertySources, version = version)
  
    __obj.asInstanceOf[ConfigData]
  }
}

