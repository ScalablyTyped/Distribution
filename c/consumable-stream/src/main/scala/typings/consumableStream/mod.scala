package typings.consumableStream

import typings.std.AsyncIterable
import typings.std.AsyncIterator
import typings.std.IteratorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* note: abstract class */ @JSImport("consumable-stream", JSImport.Namespace)
  @js.native
  open class ^[T] ()
    extends StObject
       with ConsumableStream[T]
  
  @js.native
  trait ConsumableStream[T]
    extends StObject
       with AsyncIterator[T, Any, Unit]
       with AsyncIterable[T] {
    
    def createConsumer(): Consumer[T] = js.native
    def createConsumer(timeout: Double): Consumer[T] = js.native
    
    def next(): js.Promise[IteratorResult[T, Any]] = js.native
    def next(timeout: Double): js.Promise[IteratorResult[T, Any]] = js.native
    
    def once(): js.Promise[T] = js.native
    def once(timeout: Double): js.Promise[T] = js.native
  }
  
  trait Consumer[T] extends StObject {
    
    def next(): js.Promise[IteratorResult[T, Any]]
    
    def `return`(): Unit
  }
  object Consumer {
    
    inline def apply[T](next: () => js.Promise[IteratorResult[T, Any]], `return`: () => Unit): Consumer[T] = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
      __obj.updateDynamic("return")(js.Any.fromFunction0(`return`))
      __obj.asInstanceOf[Consumer[T]]
    }
    
    extension [Self <: Consumer[?], T](x: Self & Consumer[T]) {
      
      inline def setNext(value: () => js.Promise[IteratorResult[T, Any]]): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      inline def setReturn(value: () => Unit): Self = StObject.set(x, "return", js.Any.fromFunction0(value))
    }
  }
}
