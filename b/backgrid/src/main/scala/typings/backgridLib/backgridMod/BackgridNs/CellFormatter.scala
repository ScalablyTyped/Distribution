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
    fromRaw: js.Function2[js.Any, backboneLib.backboneMod.Model, js.Any],
    toRaw: js.Function2[js.Any, backboneLib.backboneMod.Model, js.Any]
  ): CellFormatter = {
    val __obj = js.Dynamic.literal(fromRaw = fromRaw, toRaw = toRaw)
  
    __obj.asInstanceOf[CellFormatter]
  }
}

