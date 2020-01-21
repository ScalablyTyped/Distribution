package typings.breeze.breeze

import typings.breeze.AnonDataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.Predicate")
@js.native
class Predicate () extends js.Object {
  def this(anArray: IRecursiveArray[String | Double | FilterQueryOpSymbol | Predicate]) = this()
    // for any/all clauses
  def this(passthru: String) = this()
  def this(predicate: Predicate) = this()
  def this(property: String, operator: String, value: js.Any) = this()
  def this(property: String, operator: String, value: AnonDataType) = this()
  def this(property: String, operator: FilterQueryOpSymbol, value: js.Any) = this()
  def this(property: String, operator: FilterQueryOpSymbol, value: AnonDataType) = this()
    // for any/all clauses
  def this(property: String, filterop: String, property2: String, filterop2: String, value: js.Any) = this()
  def this(
    property: String,
    filterop: FilterQueryOpSymbol,
    property2: String,
    filterop2: FilterQueryOpSymbol,
    value: js.Any
  ) = this()
  @JSName("and")
  var and_Original: PredicateMethod = js.native
  @JSName("or")
  var or_Original: PredicateMethod = js.native
  def and(predicates: Predicate*): Predicate = js.native
  def and(predicates: js.Array[Predicate]): Predicate = js.native
    // for any/all clauses
  def and(property: String, filterop: String, property2: String, filterop2: String, value: js.Any): Predicate = js.native
  def and(
    property: String,
    filterop: FilterQueryOpSymbol,
    property2: String,
    filterop2: FilterQueryOpSymbol,
    value: js.Any
  ): Predicate = js.native
  def and(property: String, operator: String, value: js.Any): Predicate = js.native
  def and(property: String, operator: String, value: js.Any, valueIsLiteral: Boolean): Predicate = js.native
  def and(property: String, operator: FilterQueryOpSymbol, value: js.Any): Predicate = js.native
  def and(property: String, operator: FilterQueryOpSymbol, value: js.Any, valueIsLiteral: Boolean): Predicate = js.native
  def not(): Predicate = js.native
  def or(predicates: Predicate*): Predicate = js.native
  def or(predicates: js.Array[Predicate]): Predicate = js.native
    // for any/all clauses
  def or(property: String, filterop: String, property2: String, filterop2: String, value: js.Any): Predicate = js.native
  def or(
    property: String,
    filterop: FilterQueryOpSymbol,
    property2: String,
    filterop2: FilterQueryOpSymbol,
    value: js.Any
  ): Predicate = js.native
  def or(property: String, operator: String, value: js.Any): Predicate = js.native
  def or(property: String, operator: String, value: js.Any, valueIsLiteral: Boolean): Predicate = js.native
  def or(property: String, operator: FilterQueryOpSymbol, value: js.Any): Predicate = js.native
  def or(property: String, operator: FilterQueryOpSymbol, value: js.Any, valueIsLiteral: Boolean): Predicate = js.native
  def toFunction(): js.Function = js.native
  def toJSON(): String = js.native
  def validate(entityType: EntityType): Unit = js.native
}

/* static members */
@JSGlobal("breeze.Predicate")
@js.native
object Predicate extends js.Object {
  @JSName("and")
  var and_Original: PredicateMethod = js.native
  @JSName("create")
  var create_Original: PredicateMethod = js.native
  @JSName("or")
  var or_Original: PredicateMethod = js.native
  def and(predicates: Predicate*): Predicate = js.native
  def and(predicates: js.Array[Predicate]): Predicate = js.native
    // for any/all clauses
  def and(property: String, filterop: String, property2: String, filterop2: String, value: js.Any): Predicate = js.native
  def and(
    property: String,
    filterop: FilterQueryOpSymbol,
    property2: String,
    filterop2: FilterQueryOpSymbol,
    value: js.Any
  ): Predicate = js.native
  def and(property: String, operator: String, value: js.Any): Predicate = js.native
  def and(property: String, operator: String, value: js.Any, valueIsLiteral: Boolean): Predicate = js.native
  def and(property: String, operator: FilterQueryOpSymbol, value: js.Any): Predicate = js.native
  def and(property: String, operator: FilterQueryOpSymbol, value: js.Any, valueIsLiteral: Boolean): Predicate = js.native
  def create(predicates: Predicate*): Predicate = js.native
  def create(predicates: js.Array[Predicate]): Predicate = js.native
    // for any/all clauses
  def create(property: String, filterop: String, property2: String, filterop2: String, value: js.Any): Predicate = js.native
  def create(
    property: String,
    filterop: FilterQueryOpSymbol,
    property2: String,
    filterop2: FilterQueryOpSymbol,
    value: js.Any
  ): Predicate = js.native
  def create(property: String, operator: String, value: js.Any): Predicate = js.native
  def create(property: String, operator: String, value: js.Any, valueIsLiteral: Boolean): Predicate = js.native
  def create(property: String, operator: FilterQueryOpSymbol, value: js.Any): Predicate = js.native
  def create(property: String, operator: FilterQueryOpSymbol, value: js.Any, valueIsLiteral: Boolean): Predicate = js.native
  def isPredicate(o: js.Any): Boolean = js.native
  def not(predicate: Predicate): Predicate = js.native
  def or(predicates: Predicate*): Predicate = js.native
  def or(predicates: js.Array[Predicate]): Predicate = js.native
    // for any/all clauses
  def or(property: String, filterop: String, property2: String, filterop2: String, value: js.Any): Predicate = js.native
  def or(
    property: String,
    filterop: FilterQueryOpSymbol,
    property2: String,
    filterop2: FilterQueryOpSymbol,
    value: js.Any
  ): Predicate = js.native
  def or(property: String, operator: String, value: js.Any): Predicate = js.native
  def or(property: String, operator: String, value: js.Any, valueIsLiteral: Boolean): Predicate = js.native
  def or(property: String, operator: FilterQueryOpSymbol, value: js.Any): Predicate = js.native
  def or(property: String, operator: FilterQueryOpSymbol, value: js.Any, valueIsLiteral: Boolean): Predicate = js.native
}

