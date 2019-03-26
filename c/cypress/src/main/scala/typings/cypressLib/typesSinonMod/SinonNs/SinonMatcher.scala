package typings
package cypressLib.typesSinonMod.SinonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinonMatcher extends js.Object {
  /**
    * All matchers implement and and or. This allows to logically combine mutliple matchers.
    * The result is a new matchers that requires both (and) or one of the matchers (or) to return true.
    * @example var stringOrNumber = sinon.match.string.or(sinon.match.number);
    * var bookWithPages = sinon.match.instanceOf(Book).and(sinon.match.has("pages"));
    */
  def and(expr: SinonMatcher): SinonMatcher
  /**
    * All matchers implement and and or. This allows to logically combine mutliple matchers.
    * The result is a new matchers that requires both (and) or one of the matchers (or) to return true.
    * @example var stringOrNumber = sinon.match.string.or(sinon.match.number);
    * var bookWithPages = sinon.match.instanceOf(Book).and(sinon.match.has("pages"));
    */
  def or(expr: SinonMatcher): SinonMatcher
  def test(`val`: js.Any): scala.Boolean
}

object SinonMatcher {
  @scala.inline
  def apply(and: SinonMatcher => SinonMatcher, or: SinonMatcher => SinonMatcher, test: js.Any => scala.Boolean): SinonMatcher = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), or = js.Any.fromFunction1(or), test = js.Any.fromFunction1(test))
  
    __obj.asInstanceOf[SinonMatcher]
  }
}

