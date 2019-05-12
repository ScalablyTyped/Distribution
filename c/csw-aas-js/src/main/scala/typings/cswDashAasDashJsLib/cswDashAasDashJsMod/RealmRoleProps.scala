package typings
package cswDashAasDashJsLib.cswDashAasDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealmRoleProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var error: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var realmRole: java.lang.String
}

object RealmRoleProps {
  @scala.inline
  def apply(
    realmRole: java.lang.String,
    children: reactLib.reactMod.ReactNode = null,
    error: reactLib.reactMod.ReactNode = null
  ): RealmRoleProps = {
    val __obj = js.Dynamic.literal(realmRole = realmRole)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealmRoleProps]
  }
}

