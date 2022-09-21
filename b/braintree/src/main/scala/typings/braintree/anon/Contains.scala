package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contains extends StObject {
  
  def contains(input: String): Unit
  
  def endsWith(input: String): Unit
  
  def is(input: String): Unit
  
  def isNot(input: String): Unit
  
  def startsWith(input: String): Unit
}
object Contains {
  
  inline def apply(
    contains: String => Unit,
    endsWith: String => Unit,
    is: String => Unit,
    isNot: String => Unit,
    startsWith: String => Unit
  ): Contains = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), endsWith = js.Any.fromFunction1(endsWith), is = js.Any.fromFunction1(is), isNot = js.Any.fromFunction1(isNot), startsWith = js.Any.fromFunction1(startsWith))
    __obj.asInstanceOf[Contains]
  }
  
  extension [Self <: Contains](x: Self) {
    
    inline def setContains(value: String => Unit): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setEndsWith(value: String => Unit): Self = StObject.set(x, "endsWith", js.Any.fromFunction1(value))
    
    inline def setIs(value: String => Unit): Self = StObject.set(x, "is", js.Any.fromFunction1(value))
    
    inline def setIsNot(value: String => Unit): Self = StObject.set(x, "isNot", js.Any.fromFunction1(value))
    
    inline def setStartsWith(value: String => Unit): Self = StObject.set(x, "startsWith", js.Any.fromFunction1(value))
  }
}
