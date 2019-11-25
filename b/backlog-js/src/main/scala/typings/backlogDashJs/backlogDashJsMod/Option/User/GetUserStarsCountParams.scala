package typings.backlogDashJs.backlogDashJsMod.Option.User

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserStarsCountParams extends js.Object {
  var since: js.UndefOr[String] = js.undefined
  var until: js.UndefOr[String] = js.undefined
}

object GetUserStarsCountParams {
  @scala.inline
  def apply(since: String = null, until: String = null): GetUserStarsCountParams = {
    val __obj = js.Dynamic.literal()
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    if (until != null) __obj.updateDynamic("until")(until.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserStarsCountParams]
  }
}

