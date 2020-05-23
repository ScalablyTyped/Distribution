package typings.coreObject.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Super[Base] extends js.Object {
  var _super: typings.coreObject.utilsMod.Super[Base]
}

object Super {
  @scala.inline
  def apply[Base](_super: typings.coreObject.utilsMod.Super[Base]): Super[Base] = {
    val __obj = js.Dynamic.literal(_super = _super.asInstanceOf[js.Any])
    __obj.asInstanceOf[Super[Base]]
  }
}

