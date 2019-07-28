package typings.atBlueprintjsTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libEsmCommonGridMod {
  type ICellMapper[T] = js.Function2[/* rowIndex */ Double, /* columnIndex */ Double, T]
  type IColumnMapper[T] = js.Function1[/* columnIndex */ Double, T]
  type IRowMapper[T] = js.Function1[/* rowIndex */ Double, T]
}
