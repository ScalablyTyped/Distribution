package typings
package cliDashTable2Lib.cliDashTable2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CliTable2Ns {
  type Cell = CellValue | CellOptions
  type CellValue = js.UndefOr[scala.Boolean | scala.Double | java.lang.String | scala.Null]
  type CharName = cliDashTable2Lib.cliDashTable2LibStrings.top | cliDashTable2Lib.cliDashTable2LibStrings.`top-mid` | cliDashTable2Lib.cliDashTable2LibStrings.`top-left` | cliDashTable2Lib.cliDashTable2LibStrings.`top-right` | cliDashTable2Lib.cliDashTable2LibStrings.bottom | cliDashTable2Lib.cliDashTable2LibStrings.`bottom-mid` | cliDashTable2Lib.cliDashTable2LibStrings.`bottom-left` | cliDashTable2Lib.cliDashTable2LibStrings.`bottom-right` | cliDashTable2Lib.cliDashTable2LibStrings.left | cliDashTable2Lib.cliDashTable2LibStrings.`left-mid` | cliDashTable2Lib.cliDashTable2LibStrings.mid | cliDashTable2Lib.cliDashTable2LibStrings.`mid-mid` | cliDashTable2Lib.cliDashTable2LibStrings.right | cliDashTable2Lib.cliDashTable2LibStrings.`right-mid` | cliDashTable2Lib.cliDashTable2LibStrings.middle
  type CrossTable = GenericTable[CrossTableRow]
  type HorizontalAlignment = cliDashTable2Lib.cliDashTable2LibStrings.left | cliDashTable2Lib.cliDashTable2LibStrings.center | cliDashTable2Lib.cliDashTable2LibStrings.right
  type HorizontalTable = GenericTable[HorizontalTableRow]
  type HorizontalTableRow = js.Array[Cell]
  type Table = HorizontalTable | VerticalTable | CrossTable
  type VerticalAlignment = cliDashTable2Lib.cliDashTable2LibStrings.top | cliDashTable2Lib.cliDashTable2LibStrings.center | cliDashTable2Lib.cliDashTable2LibStrings.bottom
  type VerticalTable = GenericTable[VerticalTableRow]
}
