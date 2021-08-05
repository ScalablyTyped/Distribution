package typings.chunkedDc.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Calls extends StObject {
  
  /** By chaining the spy with calls.all(), will return the context (the this) and arguments passed all calls **/
  def all(): js.Array[CallInfo]
  
  /** By chaining the spy with calls.allArgs(), will return the arguments to all calls **/
  def allArgs(): js.Array[js.Any]
  
  /** By chaining the spy with calls.any(), will return false if the spy has not been called at all, and then true once at least one call happens. **/
  def any(): Boolean
  
  /** By chaining the spy with calls.argsFor(), will return the arguments passed to call number index **/
  def argsFor(index: Double): js.Array[js.Any]
  
  /** By chaining the spy with calls.count(), will return the number of times the spy was called **/
  def count(): Double
  
  /** By chaining the spy with calls.first(), will return the context (the this) and arguments for the first call **/
  def first(): CallInfo
  
  /** By chaining the spy with calls.mostRecent(), will return the context (the this) and arguments for the most recent call **/
  def mostRecent(): CallInfo
  
  /** By chaining the spy with calls.reset(), will clears all tracking for a spy **/
  def reset(): Unit
}
object Calls {
  
  inline def apply(
    all: () => js.Array[CallInfo],
    allArgs: () => js.Array[js.Any],
    any: () => Boolean,
    argsFor: Double => js.Array[js.Any],
    count: () => Double,
    first: () => CallInfo,
    mostRecent: () => CallInfo,
    reset: () => Unit
  ): Calls = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), allArgs = js.Any.fromFunction0(allArgs), any = js.Any.fromFunction0(any), argsFor = js.Any.fromFunction1(argsFor), count = js.Any.fromFunction0(count), first = js.Any.fromFunction0(first), mostRecent = js.Any.fromFunction0(mostRecent), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[Calls]
  }
  
  extension [Self <: Calls](x: Self) {
    
    inline def setAll(value: () => js.Array[CallInfo]): Self = StObject.set(x, "all", js.Any.fromFunction0(value))
    
    inline def setAllArgs(value: () => js.Array[js.Any]): Self = StObject.set(x, "allArgs", js.Any.fromFunction0(value))
    
    inline def setAny(value: () => Boolean): Self = StObject.set(x, "any", js.Any.fromFunction0(value))
    
    inline def setArgsFor(value: Double => js.Array[js.Any]): Self = StObject.set(x, "argsFor", js.Any.fromFunction1(value))
    
    inline def setCount(value: () => Double): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
    
    inline def setFirst(value: () => CallInfo): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
    
    inline def setMostRecent(value: () => CallInfo): Self = StObject.set(x, "mostRecent", js.Any.fromFunction0(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
  }
}
