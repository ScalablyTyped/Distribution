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
  def apply(clientRole: String, children: ReactNode = null, client: String = null, error: ReactNode = null): ClientRoleProps = {
    val __obj = js.Dynamic.literal(clientRole = clientRole)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client)
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientRoleProps]
  }
}

