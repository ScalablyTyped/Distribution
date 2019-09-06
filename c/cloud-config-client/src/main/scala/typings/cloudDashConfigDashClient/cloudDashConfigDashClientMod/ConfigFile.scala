package typings.cloudDashConfigDashClient.cloudDashConfigDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigFile extends js.Object {
  var name: String
  var source: ConfigSource
}

object ConfigFile {
  @scala.inline
  def apply(name: String, source: ConfigSource): ConfigFile = {
    val __obj = js.Dynamic.literal(name = name, source = source)
  
    __obj.asInstanceOf[ConfigFile]
  }
}

