package typings.consumableStream

import typings.std.AsyncIterable
import typings.std.AsyncIterator
import typings.std.IteratorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("consumable-stream", JSImport.Namespace)
  @js.native
  abstract class ^[T] ()
    extends StObject
       with ConsumableStream[T]
  
  @js.native
  trait ConsumableStream[T]
    extends StObject
       with AsyncIterator[T, js.Any, Unit]
       with AsyncIterable[T] {
    
    def createConsumable(): AsyncIterable[T] = js.native
    def createConsumable(timeout: Double): AsyncIterable[T] = js.native
    
    def createConsumer(): Consumer[T] = js.native
    def createConsumer(timeout: Double): Consumer[T] = js.native
    
    def next(): js.Promise[IteratorResult[T, js.Any]] = js.native
    def next(timeout: Double): js.Promise[IteratorResult[T, js.Any]] = js.native
    
    def once(): js.Promise[T] = js.native
    def once(timeout: Double): js.Promise[T] = js.native
  }
  
  trait Consumer[T] extends StObject {
    
    def next(): js.Promise[IteratorResult[T, js.Any]]
    
    def `return`(): Unit
  }
  object Consumer {
    
    @scala.inline
    def apply[T](next: () => js.Promise[IteratorResult[T, js.Any]], `return`: () => Unit): Consumer[T] = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
      __obj.updateDynamic("return")(js.Any.fromFunction0(`return`))
      __obj.asInstanceOf[Consumer[T]]
    }
    
    @scala.inline
    implicit class ConsumerMutableBuilder[Self <: Consumer[?], T] (val x: Self & Consumer[T]) extends AnyVal {
      
      @scala.inline
      def setNext(value: () => js.Promise[IteratorResult[T, js.Any]]): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReturn(value: () => Unit): Self = StObject.set(x, "return", js.Any.fromFunction0(value))
    }
  }
}
