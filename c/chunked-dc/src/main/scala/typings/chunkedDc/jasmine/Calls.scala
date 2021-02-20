package typings.chunkedDc.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Calls extends StObject {
  
  /** By chaining the spy with calls.all(), will return the context (the this) and arguments passed all calls **/
  def all(): js.Array[CallInfo] = js.native
  
  /** By chaining the spy with calls.allArgs(), will return the arguments to all calls **/
  def allArgs(): js.Array[_] = js.native
  
  /** By chaining the spy with calls.any(), will return false if the spy has not been called at all, and then true once at least one call happens. **/
  def any(): Boolean = js.native
  
  /** By chaining the spy with calls.argsFor(), will return the arguments passed to call number index **/
  def argsFor(index: Double): js.Array[_] = js.native
  
  /** By chaining the spy with calls.count(), will return the number of times the spy was called **/
  def count(): Double = js.native
  
  /** By chaining the spy with calls.first(), will return the context (the this) and arguments for the first call **/
  def first(): CallInfo = js.native
  
  /** By chaining the spy with calls.mostRecent(), will return the context (the this) and arguments for the most recent call **/
  def mostRecent(): CallInfo = js.native
  
  /** By chaining the spy with calls.reset(), will clears all tracking for a spy **/
  def reset(): Unit = js.native
}
object Calls {
  
  @scala.inline
  def apply(
    all: () => js.Array[CallInfo],
    allArgs: () => js.Array[_],
    any: () => Boolean,
    argsFor: Double => js.Array[_],
    count: () => Double,
    first: () => CallInfo,
    mostRecent: () => CallInfo,
    reset: () => Unit
  ): Calls = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), allArgs = js.Any.fromFunction0(allArgs), any = js.Any.fromFunction0(any), argsFor = js.Any.fromFunction1(argsFor), count = js.Any.fromFunction0(count), first = js.Any.fromFunction0(first), mostRecent = js.Any.fromFunction0(mostRecent), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[Calls]
  }
  
  @scala.inline
  implicit class CallsMutableBuilder[Self <: Calls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: () => js.Array[CallInfo]): Self = StObject.set(x, "all", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAllArgs(value: () => js.Array[_]): Self = StObject.set(x, "allArgs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAny(value: () => Boolean): Self = StObject.set(x, "any", js.Any.fromFunction0(value))
    
    @scala.inline
    def setArgsFor(value: Double => js.Array[_]): Self = StObject.set(x, "argsFor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCount(value: () => Double): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFirst(value: () => CallInfo): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMostRecent(value: () => CallInfo): Self = StObject.set(x, "mostRecent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
  }
}
