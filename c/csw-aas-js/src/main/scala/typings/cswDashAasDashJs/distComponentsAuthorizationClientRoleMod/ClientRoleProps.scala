package typings.cswDashAasDashJs.distComponentsAuthorizationClientRoleMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientRoleProps extends js.Object {
  var children: ReactNode
  var client: js.UndefOr[String] = js.undefined
  var clientRole: String
  var error: ReactNode
}

object ClientRoleProps {
  @scala.inline
  def apply(children: ReactNode, clientRole: String, error: ReactNode, client: String = null): ClientRoleProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], clientRole = clientRole, error = error.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client)
    __obj.asInstanceOf[ClientRoleProps]
  }
}

