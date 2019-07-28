package typings.cswDashAasDashJs.distComponentsContextAuthContextProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthContextConfig extends js.Object {
  var clientId: String
  var realm: String
}

object AuthContextConfig {
  @scala.inline
  def apply(clientId: String, realm: String): AuthContextConfig = {
    val __obj = js.Dynamic.literal(clientId = clientId, realm = realm)
  
    __obj.asInstanceOf[AuthContextConfig]
  }
}

