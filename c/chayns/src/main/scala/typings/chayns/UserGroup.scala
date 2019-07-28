package typings.chayns

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
  var id: Double
  var isActive: js.UndefOr[Boolean] = js.undefined
  var isSystemGroup: js.UndefOr[Boolean] = js.undefined
  var name: String
  var showName: js.UndefOr[String] = js.undefined
}

object UserGroup {
  @scala.inline
  def apply(
    id: Double,
    name: String,
    isActive: js.UndefOr[Boolean] = js.undefined,
    isSystemGroup: js.UndefOr[Boolean] = js.undefined,
    showName: String = null
  ): UserGroup = {
    val __obj = js.Dynamic.literal(id = id, name = name)
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive)
    if (!js.isUndefined(isSystemGroup)) __obj.updateDynamic("isSystemGroup")(isSystemGroup)
    if (showName != null) __obj.updateDynamic("showName")(showName)
    __obj.asInstanceOf[UserGroup]
  }
}

