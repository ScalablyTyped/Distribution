package typings.breeze.breeze

import typings.breeze.breeze.core.EnumSymbol
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

object FilterQueryOp {
  @scala.inline
  def apply(
    All: FilterQueryOpSymbol,
    Any: FilterQueryOpSymbol,
    Contains: FilterQueryOpSymbol,
    EndsWith: FilterQueryOpSymbol,
    Equals: FilterQueryOpSymbol,
    GreaterThan: FilterQueryOpSymbol,
    GreaterThanOrEqual: FilterQueryOpSymbol,
    IsTypeOf: FilterQueryOpSymbol,
    LessThan: FilterQueryOpSymbol,
    LessThanOrEqual: FilterQueryOpSymbol,
    NotEquals: FilterQueryOpSymbol,
    StartsWith: FilterQueryOpSymbol,
    contains: js.Any => Boolean,
    fromName: String => EnumSymbol,
    getNames: () => js.Array[String],
    getSymbols: () => js.Array[EnumSymbol]
  ): FilterQueryOp = {
    val __obj = js.Dynamic.literal(All = All.asInstanceOf[js.Any], Any = Any.asInstanceOf[js.Any], Contains = Contains.asInstanceOf[js.Any], EndsWith = EndsWith.asInstanceOf[js.Any], Equals = Equals.asInstanceOf[js.Any], GreaterThan = GreaterThan.asInstanceOf[js.Any], GreaterThanOrEqual = GreaterThanOrEqual.asInstanceOf[js.Any], IsTypeOf = IsTypeOf.asInstanceOf[js.Any], LessThan = LessThan.asInstanceOf[js.Any], LessThanOrEqual = LessThanOrEqual.asInstanceOf[js.Any], NotEquals = NotEquals.asInstanceOf[js.Any], StartsWith = StartsWith.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), fromName = js.Any.fromFunction1(fromName), getNames = js.Any.fromFunction0(getNames), getSymbols = js.Any.fromFunction0(getSymbols))
    __obj.asInstanceOf[FilterQueryOp]
  }
}

