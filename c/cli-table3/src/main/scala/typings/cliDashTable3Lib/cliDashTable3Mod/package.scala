package typings
package cliDashTable3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cliDashTable3Mod {
  type Cell = CellValue | CellOptions
  type CellValue = js.UndefOr[scala.Boolean | scala.Double | java.lang.String | scala.Null]
  type CrossTable = GenericTable[CrossTableRow]
  type CrossTableRow = org.scalablytyped.runtime.StringDictionary[js.Array[Cell]]
  type HorizontalTable = GenericTable[HorizontalTableRow]
  type HorizontalTableRow = js.Array[Cell]
  type Table = HorizontalTable | VerticalTable | CrossTable
  type VerticalTable = GenericTable[VerticalTableRow]
  type VerticalTableRow = org.scalablytyped.runtime.StringDictionary[Cell]
}
