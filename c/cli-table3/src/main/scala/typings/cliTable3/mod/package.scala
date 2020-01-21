package typings.cliTable3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Cell = typings.cliTable3.mod.CellValue | typings.cliTable3.mod.CellOptions
  type CellValue = js.UndefOr[scala.Boolean | scala.Double | java.lang.String | scala.Null]
  type CrossTable = typings.cliTable3.mod.GenericTable[typings.cliTable3.mod.CrossTableRow]
  type CrossTableRow = org.scalablytyped.runtime.StringDictionary[js.Array[typings.cliTable3.mod.Cell]]
  type HorizontalTable = typings.cliTable3.mod.GenericTable[typings.cliTable3.mod.HorizontalTableRow]
  type HorizontalTableRow = js.Array[typings.cliTable3.mod.Cell]
  type Table = typings.cliTable3.mod.HorizontalTable | typings.cliTable3.mod.VerticalTable | typings.cliTable3.mod.CrossTable
  type VerticalTable = typings.cliTable3.mod.GenericTable[typings.cliTable3.mod.VerticalTableRow]
  type VerticalTableRow = org.scalablytyped.runtime.StringDictionary[typings.cliTable3.mod.Cell]
}
