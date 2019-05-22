package typings
package cswDashAasDashJsLib.distComponentsAuthorizationRealmRoleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealmRoleProps extends js.Object {
  var children: reactLib.reactMod.ReactNode
  var error: reactLib.reactMod.ReactNode
  var realmRole: java.lang.String
}

object RealmRoleProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    error: reactLib.reactMod.ReactNode,
    realmRole: java.lang.String
  ): RealmRoleProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], realmRole = realmRole)
  
    __obj.asInstanceOf[RealmRoleProps]
  }
}

