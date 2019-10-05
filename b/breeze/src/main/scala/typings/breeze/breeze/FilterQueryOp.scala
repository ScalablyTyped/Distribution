package typings.breeze.breeze

import org.scalablytyped.runtime.TopLevel
import typings.breeze.breeze.core.IEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterQueryOp extends IEnum {
  var All: FilterQueryOpSymbol
  var Any: FilterQueryOpSymbol
  var Contains: FilterQueryOpSymbol
  var EndsWith: FilterQueryOpSymbol
  var Equals: FilterQueryOpSymbol
  var GreaterThan: FilterQueryOpSymbol
  var GreaterThanOrEqual: FilterQueryOpSymbol
  var IsTypeOf: FilterQueryOpSymbol
  var LessThan: FilterQueryOpSymbol
  var LessThanOrEqual: FilterQueryOpSymbol
  var NotEquals: FilterQueryOpSymbol
  var StartsWith: FilterQueryOpSymbol
}

@JSGlobal("breeze.FilterQueryOp")
@js.native
object FilterQueryOp extends TopLevel[FilterQueryOp]

