package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterQueryOp
  extends breezeLib.breezeNs.coreNs.IEnum {
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
    contains: js.Function1[js.Any, scala.Boolean],
    fromName: js.Function1[java.lang.String, breezeLib.breezeNs.coreNs.EnumSymbol],
    getNames: js.Function0[js.Array[java.lang.String]],
    getSymbols: js.Function0[js.Array[breezeLib.breezeNs.coreNs.EnumSymbol]]
  ): FilterQueryOp = {
    val __obj = js.Dynamic.literal(All = All, Any = Any, Contains = Contains, EndsWith = EndsWith, Equals = Equals, GreaterThan = GreaterThan, GreaterThanOrEqual = GreaterThanOrEqual, IsTypeOf = IsTypeOf, LessThan = LessThan, LessThanOrEqual = LessThanOrEqual, NotEquals = NotEquals, StartsWith = StartsWith, contains = contains, fromName = fromName, getNames = getNames, getSymbols = getSymbols)
  
    __obj.asInstanceOf[FilterQueryOp]
  }
}

