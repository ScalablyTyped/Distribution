package typings
package coreDashObjectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Super[Base] extends js.Object {
  var _super: coreDashObjectLib.dashPrivateUtilsMod.Super[Base]
}

object Anon_Super {
  @scala.inline
  def apply[Base](_super: coreDashObjectLib.dashPrivateUtilsMod.Super[Base]): Anon_Super[Base] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_super")(_super)
    __obj.asInstanceOf[Anon_Super[Base]]
  }
}

