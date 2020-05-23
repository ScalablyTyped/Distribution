package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Description extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var global: js.UndefOr[Boolean] = js.undefined
  var suggested_key: js.UndefOr[Chromeos] = js.undefined
}

object Description {
  @scala.inline
  def apply(
    description: String = null,
    global: js.UndefOr[Boolean] = js.undefined,
    suggested_key: Chromeos = null
  ): Description = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.get.asInstanceOf[js.Any])
    if (suggested_key != null) __obj.updateDynamic("suggested_key")(suggested_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
}

