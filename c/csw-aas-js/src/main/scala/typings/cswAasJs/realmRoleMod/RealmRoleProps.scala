package typings.cswAasJs.realmRoleMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealmRoleProps extends js.Object {
  var children: ReactNode
  var error: ReactNode
  var realmRole: String
}

object RealmRoleProps {
  @scala.inline
  def apply(realmRole: String, children: ReactNode = null, error: ReactNode = null): RealmRoleProps = {
    val __obj = js.Dynamic.literal(realmRole = realmRole.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealmRoleProps]
  }
}

