package typings
package cswDashAasDashJsLib.cswDashAasDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthConfig extends js.Object {
  var clientId: java.lang.String
  var realm: java.lang.String
}

object AuthConfig {
  @scala.inline
  def apply(clientId: java.lang.String, realm: java.lang.String): AuthConfig = {
    val __obj = js.Dynamic.literal(clientId = clientId, realm = realm)
  
    __obj.asInstanceOf[AuthConfig]
  }
}

