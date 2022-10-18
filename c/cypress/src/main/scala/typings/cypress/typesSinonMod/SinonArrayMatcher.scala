package typings.cypress.typesSinonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SinonArrayMatcher
  extends StObject
     with SinonMatcher {
  
  /**
    * Requires an Array to contain each one of the values the given array has.
    */
  def contains(expected: js.Array[Any]): SinonMatcher
  
  /**
    * Requires an Array to be deep equal another one.
    */
  def deepEquals(expected: js.Array[Any]): SinonMatcher
  
  /**
    * Requires an Array to end with the same values as another one.
    */
  def endsWith(expected: js.Array[Any]): SinonMatcher
  
  /**
    * Requires an Array to start with the same values as another one.
    */
  def startsWith(expected: js.Array[Any]): SinonMatcher
}
object SinonArrayMatcher {
  
  inline def apply(
    and: SinonMatcher => SinonMatcher,
    contains: js.Array[Any] => SinonMatcher,
    deepEquals: js.Array[Any] => SinonMatcher,
    endsWith: js.Array[Any] => SinonMatcher,
    or: SinonMatcher => SinonMatcher,
    startsWith: js.Array[Any] => SinonMatcher,
    test: Any => Boolean
  ): SinonArrayMatcher = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), contains = js.Any.fromFunction1(contains), deepEquals = js.Any.fromFunction1(deepEquals), endsWith = js.Any.fromFunction1(endsWith), or = js.Any.fromFunction1(or), startsWith = js.Any.fromFunction1(startsWith), test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[SinonArrayMatcher]
  }
  
  extension [Self <: SinonArrayMatcher](x: Self) {
    
    inline def setContains(value: js.Array[Any] => SinonMatcher): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setDeepEquals(value: js.Array[Any] => SinonMatcher): Self = StObject.set(x, "deepEquals", js.Any.fromFunction1(value))
    
    inline def setEndsWith(value: js.Array[Any] => SinonMatcher): Self = StObject.set(x, "endsWith", js.Any.fromFunction1(value))
    
    inline def setStartsWith(value: js.Array[Any] => SinonMatcher): Self = StObject.set(x, "startsWith", js.Any.fromFunction1(value))
  }
}
