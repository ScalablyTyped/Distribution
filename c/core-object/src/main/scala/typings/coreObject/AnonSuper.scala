package typings.coreObject

import typings.coreObject.utilsMod.Super
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSuper[Base] extends js.Object {
  var _super: Super[Base]
}

object AnonSuper {
  @scala.inline
  def apply[Base](_super: Super[Base]): AnonSuper[Base] = {
    val __obj = js.Dynamic.literal(_super = _super.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSuper[Base]]
  }
}

