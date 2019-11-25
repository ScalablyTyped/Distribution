package typings.coreDashObject

import typings.coreDashObject.dashPrivateUtilsMod.Super
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Super[Base] extends js.Object {
  var _super: Super[Base]
}

object Anon_Super {
  @scala.inline
  def apply[Base](_super: Super[Base]): Anon_Super[Base] = {
    val __obj = js.Dynamic.literal(_super = _super.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Super[Base]]
  }
}

