package typings.catalog

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefault extends js.Object {
  var default: ComponentType[js.Object]
}

object AnonDefault {
  @scala.inline
  def apply(default: ComponentType[js.Object]): AnonDefault = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefault]
  }
}

