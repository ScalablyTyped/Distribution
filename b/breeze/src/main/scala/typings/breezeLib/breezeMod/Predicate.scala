package typings
package breezeLib.breezeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("breeze", "Predicate")
@js.native
class Predicate ()
  extends breezeLib.breezeNs.Predicate {
  def this(anArray: breezeLib.breezeNs.IRecursiveArray[
      java.lang.String | scala.Double | breezeLib.breezeNs.FilterQueryOpSymbol | breezeLib.breezeNs.Predicate
    ]) = this()
    // for any/all clauses
  def this(passthru: java.lang.String) = this()
  def this(predicate: breezeLib.breezeNs.Predicate) = this()
  def this(property: java.lang.String, operator: breezeLib.breezeNs.FilterQueryOpSymbol, value: breezeLib.Anon_Value) = this()
  def this(property: java.lang.String, operator: breezeLib.breezeNs.FilterQueryOpSymbol, value: js.Any) = this()
  def this(property: java.lang.String, operator: java.lang.String, value: breezeLib.Anon_Value) = this()
  def this(property: java.lang.String, operator: java.lang.String, value: js.Any) = this()
  def this(property: java.lang.String, filterop: breezeLib.breezeNs.FilterQueryOpSymbol, property2: java.lang.String, filterop2: breezeLib.breezeNs.FilterQueryOpSymbol, value: js.Any) = this()
    // for any/all clauses
  def this(property: java.lang.String, filterop: java.lang.String, property2: java.lang.String, filterop2: java.lang.String, value: js.Any) = this()
}

@JSImport("breeze", "Predicate")
@js.native
object Predicate extends js.Object {
  @JSName("and")
  var and_Original: breezeLib.breezeNs.PredicateMethod = js.native
  @JSName("create")
  var create_Original: breezeLib.breezeNs.PredicateMethod = js.native
  @JSName("or")
  var or_Original: breezeLib.breezeNs.PredicateMethod = js.native
  def and(predicates: breezeLib.breezeNs.Predicate*): breezeLib.breezeNs.Predicate = js.native
  def and(predicates: js.Array[breezeLib.breezeNs.Predicate]): breezeLib.breezeNs.Predicate = js.native
  def and(
    property: java.lang.String,
    filterop: breezeLib.breezeNs.FilterQueryOpSymbol,
    property2: java.lang.String,
    filterop2: breezeLib.breezeNs.FilterQueryOpSymbol,
    value: js.Any
  ): breezeLib.breezeNs.Predicate = js.native
    // for any/all clauses
  def and(
    property: java.lang.String,
    filterop: java.lang.String,
    property2: java.lang.String,
    filterop2: java.lang.String,
    value: js.Any
  ): breezeLib.breezeNs.Predicate = js.native
  def and(property: java.lang.String, operator: breezeLib.breezeNs.FilterQueryOpSymbol, value: js.Any): breezeLib.breezeNs.Predicate = js.native
  def and(
    property: java.lang.String,
    operator: breezeLib.breezeNs.FilterQueryOpSymbol,
    value: js.Any,
    valueIsLiteral: scala.Boolean
  ): breezeLib.breezeNs.Predicate = js.native
  def and(property: java.lang.String, operator: java.lang.String, value: js.Any): breezeLib.breezeNs.Predicate = js.native
  def and(
    property: java.lang.String,
    operator: java.lang.String,
    value: js.Any,
    valueIsLiteral: scala.Boolean
  ): breezeLib.breezeNs.Predicate = js.native
  def create(predicates: breezeLib.breezeNs.Predicate*): breezeLib.breezeNs.Predicate = js.native
  def create(predicates: js.Array[breezeLib.breezeNs.Predicate]): breezeLib.breezeNs.Predicate = js.native
  def create(
    property: java.lang.String,
    filterop: breezeLib.breezeNs.FilterQueryOpSymbol,
    property2: java.lang.String,
    filterop2: breezeLib.breezeNs.FilterQueryOpSymbol,
    value: js.Any
  ): breezeLib.breezeNs.Predicate = js.native
    // for any/all clauses
  def create(
    property: java.lang.String,
    filterop: java.lang.String,
    property2: java.lang.String,
    filterop2: java.lang.String,
    value: js.Any
  ): breezeLib.breezeNs.Predicate = js.native
  def create(property: java.lang.String, operator: breezeLib.breezeNs.FilterQueryOpSymbol, value: js.Any): breezeLib.breezeNs.Predicate = js.native
  def create(
    property: java.lang.String,
    operator: breezeLib.breezeNs.FilterQueryOpSymbol,
    value: js.Any,
    valueIsLiteral: scala.Boolean
  ): breezeLib.breezeNs.Predicate = js.native
  def create(property: java.lang.String, operator: java.lang.String, value: js.Any): breezeLib.breezeNs.Predicate = js.native
  def create(
    property: java.lang.String,
    operator: java.lang.String,
    value: js.Any,
    valueIsLiteral: scala.Boolean
  ): breezeLib.breezeNs.Predicate = js.native
  def isPredicate(o: js.Any): scala.Boolean = js.native
  def not(predicate: breezeLib.breezeNs.Predicate): breezeLib.breezeNs.Predicate = js.native
  def or(predicates: breezeLib.breezeNs.Predicate*): breezeLib.breezeNs.Predicate = js.native
  def or(predicates: js.Array[breezeLib.breezeNs.Predicate]): breezeLib.breezeNs.Predicate = js.native
  def or(
    property: java.lang.String,
    filterop: breezeLib.breezeNs.FilterQueryOpSymbol,
    property2: java.lang.String,
    filterop2: breezeLib.breezeNs.FilterQueryOpSymbol,
    value: js.Any
  ): breezeLib.breezeNs.Predicate = js.native
    // for any/all clauses
  def or(
    property: java.lang.String,
    filterop: java.lang.String,
    property2: java.lang.String,
    filterop2: java.lang.String,
    value: js.Any
  ): breezeLib.breezeNs.Predicate = js.native
  def or(property: java.lang.String, operator: breezeLib.breezeNs.FilterQueryOpSymbol, value: js.Any): breezeLib.breezeNs.Predicate = js.native
  def or(
    property: java.lang.String,
    operator: breezeLib.breezeNs.FilterQueryOpSymbol,
    value: js.Any,
    valueIsLiteral: scala.Boolean
  ): breezeLib.breezeNs.Predicate = js.native
  def or(property: java.lang.String, operator: java.lang.String, value: js.Any): breezeLib.breezeNs.Predicate = js.native
  def or(
    property: java.lang.String,
    operator: java.lang.String,
    value: js.Any,
    valueIsLiteral: scala.Boolean
  ): breezeLib.breezeNs.Predicate = js.native
}

