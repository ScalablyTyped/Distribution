package typings
package chaiDashStringLib.chaiDashStringMod.Global.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assertion
  extends chaiLib.ChaiNs.LanguageChains
     with chaiLib.ChaiNs.NumericComparison
     with chaiLib.ChaiNs.TypeComparison {
  def containIgnoreCase(expected: java.lang.String): Assertion = js.native
  def containIgnoreCase(expected: java.lang.String, msg: java.lang.String): Assertion = js.native
  def containIgnoreSpaces(expected: java.lang.String): Assertion = js.native
  def containIgnoreSpaces(expected: java.lang.String, msg: java.lang.String): Assertion = js.native
  def endWith(expected: java.lang.String): Assertion = js.native
  def endWith(expected: java.lang.String, message: java.lang.String): Assertion = js.native
  def endsWith(expected: java.lang.String): Assertion = js.native
  def endsWith(expected: java.lang.String, message: java.lang.String): Assertion = js.native
  def entriesCount(substr: java.lang.String, expected: scala.Double): Assertion = js.native
  def entriesCount(substr: java.lang.String, expected: scala.Double, message: java.lang.String): Assertion = js.native
  def equalIgnoreCase(expected: java.lang.String): Assertion = js.native
  def equalIgnoreCase(expected: java.lang.String, message: java.lang.String): Assertion = js.native
  def equalIgnoreSpaces(expected: java.lang.String): Assertion = js.native
  def equalIgnoreSpaces(expected: java.lang.String, message: java.lang.String): Assertion = js.native
  def indexOf(str: java.lang.String, substr: java.lang.String, index: scala.Double): Assertion = js.native
  def indexOf(str: java.lang.String, substr: java.lang.String, index: scala.Double, msg: java.lang.String): Assertion = js.native
  def palindrome(): Assertion = js.native
  def palindrome(message: java.lang.String): Assertion = js.native
  def reverseOf(): Assertion = js.native
  def reverseOf(message: java.lang.String): Assertion = js.native
  def singleLine(): Assertion = js.native
  def singleLine(message: java.lang.String): Assertion = js.native
  def startWith(expected: java.lang.String): Assertion = js.native
  def startWith(expected: java.lang.String, message: java.lang.String): Assertion = js.native
  def startsWith(expected: java.lang.String): Assertion = js.native
  def startsWith(expected: java.lang.String, message: java.lang.String): Assertion = js.native
}

