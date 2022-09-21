package typings.chunkedDc.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchersUtil extends StObject {
  
  def buildFailureMessage(matcherName: String, isNot: Boolean, actual: scala.Any, expected: scala.Any*): String = js.native
  
  def contains[T](haystack: String, needle: scala.Any): Boolean = js.native
  def contains[T](haystack: String, needle: scala.Any, customTesters: js.Array[CustomEqualityTester]): Boolean = js.native
  def contains[T](haystack: ArrayLike[T], needle: scala.Any): Boolean = js.native
  def contains[T](haystack: ArrayLike[T], needle: scala.Any, customTesters: js.Array[CustomEqualityTester]): Boolean = js.native
  
  def equals(a: scala.Any, b: scala.Any): Boolean = js.native
  def equals(a: scala.Any, b: scala.Any, customTesters: js.Array[CustomEqualityTester]): Boolean = js.native
}
