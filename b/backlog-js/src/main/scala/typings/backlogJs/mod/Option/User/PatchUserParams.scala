package typings.backlogJs.mod.Option.User

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchUserParams extends js.Object {
  var mailAddress: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var roleType: js.UndefOr[RoleType] = js.undefined
}

object PatchUserParams {
  @scala.inline
  def apply(
    mailAddress: String = null,
    name: String = null,
    password: String = null,
    roleType: RoleType = null
  ): PatchUserParams = {
    val __obj = js.Dynamic.literal()
    if (mailAddress != null) __obj.updateDynamic("mailAddress")(mailAddress.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (roleType != null) __obj.updateDynamic("roleType")(roleType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchUserParams]
  }
}

