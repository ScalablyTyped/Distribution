package typings.chaiDashArrays.chaiDashArraysMod.Global.ChaiNs

import typings.chai.ChaiNs.LanguageChains
import typings.chai.ChaiNs.NumericComparison
import typings.chai.ChaiNs.TypeComparison
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assertion
  extends LanguageChains
     with NumericComparison
     with TypeComparison {
  def array(): Assertion = js.native
  def containing(value: js.Any): Assertion = js.native
  def containingAllOf(values: js.Array[_]): Assertion = js.native
  def containingAnyOf(values: js.Array[_]): Assertion = js.native
  def equalTo(arr: js.Array[_]): Assertion = js.native
  def ofSize(size: Double): Assertion = js.native
  def sorted(): Assertion = js.native
}

