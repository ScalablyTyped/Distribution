package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var global: js.UndefOr[Boolean] = js.undefined
  var suggested_key: js.UndefOr[Anon_Chromeos] = js.undefined
}

object Anon_Description {
  @scala.inline
  def apply(
    description: String = null,
    global: js.UndefOr[Boolean] = js.undefined,
    suggested_key: Anon_Chromeos = null
  ): Anon_Description = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    if (suggested_key != null) __obj.updateDynamic("suggested_key")(suggested_key)
    __obj.asInstanceOf[Anon_Description]
  }
}

