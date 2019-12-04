package typings.chunkedDashDc.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchersUtil extends js.Object {
  def buildFailureMessage(matcherName: String, isNot: Boolean, actual: js.Any, expected: js.Any*): String = js.native
  def contains[T](haystack: String, needle: js.Any): Boolean = js.native
  def contains[T](haystack: String, needle: js.Any, customTesters: js.Array[CustomEqualityTester]): Boolean = js.native
  def contains[T](haystack: ArrayLike[T], needle: js.Any): Boolean = js.native
  def contains[T](haystack: ArrayLike[T], needle: js.Any, customTesters: js.Array[CustomEqualityTester]): Boolean = js.native
  def equals(a: js.Any, b: js.Any): Boolean = js.native
  def equals(a: js.Any, b: js.Any, customTesters: js.Array[CustomEqualityTester]): Boolean = js.native
}

