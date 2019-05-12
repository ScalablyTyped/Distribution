package typings
package cswDashAasDashJsLib.cswDashAasDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientRoleProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var client: js.UndefOr[java.lang.String] = js.undefined
  var clientRole: java.lang.String
  var error: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object ClientRoleProps {
  @scala.inline
  def apply(
    clientRole: java.lang.String,
    children: reactLib.reactMod.ReactNode = null,
    client: java.lang.String = null,
    error: reactLib.reactMod.ReactNode = null
  ): ClientRoleProps = {
    val __obj = js.Dynamic.literal(clientRole = clientRole)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client)
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientRoleProps]
  }
}

