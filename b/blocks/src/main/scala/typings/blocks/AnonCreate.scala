package typings.blocks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreate extends js.Object {
  var create: js.UndefOr[AnonUrl] = js.undefined
  var destroy: js.UndefOr[AnonUrl] = js.undefined
  var read: js.UndefOr[AnonUrl] = js.undefined
  var update: js.UndefOr[AnonUrl] = js.undefined
}

object AnonCreate {
  @scala.inline
  def apply(create: AnonUrl = null, destroy: AnonUrl = null, read: AnonUrl = null, update: AnonUrl = null): AnonCreate = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCreate]
  }
}

