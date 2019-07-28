package typings.breeze.breezeNs

import typings.breeze.breezeNs.coreNs.EnumSymbol
import typings.breeze.breezeNs.coreNs.IEnum
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
    val __obj = js.Dynamic.literal(All = All, Any = Any, Contains = Contains, EndsWith = EndsWith, Equals = Equals, GreaterThan = GreaterThan, GreaterThanOrEqual = GreaterThanOrEqual, IsTypeOf = IsTypeOf, LessThan = LessThan, LessThanOrEqual = LessThanOrEqual, NotEquals = NotEquals, StartsWith = StartsWith, contains = js.Any.fromFunction1(contains), fromName = js.Any.fromFunction1(fromName), getNames = js.Any.fromFunction0(getNames), getSymbols = js.Any.fromFunction0(getSymbols))
  
    __obj.asInstanceOf[FilterQueryOp]
  }
}

