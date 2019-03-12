package typings
package backgridLib.backgridMod.BackgridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellFormatter extends js.Object {
  def fromRaw(rawData: js.Any, model: backboneLib.backboneMod.Model): js.Any
  def toRaw(formattedData: js.Any, model: backboneLib.backboneMod.Model): js.Any
}

object CellFormatter {
  @scala.inline
  def apply(
    fromRaw: (js.Any, backboneLib.backboneMod.Model) => js.Any,
    toRaw: (js.Any, backboneLib.backboneMod.Model) => js.Any
  ): CellFormatter = {
    val __obj = js.Dynamic.literal(fromRaw = js.Any.fromFunction2(fromRaw), toRaw = js.Any.fromFunction2(toRaw))
  
    __obj.asInstanceOf[CellFormatter]
  }
}

