package typings.backlogJs.mod.Option.Group

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostGroupsParams extends js.Object {
  var members: js.UndefOr[js.Array[String]] = js.undefined
  var name: String
}

object PostGroupsParams {
  @scala.inline
  def apply(name: String, members: js.Array[String] = null): PostGroupsParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (members != null) __obj.updateDynamic("members")(members.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostGroupsParams]
  }
}

