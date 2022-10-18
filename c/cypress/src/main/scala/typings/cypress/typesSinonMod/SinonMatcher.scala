package typings.cypress.typesSinonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SinonMatcher extends StObject {
  
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
  
  def test(`val`: Any): Boolean
}
object SinonMatcher {
  
  inline def apply(and: SinonMatcher => SinonMatcher, or: SinonMatcher => SinonMatcher, test: Any => Boolean): SinonMatcher = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), or = js.Any.fromFunction1(or), test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[SinonMatcher]
  }
  
  extension [Self <: SinonMatcher](x: Self) {
    
    inline def setAnd(value: SinonMatcher => SinonMatcher): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
    
    inline def setOr(value: SinonMatcher => SinonMatcher): Self = StObject.set(x, "or", js.Any.fromFunction1(value))
    
    inline def setTest(value: Any => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
  }
}
