package typings.cassandraDriver.mod

import typings.cassandraDriver.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object token {
  
  trait Token extends StObject {
    
    def compare(other: Token): Double
    
    def equals(other: Token): Boolean
    
    def getType(): Code
    
    def getValue(): js.Any
  }
  object Token {
    
    inline def apply(compare: Token => Double, equals_ : Token => Boolean, getType: () => Code, getValue: () => js.Any): Token = {
      val __obj = js.Dynamic.literal(compare = js.Any.fromFunction1(compare), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue))
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[Token]
    }
    
    extension [Self <: Token](x: Self) {
      
      inline def setCompare(value: Token => Double): Self = StObject.set(x, "compare", js.Any.fromFunction1(value))
      
      inline def setEquals_(value: Token => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setGetType(value: () => Code): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
      
      inline def setGetValue(value: () => js.Any): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    }
  }
  
  trait TokenRange extends StObject {
    
    def compare(other: TokenRange): Double
    
    def contains(token: Token): Boolean
    
    var end: Token
    
    def equals(other: TokenRange): Boolean
    
    def isEmpty(): Boolean
    
    def isWrappedAround(): Boolean
    
    def splitEvenly(numberOfSplits: Double): js.Array[TokenRange]
    
    var start: Token
    
    def unwrap(): js.Array[TokenRange]
  }
  object TokenRange {
    
    inline def apply(
      compare: TokenRange => Double,
      contains: Token => Boolean,
      end: Token,
      equals_ : TokenRange => Boolean,
      isEmpty: () => Boolean,
      isWrappedAround: () => Boolean,
      splitEvenly: Double => js.Array[TokenRange],
      start: Token,
      unwrap: () => js.Array[TokenRange]
    ): TokenRange = {
      val __obj = js.Dynamic.literal(compare = js.Any.fromFunction1(compare), contains = js.Any.fromFunction1(contains), end = end.asInstanceOf[js.Any], isEmpty = js.Any.fromFunction0(isEmpty), isWrappedAround = js.Any.fromFunction0(isWrappedAround), splitEvenly = js.Any.fromFunction1(splitEvenly), start = start.asInstanceOf[js.Any], unwrap = js.Any.fromFunction0(unwrap))
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[TokenRange]
    }
    
    extension [Self <: TokenRange](x: Self) {
      
      inline def setCompare(value: TokenRange => Double): Self = StObject.set(x, "compare", js.Any.fromFunction1(value))
      
      inline def setContains(value: Token => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      inline def setEnd(value: Token): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEquals_(value: TokenRange => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      inline def setIsWrappedAround(value: () => Boolean): Self = StObject.set(x, "isWrappedAround", js.Any.fromFunction0(value))
      
      inline def setSplitEvenly(value: Double => js.Array[TokenRange]): Self = StObject.set(x, "splitEvenly", js.Any.fromFunction1(value))
      
      inline def setStart(value: Token): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setUnwrap(value: () => js.Array[TokenRange]): Self = StObject.set(x, "unwrap", js.Any.fromFunction0(value))
    }
  }
}
