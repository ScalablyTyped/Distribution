package typings.cypress.typesSinonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SinonSetMatcher
  extends StObject
     with SinonMatcher {
  
  /**
    * Requires a Set to contain each one of the items the given set has.
    */
  def contains(expected: SimplifiedSet): SinonMatcher
  
  /**
    *  Requires a Set to be deep equal another one.
    */
  def deepEquals(expected: SimplifiedSet): SinonMatcher
}
object SinonSetMatcher {
  
  inline def apply(
    and: SinonMatcher => SinonMatcher,
    contains: SimplifiedSet => SinonMatcher,
    deepEquals: SimplifiedSet => SinonMatcher,
    or: SinonMatcher => SinonMatcher,
    test: Any => Boolean
  ): SinonSetMatcher = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), contains = js.Any.fromFunction1(contains), deepEquals = js.Any.fromFunction1(deepEquals), or = js.Any.fromFunction1(or), test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[SinonSetMatcher]
  }
  
  extension [Self <: SinonSetMatcher](x: Self) {
    
    inline def setContains(value: SimplifiedSet => SinonMatcher): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setDeepEquals(value: SimplifiedSet => SinonMatcher): Self = StObject.set(x, "deepEquals", js.Any.fromFunction1(value))
  }
}
