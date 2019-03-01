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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("All")(All)
    __obj.updateDynamic("Any")(Any)
    __obj.updateDynamic("Contains")(Contains)
    __obj.updateDynamic("EndsWith")(EndsWith)
    __obj.updateDynamic("Equals")(Equals)
    __obj.updateDynamic("GreaterThan")(GreaterThan)
    __obj.updateDynamic("GreaterThanOrEqual")(GreaterThanOrEqual)
    __obj.updateDynamic("IsTypeOf")(IsTypeOf)
    __obj.updateDynamic("LessThan")(LessThan)
    __obj.updateDynamic("LessThanOrEqual")(LessThanOrEqual)
    __obj.updateDynamic("NotEquals")(NotEquals)
    __obj.updateDynamic("StartsWith")(StartsWith)
    __obj.updateDynamic("contains")(contains)
    __obj.updateDynamic("fromName")(fromName)
    __obj.updateDynamic("getNames")(getNames)
    __obj.updateDynamic("getSymbols")(getSymbols)
    __obj.asInstanceOf[FilterQueryOp]
  }
}

