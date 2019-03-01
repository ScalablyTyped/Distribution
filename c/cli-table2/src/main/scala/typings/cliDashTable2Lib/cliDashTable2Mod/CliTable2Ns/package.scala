package typings
package cliDashTable2Lib.cliDashTable2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CliTable2Ns {
  type Cell = CellValue | CellOptions
  type CellValue = js.UndefOr[scala.Boolean | scala.Double | java.lang.String | scala.Null]
  type CrossTable = GenericTable[CrossTableRow]
  type HorizontalTable = GenericTable[HorizontalTableRow]
  type HorizontalTableRow = js.Array[Cell]
  type Table = HorizontalTable | VerticalTable | CrossTable
  type VerticalTable = GenericTable[VerticalTableRow]
}
