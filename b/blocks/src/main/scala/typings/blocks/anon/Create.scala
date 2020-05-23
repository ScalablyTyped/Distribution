package typings.blocks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Create extends js.Object {
  var create: js.UndefOr[Url] = js.undefined
  var destroy: js.UndefOr[Url] = js.undefined
  var read: js.UndefOr[Url] = js.undefined
  var update: js.UndefOr[Url] = js.undefined
}

object Create {
  @scala.inline
  def apply(create: Url = null, destroy: Url = null, read: Url = null, update: Url = null): Create = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[Create]
  }
}

