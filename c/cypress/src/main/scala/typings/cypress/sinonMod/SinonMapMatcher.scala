package typings.cypress.sinonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinonMapMatcher extends SinonMatcher {
  /**
    * Requires a Map to contain each one of the items the given map has.
    */
  def contains(expected: SimplifiedMap): SinonMatcher
  /**
    * Requires a Map to be deep equal another one.
    */
  def deepEquals(expected: SimplifiedMap): SinonMatcher
}

object SinonMapMatcher {
  @scala.inline
  def apply(
    and: SinonMatcher => SinonMatcher,
    contains: SimplifiedMap => SinonMatcher,
    deepEquals: SimplifiedMap => SinonMatcher,
    or: SinonMatcher => SinonMatcher,
    test: js.Any => Boolean
  ): SinonMapMatcher = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), contains = js.Any.fromFunction1(contains), deepEquals = js.Any.fromFunction1(deepEquals), or = js.Any.fromFunction1(or), test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[SinonMapMatcher]
  }
}

