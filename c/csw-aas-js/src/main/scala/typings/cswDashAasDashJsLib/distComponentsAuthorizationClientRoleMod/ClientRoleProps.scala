package typings
package cswDashAasDashJsLib.distComponentsAuthorizationClientRoleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientRoleProps extends js.Object {
  var children: reactLib.reactMod.ReactNode
  var client: js.UndefOr[java.lang.String] = js.undefined
  var clientRole: java.lang.String
  var error: reactLib.reactMod.ReactNode
}

object ClientRoleProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    clientRole: java.lang.String,
    error: reactLib.reactMod.ReactNode,
    client: java.lang.String = null
  ): ClientRoleProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], clientRole = clientRole, error = error.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client)
    __obj.asInstanceOf[ClientRoleProps]
  }
}

