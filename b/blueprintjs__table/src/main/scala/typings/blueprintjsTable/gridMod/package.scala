package typings.blueprintjsTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object gridMod {
  
  type ICellMapper[T] = js.Function2[/* rowIndex */ scala.Double, /* columnIndex */ scala.Double, T]
  
  type IColumnMapper[T] = js.Function1[/* columnIndex */ scala.Double, T]
  
  type IRowMapper[T] = js.Function1[/* rowIndex */ scala.Double, T]
}
