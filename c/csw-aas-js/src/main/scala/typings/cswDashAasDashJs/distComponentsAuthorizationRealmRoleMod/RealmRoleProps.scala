package typings.cswDashAasDashJs.distComponentsAuthorizationRealmRoleMod

import typings.react.reactMod.ReactNode
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
  def apply(children: ReactNode, error: ReactNode, realmRole: String): RealmRoleProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], realmRole = realmRole)
  
    __obj.asInstanceOf[RealmRoleProps]
  }
}

