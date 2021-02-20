package typings.consumableStream

import typings.std.AsyncIterable
import typings.std.AsyncIterator
import typings.std.IteratorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("consumable-stream", JSImport.Namespace)
  @js.native
  abstract class ^[T] () extends ConsumableStream[T]
  
  @js.native
  trait ConsumableStream[T]
    extends AsyncIterator[T, js.Any, js.UndefOr[scala.Nothing]]
       with AsyncIterable[T] {
    
    def createConsumable(): AsyncIterable[T] = js.native
    def createConsumable(timeout: Double): AsyncIterable[T] = js.native
    
    def createConsumer(): Consumer[T] = js.native
    def createConsumer(timeout: Double): Consumer[T] = js.native
    
    def next(): js.Promise[IteratorResult[T, _]] = js.native
    def next(timeout: Double): js.Promise[IteratorResult[T, _]] = js.native
    
    def once(): js.Promise[T] = js.native
    def once(timeout: Double): js.Promise[T] = js.native
  }
  
  @js.native
  trait Consumer[T] extends StObject {
    
    def next(): js.Promise[IteratorResult[T, _]] = js.native
    
    def `return`(): Unit = js.native
  }
  object Consumer {
    
    @scala.inline
    def apply[T](next: () => js.Promise[IteratorResult[T, _]], `return`: () => Unit): Consumer[T] = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
      __obj.updateDynamic("return")(js.Any.fromFunction0(`return`))
      __obj.asInstanceOf[Consumer[T]]
    }
    
    @scala.inline
    implicit class ConsumerMutableBuilder[Self <: Consumer[_], T] (val x: Self with Consumer[T]) extends AnyVal {
      
      @scala.inline
      def setNext(value: () => js.Promise[IteratorResult[T, _]]): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReturn(value: () => Unit): Self = StObject.set(x, "return", js.Any.fromFunction0(value))
    }
  }
}
