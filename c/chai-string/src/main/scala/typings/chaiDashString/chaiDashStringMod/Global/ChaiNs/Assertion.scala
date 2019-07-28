package typings.chaiDashString.chaiDashStringMod.Global.ChaiNs

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
  def containIgnoreCase(expected: String): Assertion = js.native
  def containIgnoreCase(expected: String, msg: String): Assertion = js.native
  def containIgnoreSpaces(expected: String): Assertion = js.native
  def containIgnoreSpaces(expected: String, msg: String): Assertion = js.native
  def endWith(expected: String): Assertion = js.native
  def endWith(expected: String, message: String): Assertion = js.native
  def endsWith(expected: String): Assertion = js.native
  def endsWith(expected: String, message: String): Assertion = js.native
  def entriesCount(substr: String, expected: Double): Assertion = js.native
  def entriesCount(substr: String, expected: Double, message: String): Assertion = js.native
  def equalIgnoreCase(expected: String): Assertion = js.native
  def equalIgnoreCase(expected: String, message: String): Assertion = js.native
  def equalIgnoreSpaces(expected: String): Assertion = js.native
  def equalIgnoreSpaces(expected: String, message: String): Assertion = js.native
  def indexOf(str: String, substr: String, index: Double): Assertion = js.native
  def indexOf(str: String, substr: String, index: Double, msg: String): Assertion = js.native
  def palindrome(): Assertion = js.native
  def palindrome(message: String): Assertion = js.native
  def reverseOf(): Assertion = js.native
  def reverseOf(message: String): Assertion = js.native
  def singleLine(): Assertion = js.native
  def singleLine(message: String): Assertion = js.native
  def startWith(expected: String): Assertion = js.native
  def startWith(expected: String, message: String): Assertion = js.native
  def startsWith(expected: String): Assertion = js.native
  def startsWith(expected: String, message: String): Assertion = js.native
}

