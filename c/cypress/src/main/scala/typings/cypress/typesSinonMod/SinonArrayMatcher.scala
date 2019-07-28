package typings.cypress.typesSinonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinonArrayMatcher extends SinonMatcher {
  /**
    * Requires an Array to contain each one of the values the given array has.
    */
  def contains(expected: js.Array[_]): SinonMatcher
  /**
    * Requires an Array to be deep equal another one.
    */
  def deepEquals(expected: js.Array[_]): SinonMatcher
  /**
    * Requires an Array to end with the same values as another one.
    */
  def endsWith(expected: js.Array[_]): SinonMatcher
  /**
    * Requires an Array to start with the same values as another one.
    */
  def startsWith(expected: js.Array[_]): SinonMatcher
}

object SinonArrayMatcher {
  @scala.inline
  def apply(
    and: SinonMatcher => SinonMatcher,
    contains: js.Array[_] => SinonMatcher,
    deepEquals: js.Array[_] => SinonMatcher,
    endsWith: js.Array[_] => SinonMatcher,
    or: SinonMatcher => SinonMatcher,
    startsWith: js.Array[_] => SinonMatcher,
    test: js.Any => Boolean
  ): SinonArrayMatcher = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), contains = js.Any.fromFunction1(contains), deepEquals = js.Any.fromFunction1(deepEquals), endsWith = js.Any.fromFunction1(endsWith), or = js.Any.fromFunction1(or), startsWith = js.Any.fromFunction1(startsWith), test = js.Any.fromFunction1(test))
  
    __obj.asInstanceOf[SinonArrayMatcher]
  }
}

