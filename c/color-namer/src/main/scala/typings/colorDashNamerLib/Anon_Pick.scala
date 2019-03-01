package typings
package colorDashNamerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pick[T /* <: colorDashNamerLib.colorDashNamerMod.ColorNamerNs.Palette */] extends js.Object {
  var pick: js.Array[T]
}

object Anon_Pick {
  @scala.inline
  def apply[T /* <: colorDashNamerLib.colorDashNamerMod.ColorNamerNs.Palette */](pick: js.Array[T]): Anon_Pick[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pick")(pick)
    __obj.asInstanceOf[Anon_Pick[T]]
  }
}

