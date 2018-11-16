package typings
package backgridLib.backgridMod.BackgridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CellFormatter extends js.Object {
  def fromRaw(rawData: js.Any, model: backboneLib.backboneMod.Model): js.Any
  def toRaw(formattedData: js.Any, model: backboneLib.backboneMod.Model): js.Any
}

