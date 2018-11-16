package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PredicateMethod extends js.Object {
  def apply(predicates: Predicate*): Predicate = js.native
  def apply(predicates: js.Array[Predicate]): Predicate = js.native
  def apply(
    property: java.lang.String,
    filterop: FilterQueryOpSymbol,
    property2: java.lang.String,
    filterop2: FilterQueryOpSymbol,
    value: js.Any
  ): Predicate = js.native
    // for any/all clauses
  def apply(
    property: java.lang.String,
    filterop: java.lang.String,
    property2: java.lang.String,
    filterop2: java.lang.String,
    value: js.Any
  ): Predicate = js.native
  def apply(property: java.lang.String, operator: FilterQueryOpSymbol, value: js.Any): Predicate = js.native
  def apply(
    property: java.lang.String,
    operator: FilterQueryOpSymbol,
    value: js.Any,
    valueIsLiteral: scala.Boolean
  ): Predicate = js.native
  def apply(property: java.lang.String, operator: java.lang.String, value: js.Any): Predicate = js.native
  def apply(
    property: java.lang.String,
    operator: java.lang.String,
    value: js.Any,
    valueIsLiteral: scala.Boolean
  ): Predicate = js.native
}

