package typings
package atBlueprintjsTableLib.libEsmCommonCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICellCoordinates extends js.Object {
  var col: scala.Double
  var row: scala.Double
}

object ICellCoordinates {
  @scala.inline
  def apply(col: scala.Double, row: scala.Double): ICellCoordinates = {
    val __obj = js.Dynamic.literal(col = col, row = row)
  
    __obj.asInstanceOf[ICellCoordinates]
  }
}

