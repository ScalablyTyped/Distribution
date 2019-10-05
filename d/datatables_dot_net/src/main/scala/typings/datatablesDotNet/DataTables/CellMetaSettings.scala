package typings.datatablesDotNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellMetaSettings extends js.Object {
  var col: Double
  var row: Double
  var settings: Settings
}

object CellMetaSettings {
  @scala.inline
  def apply(col: Double, row: Double, settings: Settings): CellMetaSettings = {
    val __obj = js.Dynamic.literal(col = col, row = row, settings = settings)
  
    __obj.asInstanceOf[CellMetaSettings]
  }
}

