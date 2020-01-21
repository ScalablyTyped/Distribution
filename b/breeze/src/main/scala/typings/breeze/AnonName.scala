package typings.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var serializerFn: js.UndefOr[js.Function] = js.undefined
}

object AnonName {
  @scala.inline
  def apply(name: String = null, serializerFn: js.Function = null): AnonName = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (serializerFn != null) __obj.updateDynamic("serializerFn")(serializerFn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

