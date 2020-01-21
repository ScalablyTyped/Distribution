package typings.cliTable2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Cell = typings.cliTable2.mod.CellValue | typings.cliTable2.mod.CellOptions
  type CellValue = js.UndefOr[scala.Boolean | scala.Double | java.lang.String | scala.Null]
  type CrossTable = typings.cliTable2.mod.GenericTable[typings.cliTable2.mod.CrossTableRow]
  type CrossTableRow = org.scalablytyped.runtime.StringDictionary[js.Array[typings.cliTable2.mod.Cell]]
  type HorizontalTable = typings.cliTable2.mod.GenericTable[typings.cliTable2.mod.HorizontalTableRow]
  type HorizontalTableRow = js.Array[typings.cliTable2.mod.Cell]
  type Table = typings.cliTable2.mod.HorizontalTable | typings.cliTable2.mod.VerticalTable | typings.cliTable2.mod.CrossTable
  type VerticalTable = typings.cliTable2.mod.GenericTable[typings.cliTable2.mod.VerticalTableRow]
  type VerticalTableRow = org.scalablytyped.runtime.StringDictionary[typings.cliTable2.mod.Cell]
}
