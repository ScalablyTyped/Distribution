package typings
package cswDashAasDashJsLib.distComponentsContextAuthContextProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthContextConfig extends js.Object {
  var clientId: java.lang.String
  var realm: java.lang.String
}

object AuthContextConfig {
  @scala.inline
  def apply(clientId: java.lang.String, realm: java.lang.String): AuthContextConfig = {
    val __obj = js.Dynamic.literal(clientId = clientId, realm = realm)
  
    __obj.asInstanceOf[AuthContextConfig]
  }
}

