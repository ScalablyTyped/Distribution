package typings
package chaiDashArraysLib.chaiDashArraysMod.Global.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assertion
  extends chaiLib.ChaiNs.LanguageChains
     with chaiLib.ChaiNs.NumericComparison
     with chaiLib.ChaiNs.TypeComparison {
  def array(): Assertion = js.native
  def containing(value: js.Any): Assertion = js.native
  def containingAllOf(values: chaiDashArraysLib.chaiDashArraysMod.Global.Array[_]): Assertion = js.native
  def containingAnyOf(values: chaiDashArraysLib.chaiDashArraysMod.Global.Array[_]): Assertion = js.native
  def equalTo(arr: chaiDashArraysLib.chaiDashArraysMod.Global.Array[_]): Assertion = js.native
  def ofSize(size: scala.Double): Assertion = js.native
  def sorted(): Assertion = js.native
}

