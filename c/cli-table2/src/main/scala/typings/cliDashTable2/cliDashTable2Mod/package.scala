package typings.cliDashTable2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cliDashTable2Mod {
  type Cell = CellValue | CellOptions
  type CellValue = js.UndefOr[Boolean | Double | String | Null]
  type CrossTable = GenericTable[CrossTableRow]
  type CrossTableRow = StringDictionary[js.Array[Cell]]
  type HorizontalTable = GenericTable[HorizontalTableRow]
  type HorizontalTableRow = js.Array[Cell]
  type Table = HorizontalTable | VerticalTable | CrossTable
  type VerticalTable = GenericTable[VerticalTableRow]
  type VerticalTableRow = StringDictionary[Cell]
}
