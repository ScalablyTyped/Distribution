package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enviroment Variables
  * User
  * interfaces
  */
// chayns.env.user.groups
trait UserGroup extends js.Object {
  var id: scala.Double
  var isActive: js.UndefOr[scala.Boolean] = js.undefined
  var isSystemGroup: js.UndefOr[scala.Boolean] = js.undefined
  var name: java.lang.String
  var showName: js.UndefOr[java.lang.String] = js.undefined
}

object UserGroup {
  @scala.inline
  def apply(
    id: scala.Double,
    name: java.lang.String,
    isActive: js.UndefOr[scala.Boolean] = js.undefined,
    isSystemGroup: js.UndefOr[scala.Boolean] = js.undefined,
    showName: java.lang.String = null
  ): UserGroup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive)
    if (!js.isUndefined(isSystemGroup)) __obj.updateDynamic("isSystemGroup")(isSystemGroup)
    if (showName != null) __obj.updateDynamic("showName")(showName)
    __obj.asInstanceOf[UserGroup]
  }
}

