package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellMetaSettings extends js.Object {
  var col: scala.Double
  var row: scala.Double
  var settings: Settings
}

object CellMetaSettings {
  @scala.inline
  def apply(col: scala.Double, row: scala.Double, settings: Settings): CellMetaSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("col")(col)
    __obj.updateDynamic("row")(row)
    __obj.updateDynamic("settings")(settings)
    __obj.asInstanceOf[CellMetaSettings]
  }
}

