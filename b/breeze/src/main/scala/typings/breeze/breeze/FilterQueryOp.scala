package typings.breeze.breeze

import typings.breeze.breeze.core.EnumSymbol
import typings.breeze.breeze.core.IEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterQueryOp extends IEnum {
  var All: FilterQueryOpSymbol = js.native
  var Any: FilterQueryOpSymbol = js.native
  var Contains: FilterQueryOpSymbol = js.native
  var EndsWith: FilterQueryOpSymbol = js.native
  var Equals: FilterQueryOpSymbol = js.native
  var GreaterThan: FilterQueryOpSymbol = js.native
  var GreaterThanOrEqual: FilterQueryOpSymbol = js.native
  var IsTypeOf: FilterQueryOpSymbol = js.native
  var LessThan: FilterQueryOpSymbol = js.native
  var LessThanOrEqual: FilterQueryOpSymbol = js.native
  var NotEquals: FilterQueryOpSymbol = js.native
  var StartsWith: FilterQueryOpSymbol = js.native
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
  @scala.inline
  implicit class FilterQueryOpOps[Self <: FilterQueryOp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAll(value: FilterQueryOpSymbol): Self = this.set("All", value.asInstanceOf[js.Any])
    @scala.inline
    def setAny(value: FilterQueryOpSymbol): Self = this.set("Any", value.asInstanceOf[js.Any])
    @scala.inline
    def setContains(value: FilterQueryOpSymbol): Self = this.set("Contains", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndsWith(value: FilterQueryOpSymbol): Self = this.set("EndsWith", value.asInstanceOf[js.Any])
    @scala.inline
    def setEquals(value: FilterQueryOpSymbol): Self = this.set("Equals", value.asInstanceOf[js.Any])
    @scala.inline
    def setGreaterThan(value: FilterQueryOpSymbol): Self = this.set("GreaterThan", value.asInstanceOf[js.Any])
    @scala.inline
    def setGreaterThanOrEqual(value: FilterQueryOpSymbol): Self = this.set("GreaterThanOrEqual", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsTypeOf(value: FilterQueryOpSymbol): Self = this.set("IsTypeOf", value.asInstanceOf[js.Any])
    @scala.inline
    def setLessThan(value: FilterQueryOpSymbol): Self = this.set("LessThan", value.asInstanceOf[js.Any])
    @scala.inline
    def setLessThanOrEqual(value: FilterQueryOpSymbol): Self = this.set("LessThanOrEqual", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotEquals(value: FilterQueryOpSymbol): Self = this.set("NotEquals", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartsWith(value: FilterQueryOpSymbol): Self = this.set("StartsWith", value.asInstanceOf[js.Any])
  }
  
}

