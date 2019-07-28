package typings.chaiDashAsDashPromised.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromisedNumericComparison extends js.Object {
  @JSName("above")
  var above_Original: PromisedNumberComparer = js.native
  @JSName("below")
  var below_Original: PromisedNumberComparer = js.native
  @JSName("greaterThan")
  var greaterThan_Original: PromisedNumberComparer = js.native
  @JSName("gt")
  var gt_Original: PromisedNumberComparer = js.native
  @JSName("gte")
  var gte_Original: PromisedNumberComparer = js.native
  @JSName("least")
  var least_Original: PromisedNumberComparer = js.native
  @JSName("lessThan")
  var lessThan_Original: PromisedNumberComparer = js.native
  @JSName("lt")
  var lt_Original: PromisedNumberComparer = js.native
  @JSName("lte")
  var lte_Original: PromisedNumberComparer = js.native
  @JSName("most")
  var most_Original: PromisedNumberComparer = js.native
  def above(value: Double): PromisedAssertion = js.native
  def above(value: Double, message: String): PromisedAssertion = js.native
  def below(value: Double): PromisedAssertion = js.native
  def below(value: Double, message: String): PromisedAssertion = js.native
  def greaterThan(value: Double): PromisedAssertion = js.native
  def greaterThan(value: Double, message: String): PromisedAssertion = js.native
  def gt(value: Double): PromisedAssertion = js.native
  def gt(value: Double, message: String): PromisedAssertion = js.native
  def gte(value: Double): PromisedAssertion = js.native
  def gte(value: Double, message: String): PromisedAssertion = js.native
  def least(value: Double): PromisedAssertion = js.native
  def least(value: Double, message: String): PromisedAssertion = js.native
  def lessThan(value: Double): PromisedAssertion = js.native
  def lessThan(value: Double, message: String): PromisedAssertion = js.native
  def lt(value: Double): PromisedAssertion = js.native
  def lt(value: Double, message: String): PromisedAssertion = js.native
  def lte(value: Double): PromisedAssertion = js.native
  def lte(value: Double, message: String): PromisedAssertion = js.native
  def most(value: Double): PromisedAssertion = js.native
  def most(value: Double, message: String): PromisedAssertion = js.native
  def within(start: Double, finish: Double): PromisedAssertion = js.native
  def within(start: Double, finish: Double, message: String): PromisedAssertion = js.native
}

