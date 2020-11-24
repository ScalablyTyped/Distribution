package typings.cliTable3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Cell = typings.cliTable3.mod.CellValue | typings.cliTable3.mod.CellOptions
  
  type CellValue = js.UndefOr[scala.Boolean | scala.Double | java.lang.String | scala.Null]
  
  type CrossTableRow = org.scalablytyped.runtime.StringDictionary[js.Array[typings.cliTable3.mod.Cell]]
  
  type HorizontalTableRow = js.Array[typings.cliTable3.mod.Cell]
  
  type Table = typings.cliTable3.mod.GenericTable[
    typings.cliTable3.mod.HorizontalTableRow | typings.cliTable3.mod.VerticalTableRow | typings.cliTable3.mod.CrossTableRow
  ]
  
  type VerticalTableRow = org.scalablytyped.runtime.StringDictionary[typings.cliTable3.mod.Cell]
}
