package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescription extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var global: js.UndefOr[Boolean] = js.undefined
  var suggested_key: js.UndefOr[AnonChromeos] = js.undefined
}

object AnonDescription {
  @scala.inline
  def apply(
    description: String = null,
    global: js.UndefOr[Boolean] = js.undefined,
    suggested_key: AnonChromeos = null
  ): AnonDescription = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (suggested_key != null) __obj.updateDynamic("suggested_key")(suggested_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescription]
  }
}

